package banque;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		// Objet sans paramètres
		Client client= new Client();
		Compte c= new Compte();
		Banque b= new Banque();
		
		
		// instancier objet client
		
		Client client1= new Client(1,"DUDPON", "David"," 64 rue Louis Ravs3400 Montpellier");
		Client client2= new Client(2,"DUBOIS", "Lionel"," 18 rue Lon Blanc 3400 Montpellier");
		Client client3= new Client(3,"DAMIEN", "Paul","20 rue Hervé 3400 Montpellier");
		
		System.out.println("*********************************** 2) Affichage les Clients **************************************************************** "+"\n");
	    System.out.println(client1);
	    System.out.println(client2);
	    System.out.println(client3);
		
		// instancier objet compte
		Compte c1= new Compte(1,200.25,client1);
		Compte c2= new Compte(2,300.75, client2);
		Compte c3= new Compte(3,-30.50, client3);
		
		
		// affectation des  Compte  aux objet Clients
				client1.setCompte(c1);
				client2.setCompte(c2);
				client3.setCompte(c3);
				
				
		/*
		 * // affectation des  clients  aux objet comptes 
		
		c1.setClient(client1);
		c2.setClient(client2);
		c3.setClient(client3);
		*/
	/*	
	System.out.println("******** 2) Affichage les Clients **************************************************************** "+"\n");
    System.out.println(client1);
    System.out.println(client2);
    System.out.println(client3);
	*/	
		
		System.out.println("\n");
		System.out.println("*******************************4) Affichage les comptes ********************************************************************"+"\n");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		/*c1.deposer(200);
		
		System.out.println(c1);
       c1.retirer(50.25);
		c1.virer(250, c3);
		System.out.println(c1);
		System.out.println(c3);
		*/
		// creation de  la banque et ajoute les comptes 
		
		Banque banque = new Banque (1, "lcl","20 boulvar victo higo 34000 Montpellier","450") ; 
	List<Compte> comptes= new ArrayList() {{
			 add(c1);
			 add(c2);
			 add(c3);
			}};
			System.out.println("\n");
			
			
			//Ajouter les comptes à la banque 
			
			banque.setComptes(comptes);
			
			
			
			//System.out.println(banque);
			
			System.out.println("\n");
			System.out.println("***************************************** 6) Affichage les comptes contenus dans la banque**********************"+"\n");
			
			banque.afficherListes();
	
			System.out.println("\n");
			System.out.println("****************************************7) Affichage le comptes chercher par le nom *************************************"+"\n");
			
		    c1.rechercherParnom("DUDPON");
		    System.out.println("\n");
		    //Retirer la somme de 100 euros du compte du premier client de 100 euros
		    
		    c1.retirer(100.00);
		    System.out.println("\n");
		    //Effectuer un virement d’un compte à un autre
		    
		    c2.virer(150.00, c3);
		    
		    System.out.println("\n");
		    System.out.println("***************************************10) Afficher la liste de tous les comptes contenus dans la banque après les opérations********** ************"+"\n");
		    banque.afficherListes();
		    String x= "125";
		    
		    System.out.println ( x);

	}
	
	

}
