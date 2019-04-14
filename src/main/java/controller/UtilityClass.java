package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UtilityClass {

	private static UtilityClass instance = new UtilityClass();
	private SessionFactory sessionfactory;
	
	public static UtilityClass getInstance() {
		return instance;
	}
	public static void setInstance(UtilityClass instance) {
		UtilityClass.instance = instance;
	}
	
	private UtilityClass(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
                
        sessionfactory = configuration.buildSessionFactory();
    }
    
    public static Session getSession(){
        Session session =  getInstance().sessionfactory.openSession();
        
        return session;
    }
}
