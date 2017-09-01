package com.sopra.web.mbean;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sopra.resa.model.Localite;
import com.sopra.resa.model.Vol;
import com.sopra.resa.service.ServiceVols;

//@ManagedBean
@Component()
//@ResquestScoped
@Scope("request")
public class VolBean {
	
	private Date dateDepart;//à saisir
	
	 //pour remplir liste deroulante:
	private List<Localite> listeLocalites;
	
	//selection depuis liste deroulante:
	private String villeChoisie;//ou idLocChoisie
	
	private List<Vol> listeVols;
	
	@Autowired
	private ServiceVols serviceVols; //service Spring

	public String recupVols(){
		String suite=null;
		listeVols = 
				serviceVols.rechercherVolsAuDepart(
						villeChoisie, dateDepart);
		return suite;
	}
	
	
	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public List<Localite> getListeLocalites() {
		return listeLocalites;
	}

	public void setListeLocalites(List<Localite> listeLocalites) {
		this.listeLocalites = listeLocalites;
	}

	public String getVilleChoisie() {
		return villeChoisie;
	}

	public void setVilleChoisie(String villeChoisie) {
		this.villeChoisie = villeChoisie;
	}

	public List<Vol> getListeVols() {
		return listeVols;
	}

	public void setListeVols(List<Vol> listeVols) {
		this.listeVols = listeVols;
	}

	public ServiceVols getServiceVols() {
		return serviceVols;
	}

	public void setServiceVols(ServiceVols serviceVols) {
		this.serviceVols = serviceVols;
	}
	
	

}
