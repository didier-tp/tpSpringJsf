package com.sopra.web.mbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sopra.resa.model.Client;
import com.sopra.resa.service.ServiceClient;

//@ManagedBean
//@SessionScoped
@Component()//equivalent spring de @ManagedBean
@Scope("session") //equivalent spring de @SessionScoped
public class LoginBean {
	//à saisir dans login.jsp (avec JSF)
	private String username;
	private String password;
	
	//référence vers "Service métier Spring"
	//(liaison automatique via injection de dépendance):
	//@ManagedProperty(value="#{serviceClientImpl}") 
	//@ManagedProperty (de JSF) paramètre une injection de 
	//dépendance et necessite get/set
	
	@Autowired
	private ServiceClient serviceClient;
	
	private String message;
	
	private List<Client> listeCli;//+get/set
	
	public String login(){
		String suite=null;
		listeCli = 
		  serviceClient.findClientByName(this.username);
		
		if(password.equals("pwd"+username)){
			message="utilisateur connecté";
			suite = "menuClient";
			//menuClient.jsp (ou .xhtml)
			//= menu pour client authentifié 
		}else {
			message = "mauvais mot de passe ou ...";
		}
		return suite;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ServiceClient getServiceClient() {
		return serviceClient;
	}
	
	

	public List<Client> getListeCli() {
		return listeCli;
	}

	public void setListeCli(List<Client> listeCli) {
		this.listeCli = listeCli;
	}

	public void setServiceClient(ServiceClient serviceClient) {
		this.serviceClient = serviceClient;
	}
	
	
	
	
}
