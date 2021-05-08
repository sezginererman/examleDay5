package example1Day5.dataAccess.abstracts;

import java.util.List;

import example1Day5.entities.concretes.User;

public interface UserDao {
	
	void save(User user);
	void delete(User user);
	List<User> getAll();
	
	

}
