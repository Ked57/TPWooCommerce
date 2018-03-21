package commerce.catalogue.service;

import java.util.ArrayList;

import commerce.catalogue.domaine.modele.User;

public class UserManager {

	private ArrayList<User> users;

	public UserManager() {
		users = new ArrayList<>();
	}

	public void addUser(String passw, String email, String nom, String prenom, String adresse, String telephone) {
		if (this.getUser(email) == null) {
			int id = users.size();
			users.add(new User(id, email, passw, nom, prenom, adresse, telephone));
		}		
	}

	public void removeUser(User user) {
		if (user != null) {
			users.remove(user);
		}
	}

	public void removeUser(int id) {
		if (id > 0) {
			users.remove(getUser(id));
		}
	}

	public User getUser(int id) {
		if (id > 0) {
			for (User u : users) {
				if (u.getId() == id)
					return u;
			}
		}
		return null;
	}

	public User getUser(String email) {
		if (email.length() > 0) {
			for (User u : users) {
				if (u.getEmail().equalsIgnoreCase(email))
					return u;
			}
		}
		return null;
	}
	
	public boolean idExists(int id) {
		if(getUser(id) != null) return true;
		else return false;
	}
	
	public boolean emailExists(String email) {
		if(getUser(email) != null) return true;
		else return false;
	}

	public ArrayList<User> getUsers() {
		return users;
	}
}
