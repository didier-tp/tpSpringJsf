package com.sopra.web.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TvaBean {
	
	private Double ht;
	private Double taux;//en  %
	private Double tva;
	private Double ttc;
	
	public TvaBean(){
		super();
	}
	public String calculer(){
		String suite=null;
		tva = ht * (taux / 100);
		ttc=tva+ht;
		return suite;
	}

	public Double getHt() {
		return ht;
	}

	public void setHt(Double ht) {
		this.ht = ht;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

	public Double getTva() {
		return tva;
	}

	public Double getTtc() {
		return ttc;
	}

	
	
	

}
