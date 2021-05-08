package example1Day5.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import example1Day5.core.abstracts.VerificationService;
import example1Day5.entities.concretes.User;

public class VerificationManager implements VerificationService{

	@Override
	public boolean verificationName(User user) {
		if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty()) {
			return true;
		}else {
			System.out.println("Kullanıcı adı ve soyadı boş! Lütfen doldurunuz.");
			return false;
		}
		
	}

	@Override
	public boolean verificationPassword(User user) {
		if(user.getPassword().length()>6) {
			return true;	
		}else {
			System.out.println("Parolanız en az 6 karakterden oluşmalıdır! Lütfen geçerli bir parola giriniz");
			return false;
		}
		
	}

	@Override
	public boolean verificationEmail(User user) {
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	    CharSequence inputStr = user.getEmail();
	    
	    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(inputStr);
	    boolean result= matcher.matches();
	    if(!result) {
	    	System.out.println("Mail adresinizin formatı yanlış! Lütfen kontrol edin.");
	    	return false;
	    }
	    return true;
		
	}

	@Override
	public boolean emailChecked(User user) {
		
		return true;
	}

}
