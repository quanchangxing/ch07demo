package service.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.UserMapper;
import entity.User;
import service.UserService;
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService  {
	@Autowired
    private UserMapper userMapper;   //声明UserMapper借口引用
	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<User> getUserList(User user) {
		
		return userMapper.getUserList(user);
	}
	public UserMapper getUserMapper() {
		return userMapper;
	}
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public boolean addUser(User user) {
		boolean isok=false;
		try {
		if(userMapper.addUser(user)==1) {
			isok=true;
		}else {
			isok=false;
		}
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return isok;
	}

}
