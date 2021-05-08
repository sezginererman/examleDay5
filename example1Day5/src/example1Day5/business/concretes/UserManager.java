package example1Day5.business.concretes;

import java.util.List;

import example1Day5.business.abstracts.UserService;
import example1Day5.core.abstracts.VerificationService;
import example1Day5.dataAccess.abstracts.UserDao;
import example1Day5.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private VerificationService verificationService;
	
	
	public UserManager(UserDao userDao, VerificationService verificationService) {
		super();
		this.userDao = userDao;
		this.verificationService = verificationService;
	}

	@Override
	public void add(User user) {
		if(verificationService.verificationEmail(user)&&verificationService.verificationName(user)&&verificationService.verificationPassword(user)
				&&verificationService.emailChecked(user)) {
			userDao.save(user);
			
			
		}
		
	}

	@Override
	public void update(User user) {
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(User user) {
		for (User users : this.getAll()) {
			if(users.getEmail()==user.getEmail() && users.getPassword()==user.getPassword()) {
				System.out.println("Sisteme giriþ yapýldý.");
			}else {
				System.out.println("Parala ya da email hatalý! Terar deneyiniz!");
			}
		}
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
}
