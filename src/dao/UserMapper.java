package dao;

import java.util.List;

import entity.User;

public interface UserMapper {
 public List<User>  getUserList(User user);
 public int addUser(User user);
}
