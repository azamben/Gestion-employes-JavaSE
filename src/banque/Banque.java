package banque;

import java.util.ArrayList;
import java.util.List;

public class Banque {
	private int id_banque;
	private String nom;
	private String adresse;
	private String numeroAgence;
	public List<Compte> comptes = new ArrayList<Compte>();
	

	public Banque() {
		super();
	}

	// creation de conscteur avec tous les attribus sans comptes 
	public Banque(int id_banque, String nom, String adresse, String numeroAgence) {
		super();
		this.id_banque = id_banque;
		this.nom = nom;
		this.adresse = adresse;
		this.numeroAgence = numeroAgence;
	}

	// creation de conscteur avec tous les attribus 

	public Banque(int id_banque, String nom, String adresse, String numeroAgence, List<Compte> comptes) {

		this.id_banque = id_banque;
		this.nom = nom;
		this.adresse = adresse;
		this.numeroAgence = numeroAgence;
		this.comptes = comptes;
	}

	// afficher  la listes des comptes 
	
	public void afficherListes(){
		for( Compte comp: comptes) {
			System.out.println(comp);
			
		}
		
	}
	
	public void recherche(ArrayList<Client> list, String nom) {
		for (Client c:list) {
			if(nom.equals(c.getNom())){
				
				System.out.println("le compte de : "+ c.getNom()+ c.getCompte());
			}
		}
		
	}
	
	public int getId_banque() {
		return id_banque;
	}

	public void setId_banque(int id_banque) {
		this.id_banque = id_banque;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumeroAgence() {
		return numeroAgence;
	}

	public void setNumeroAgence(String numeroAgence) {
		this.numeroAgence = numeroAgence;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public void creerCompte() {
		Compte c1 = new Compte();

	}

	public void afficherListesTousComptes(List<Compte> comptes) {
		for (int i = 0; i < comptes.size(); ++i) {
			System.out.println(comptes.get(i));
		}

	}


	@Override
	public String toString() {
		return "Banque [id_banque=" + id_banque + ", nom=" + nom + ", adresse=" + adresse + ", numeroAgence="
				+ numeroAgence + ", comptes=" + comptes + "]";
	}

}
