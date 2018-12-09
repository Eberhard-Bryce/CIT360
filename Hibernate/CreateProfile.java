import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateProfile {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Profile.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create a student object
			System.out.println("Generating personal profile.");
			Profile tempProfile = new Profile("John", "Doe", "123 Test St", "Los Angeles", "California", "91722");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving profile.");
			session.save(tempProfile);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Profile Complete");
		}
		finally {
			factory.close();
		}
	}

}