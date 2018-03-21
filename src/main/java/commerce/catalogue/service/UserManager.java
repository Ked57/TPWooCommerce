package commerce.catalogue.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
	
	public boolean checkPassw(User user, String passw) {
        if(passw.equals(user.getPassw())) return true;
        return false;
	}
	
	public String connect(User user) {
		Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMdd");
        String datetime = ft.format(dNow);
        user.setToken(datetime+user.getId());
        return user.getToken();
	}
	
	public boolean isConnected(String token) {
		String id = token.substring(6, token.length()-1);
		String dateTime = token.substring(0,6);
		System.out.println("isConnected: user id is "+id+" et datetime is "+dateTime);
		
		Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMdd");
        String nowdatetime = ft.format(dNow);
        
        if(Integer.parseInt(nowdatetime) - Integer.parseInt(dateTime) < 100 && this.idExists(Integer.parseInt(id))) {
        	return true;
        }else return false;
	}
}
