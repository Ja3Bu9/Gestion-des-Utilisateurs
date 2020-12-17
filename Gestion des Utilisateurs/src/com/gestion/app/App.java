package com.gestion.app;
import java.util.ArrayList;


import com.gestion.models.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Profil> profilList = new ArrayList<Profil>();
		ArrayList<String> serviceslList = new ArrayList<String>();
		ArrayList<Utilisateur> listUsers = new ArrayList<Utilisateur>();
		ArrayList<Double> listSalaires = new ArrayList<Double>();
		
		Profil p1 = new Profil(1,1234,"MN");
		Profil p2 = new Profil(2,1234,"CP");
		Profil p3 = new Profil(3,1234,"DP");
		Profil p4 = new Profil(4,1234,"DG");
		Profil p5 = new Profil(5,1234,"DRH");
		

		
		Utilisateur user1 = new Utilisateur(22,"test","test2","test@test.com",06123345,1200.0,"test","test",p1.getLibelle());
		listSalaires.add(user1.getSalaire());
		Utilisateur user2 = new Utilisateur(23,"test","test2","test@test.com",06123345,1300.0,"test","test",p2.getLibelle());
		listSalaires.add(user2.getSalaire());
		Utilisateur user3 = new Utilisateur(24,"test","test2","test@test.com",06123345,1400.0,"test","test",p3.getLibelle());
		listSalaires.add(user3.getSalaire());
		Utilisateur user4 = new Utilisateur(25,"test","test2","test@test.com",06123345,1500.0,"test","test",p4.getLibelle());
		listSalaires.add(user4.getSalaire());
		Utilisateur user5 = new Utilisateur(26,"test","test2","test@test.com",06123345,1600.0,"test","test",p5.getLibelle());
		listSalaires.add(user5.getSalaire());
		
		listUsers.add(user1);
		listUsers.add(user2);
		listUsers.add(user3);
		listUsers.add(user4);
		listUsers.add(user5);
		
		System.out.println("Liste des Utilisateurs : ");
		for (int i = 0 ; i<listUsers.size(); i++) {
			listUsers.get(i).calculerSalaire();
			System.out.println(listUsers.get(i).toString() +" \n \t Salaire de base : " + listSalaires.get(i) );
		}
		
		
		System.out.println(" \n Liste des managers : ");
        for(int i=0; i<listUsers.size(); i++)
        {
            if(listUsers.get(i).getService().equals("MN"))
            {
                System.out.println(listUsers.get(i).toString());
            }
        }
		
		
		
		
	}

}
