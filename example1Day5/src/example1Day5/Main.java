package example1Day5;

import example1Day5.business.concretes.UserManager;
import example1Day5.core.concretes.VerificationManager;
import example1Day5.dataAccess.concretes.HibernateUserDao;
import example1Day5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Sezgin");
		user.setLastName("ERERMAN");
		user.setEmail("sezginererman@gmail.com");
		user.setPassword("1234567");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("DEMÝROÐ");
		user2.setEmail(".demiroð@gmail.com.");
		user2.setPassword("134567");
		
		
		UserManager usermanager = new UserManager(new HibernateUserDao(), new VerificationManager());
		
		usermanager.add(user);
		usermanager.login(user);
		
		

	}

}
