package com.gestion.models;



public class Utilisateur extends Personne{
	
	private String login;
	private String password;
	private String service;
	Profil profile;

	public Utilisateur(int matricule, String nom, String prenom, String email, int telephone, double salaire, String login,
			String password, String service) {
		super(matricule, nom, prenom, email, telephone, salaire);
		this.login = login;
		this.password = password;
		this.service = service;

		
	}
	
	@Override
	public double calculerSalaire() {
		
		switch(service){
			case "MN":
				double newsal = getSalaire() + getSalaire()*8/100;
				setSalaire(newsal);
				return getSalaire();
			
			case "DG":
				newsal = getSalaire() + getSalaire()*15/100;
				setSalaire(newsal);
				return getSalaire();
			
				
		default:
					return getSalaire();
		}
		
	}
	
	 	

	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}
	
	public void addUser() {
		
	}

	@Override
	public String toString() {
		return super.toString() + "\n \t login=" + login + ", \n \t password=" + password + ", \n \t service=" + service + ", \n \t profile="
				+ profile ;
	}

	
	
	
}
