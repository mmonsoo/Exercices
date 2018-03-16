 package mmonsoor.com;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Première version
 * @author Monsoor
 * @version 0.0.1
 *
 */

public class Informations {

	
	public static void main(String[] args) {
		
		
		Scanner clavier= new Scanner(System.in);
		String nom;
		String prenom;
		String age;
		String date_naissance;
		
		String nom2;
		String prenom2;
		String age2;
		String date_naissance2;
		
		// Je tape au clavier  
		System.out.println("Informations de la première personne");
		System.out.println("Taper votre Nom de famille");
		nom=clavier.nextLine();
		System.out.println("Taper votre prénom");
		prenom=clavier.nextLine();
		System.out.println("Taper votre âge");
		age=clavier.nextLine();
		
		System.out.println("Taper votre date de naissance sous format JJ/MM/AAAA");
		date_naissance=clavier.nextLine();
		String pattern = "MM/dd/yyyy";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
		      Date date = format.parse(date_naissance);
		      format.isLenient();
		      System.out.println(date);
		    } catch (ParseException e) {
		    	
		    
		    System.out.println("Votre format de date n'est pas bon, veuillez retaper votre date de naissance sous formzt JJ/MM/AAAA");
		      e.printStackTrace();
		      date_naissance=clavier.nextLine();
		    }
		
		
		//deuxième personne
		System.out.println("Informations de la deuxième personne");
		System.out.println("Taper votre Nom de famille");
		nom2=clavier.nextLine();
		System.out.println("Taper votre prénom");
		prenom2=clavier.nextLine();
		System.out.println("Taper votre âge");
		age2=clavier.nextLine();
		
		System.out.println("Taper votre date de naissance sous format JJ/MM/AAAA");
		date_naissance2=clavier.nextLine();
		try {
		      Date date = format.parse(date_naissance2);
		      System.out.println(date);
		    } catch (ParseException e) {
		    System.out.println("Votre format de date n'est pas bon");
		      e.printStackTrace();
		    }
		
		//On stocke dans un tableau d'objets 2D
		Object [][] tabInformations= {{nom,prenom,Short.parseShort(age),date_naissance},{nom2,prenom2,Short.parseShort(age2),date_naissance2}};
		
	
	
		
		for(int p=0;p<tabInformations.length;p++) {
			
			for (int d=0;d<tabInformations[p].length;d++) {
				System.out.println(tabInformations[p][d]);
				if((p==0&&d==2)||(p==1&&d==2)) {
					
					if ((short)tabInformations[p][d]<18 ) {
						System.out.println("Vous êtes mineur");
					}
					else {
						System.out.println("Vous êtes majeur");
					}
					
					
				}			
				//System.out.println(tabInformations[p][d]);		
			}
		}
		
		
		
		
		
		
		
		
		
		/*
		short nbpersonne=2;
		for(int index=1;index<=nbpersonne;index++) {
			AfficheInformation (index);	
		}
		*/
	}
	
	
//Deuxième personne
	
	/*
	private static void AfficheInformation (int personne) {
		
		Scanner clavier= new Scanner(System.in);
		String nom;
		String prenom;
		String age;
		String date_naissance;
		
		// Je tape au clavier  
		System.out.println("Informations de la personne numéro "+personne+"\n");
		System.out.println("Taper votre Nom de famille");
		nom=clavier.nextLine();
		System.out.println("Taper votre prénom");
		prenom=clavier.nextLine();
		System.out.println("Taper votre âge");
		age=clavier.nextLine();
		
		System.out.println("Taper votre date de naissance sous format JJ/MM/AAAA");
		date_naissance=clavier.nextLine();
		
		//Option tableau 1d
		/*
		Object [] tabInformations= new Object[]{
			nom,
			prenom,
			Short.parseShort(age),
			date_naissance };			
        */
		/*
		Object [][] tabInformations= {{nom,prenom,Short.parseShort(age),date_naissance},{}};
 	for (int i=0;i<tabInformations.length;i++) {
		System.out.println(tabInformations[i]);
	}
	
	if (Short.parseShort(age)>18) {
		System.out.println("Vous êtes majeur");
	}
	else {
		System.out.println("Vous n'êtes pas majeur\n");
	}
	
		}
		*/
	
	
	
	
}
