package example1Day5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import example1Day5.dataAccess.abstracts.UserDao;
import example1Day5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users= new ArrayList<User>();
	
	
	
	
	
	@Override
	public void save(User user) {
		System.out.println("Kullanýcý ekleme iþlemi tamamlandý : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silme iþlemi tamamlandý : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
