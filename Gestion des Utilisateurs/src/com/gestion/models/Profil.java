package com.gestion.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Profil {
	private static final AtomicInteger count = new AtomicInteger(0);
	private int id;
	private int code;
	private String libelle;
	
	
	public Profil(int code, String libelle) {
		super();
		this.id = count.incrementAndGet();
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
