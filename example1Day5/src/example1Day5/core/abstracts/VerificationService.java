package example1Day5.core.abstracts;

import example1Day5.entities.concretes.User;

public interface VerificationService {
	
	boolean verificationName(User user);
	boolean verificationPassword(User user);
	boolean verificationEmail(User user);
	boolean emailChecked(User user);
	
	

}
