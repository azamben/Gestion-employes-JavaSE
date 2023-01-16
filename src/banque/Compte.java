package banque;

public class Compte {
	private int id_compte;
	private double solde;
	public  Client client;
	public Banque banque;

	public Compte() {

	}
// Construteur1
	public Compte(int id_compte, double solde) {
	
		this.id_compte = id_compte;
		this.solde = solde;
	}
		
	// Construteur2
		public Compte(int id_compte, double solde, Client client) {
	
			this.id_compte = id_compte;
			this.solde = solde;
			this.client = client;
		}
	// Construteur3
	public Compte(int id_compte, double solde, Client client , Banque banque) {
		this.id_compte = id_compte;
		this.solde = solde;
		this.client = client;
		this.banque = banque;
	}
	
	// les methode sur le compte 
	
	// pour faire un dépôt sur le compte.
	
	public void deposer(double  argent) {
		solde+=argent;
		//System.out.println("le montant dépose est de : "+ argent);	
	}
	// pour faire un retrait sur le compte
	
   public void   retirer(double  som) {
	   if(solde >= som) {
	   solde-=som;
	System.out.println("le montant retiré est de : "+ som + " le solde après le retrait : "+ solde+ " euros");
	
	} else 
		System.out.println("Impossible d'effectuer l'opération. Solde insuffisant !");
}
   
// pour faire un virement entre 2 comptes

public void virer(double val, Compte destinataire) {
    retirer(val);
    destinataire.deposer(val);
    System.out.println("le montant viré  est de : "+val+" euros"+"\n le solde après le virement sur l'autre compte  : "+ destinataire.solde+ " euros");

}

//  affichage un compte par le nom de client

public void afficherCompte() {
	
		System.out.println(" =======================  Menu  =================================");
		System.out.println(" ============ Numéro du compte: "+id_compte+" ===============================" );
		System.out.println(" ============== Nom du client:e: "+client.getNom()+" =========================" );
		System.out.println(" ============== Solde : "+ solde+" euros ===============================" );
	
		
}




	// Recheche et affichage un compte par le nom de client 
 public void rechercherParnom( String nom) {
	if( client.getNom().equals(nom)) {
		System.out.println("le compte appartie à : "+ nom);
		afficherCompte();
		
	} else 
		System.out.println("ce compte n'appartien pas  à : "+ nom);
 }
	
	
	
	public int getId_compte() {
		return id_compte;
	}
	public void setId_compte(int id_compte) {
		this.id_compte = id_compte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Banque getBanque() {
		return banque;
	}
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	@Override
	
	
	
	
	
	
	public String toString() {
		return "Compte: id_compte=" + id_compte + ", solde= " + solde + ", client= " + client.getId_client() + " ,"+ client.getNom()+ ","
	+ client.getPrénom()/*+ banque.getId_banque()+","+ banque.getNom()+","+ banque.getNumeroAgence()*/;
	}

	
	

}

