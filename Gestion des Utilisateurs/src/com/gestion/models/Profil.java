package com.gestion.models;



public class Profil {
	private int id;
	private int code;
	private String libelle;
	
	
	public Profil(int id, int code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}

	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
