package examenModulo2.parte4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EnManag {

	 private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

	    private static EntityManagerFactory buildEntityManagerFactory(){
	        return Persistence.createEntityManagerFactory("ejemploHibernate");
	    }

	    public static EntityManager getEntityManager() { 
	        return entityManagerFactory.createEntityManager();
	    }
	    
	    //estilo de llamada a conneccion2
	    public static EntityManager getEM (String persistenceUnit) {
	    	EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnit);
	    	EntityManager em = emf.createEntityManager(); 
	    	
	    	return em;
	    }
}
