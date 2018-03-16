package mmonsoor.com;

import java.util.Scanner;

/**
 * 
 * @author Monsoor
 * @param claviercopie de type Scanner
 * @return Pr�nom de l'utilisateur
 *
 */

public class Correction_Informations {
	
	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		
		String nom,prenom;
		Byte dateDeNaissance;
		Object[][]informationUtilisateur=new Object [2][3];
		Object[][] resul = null;
		
		// Boucle pour le nombre d'utilisateurs
		for(int utili=0;utili<2;utili++) {
			prenom=recupererPrenom(clavier);
			nom=recupererNom(clavier);
			dateDeNaissance=recupererAge(clavier);
			resul=constructionTableau(utili,prenom,nom,dateDeNaissance,informationUtilisateur);
		}
		
		// Affichage des �l�ments du tableau construit
		
			for(int p=0;p<resul.length;p++) {
			
				for (int d=0;d<resul[p].length;d++) {
					
					System.out.println(resul[p][d]);	
				}
			}
		
		
	}
	
	private static Object[][] constructionTableau(int utili, String prenom, String nom, Byte dateDeNaissance,
			Object[][] informationUtilisateur) {
		// TODO Auto-generated method stub
			informationUtilisateur[utili][0]=prenom;
			informationUtilisateur[utili][1]=nom;
			informationUtilisateur[utili][2]=dateDeNaissance;	
	
		return informationUtilisateur;
	}


	/**
	 * 
	 * @author Monsoor
	 * @param claviercopie de type Scanner
	 * @return Pr�nom de l'utilisateur
	 *
	 */
	
	static String recupererPrenom(Scanner claviercopie) {
		//V�rifier qu'un pr�nom est bien �crit
		boolean verificateur= false;
		String firstName;
		//On doit au moins rentrer une fois dans la boucle
		do {
			System.out.println("Entrer votre pr�nom: ");
			firstName=claviercopie.nextLine();
			verificateur=firstName.chars().allMatch(Character::isLetter);
			if((firstName.length()>=3) && (verificateur==true)) {
				System.out.println("Votre pr�nom est correcte");
				verificateur=true;
			}
			else {
				System.out.println("Votre pr�nom est PAS correcte");
				verificateur=false;
			}
			
		}
		while(verificateur!=true);
		
		return firstName;
		
	}
	
	
	/**
	 * 
	 * @author Monsoor
	 * @param claviercopie de type Scanner
	 * @return Nom de l'utilisateur
	 *
	 */
	
	

	static String recupererNom(Scanner claviercopie) {
		//V�rifier qu'un nom est bien �crit
		boolean verificateur= false;
		String lastName;
		//On doit au moins rentrer une fois dans la boucle
		do {
			System.out.println("Entrer votre nom: ");
			lastName=claviercopie.nextLine();
			verificateur=lastName.chars().allMatch(Character::isLetter);
			if((lastName.length()>=3) && (verificateur==true)) {
				System.out.println("Votre nom est correcte");
				verificateur=true;
			}
			else {
				System.out.println("Votre nom est PAS correcte");
				verificateur=false;
			}
			
		}
		while(verificateur!=true);
		
		return lastName;
		
	}
	
	
	
	
	static Byte recupererAge(Scanner claviercopie) {
		String agee;
		String [] ageetab;
		//On doit au moins rentrer une fois dans la boucle
	
			System.out.println("Entrer votre date de naissance sous format JJ/MM/AAAA : ");
			agee=claviercopie.nextLine();
			ageetab=agee.split("/");
			System.out.println(ageetab[2]);
			if((2018-Short.parseShort(ageetab[2]))>18) {
				System.out.println("Vous �tes majeur");
			}
			else {
				System.out.println("Vous �tes mineur");
			}
		return (byte) (2018-Short.parseShort(ageetab[2]));
		
	}
	
	
	
	

}
