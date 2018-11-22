import java.util.HashMap;

public class Représentant {
	// Classe basée sur le pattern Singleton qui permet la journalisation de l'application.
 
	        private static Représentant uniqueInstance;// Stockage de l'unique instance de cette classe.
	        private static HashMap instances = new HashMap();// Table de hashage d'instance (clef, valeur).
	        // Constructeur en privé (donc inaccessible à l'extérieur de la classe).
	        private Représentant()
	        {
	        	
  	        }
	        
	        // Méthode statique qui sert de pseudo-constructeur (utilisation du mot clef "synchronized" pour le multithread).
	        public static synchronized Représentant getInstance()
	        {
	                if(uniqueInstance==null)
	                {
	                        uniqueInstance = new Représentant();
	                }
	                return uniqueInstance;
	        }
	        
	    
	        
	     
	}

