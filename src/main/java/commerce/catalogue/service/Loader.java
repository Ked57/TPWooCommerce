/**
 * Title:        commerce
 * Description:  Class for e-commerce
 * Company:      IUT Laval - Université du Maine
 * @author  A. Corbière
 */
package commerce.catalogue.service;

import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Loader implements ServletContextListener {
	private ServletContext application = null;
	
	public void contextDestroyed(ServletContextEvent event){
	}

	public void contextInitialized(ServletContextEvent event) {
		this.application = event.getServletContext();
		CatalogueManager catalogueManager = null ;
		if (this.application.getAttribute("catalogueManager")==null) {
			catalogueManager = new CatalogueManager() ;
			this.application.setAttribute("catalogueManager", catalogueManager) ;
		}
		else {
			catalogueManager = (CatalogueManager)this.application.getAttribute("catalogueManager") ;
		}
		new InitAmazon(catalogueManager).init();
		
		UserManager uManager = new UserManager();
		uManager.addUser("mdp","admin@admin.com","admin","admin","Rue des admins","0603020105");
		this.application.setAttribute("userManager", uManager);
	}	  
}