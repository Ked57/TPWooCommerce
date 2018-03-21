package commerce.catalogue.domaine.modele;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.DiscriminatorValue;


@Entity (name="commerce.catalogue.domaine.modele.Utilisateur")
public class User {
	private int id;
	private String passw,email,nom,prenom,adresse,telephone;
	
	public User(int id, String email, String passw, String nom, String prenom, String adresse, String telephone) {
		this.id = id;
		this.email = email;
		this.passw = passw;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	@Id
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id = Id;
	}
	@Basic
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Basic
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	@Basic
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Basic
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Basic
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Basic
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
}
