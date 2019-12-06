package service;

import java.util.List;



import entity.User;

public interface UserService {
	
	public List<User>  getUserList(User user);
	 public boolean addUser(User user);
}
