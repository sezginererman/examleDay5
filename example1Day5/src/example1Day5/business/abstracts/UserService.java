package example1Day5.business.abstracts;

import java.util.List;

import example1Day5.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	void login(User user);
	List<User> getAll();
	

}
