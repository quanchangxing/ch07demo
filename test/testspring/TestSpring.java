package testspring;



import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import entity.User;
import service.UserService;

public class TestSpring {
      Logger logger=Logger.getLogger(TestSpring.class);
	@Test
	public void testUserMapper() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setUserName("赵");
		user.setUserRole(3);
		
		List<User> userList=new ArrayList<User>();
		userList=userService.getUserList(user);
		for (User user2 : userList) {
			logger.debug("testGetUserList userCode:"+user2.getUserName());
			
			
		}
	}
	@Test
	public void testaddUser() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setUserName("小明");
		user.setAddress("郴江路");
		boolean isok=userService.addUser(user);
		System.out.println(isok);
		
	}
}
