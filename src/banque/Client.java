package banque;



public class Client {

	private int id_client;
	private String nom;
	private String prénom;
	private String adresse;
	public Compte compte;

// constructeur par defaut 
	public Client() {

	}
	
	
	// constructeur par explicite  
	public Client(int id_cleint, String nom, String prénom, String adresse) {
		super();
		this.id_client = id_cleint;
		this.nom = nom;
		this.prénom = prénom;
		this.adresse = adresse;
		
	}
	public Client(int id_cleint, String nom, String prénom, String adresse, Compte compte) {
		super();
		this.id_client = id_cleint;
		this.nom = nom;
		this.prénom = prénom;
		this.adresse = adresse;
		this.compte=compte;
		
	}
	
	
	public Compte getCompte() {
		return compte;
	}
	
	


	// ste pour manipiler 
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
// get pour afficher 
	public int getId_client() {
		return id_client;
	}

	public void setId_cleint(int id_cleint) {
		this.id_client = id_cleint;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
// methode pour afficher les objets 


	@Override
	public String toString() {
		return "Client : id_cleint=" + id_client + ", nom= " + nom + ", prénom= " + prénom + ", adresse= " + adresse ;
	}
	
}
