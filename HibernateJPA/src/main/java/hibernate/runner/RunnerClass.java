package hibernate.runner;

import hibernate.model.User;
import hibernate.service.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerClass {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		
		UserService userService = (UserService)context.getBean("userServiceImpl");
		
		/*User user = new User();
		User user1 = new User();
		//user.setUserId(1L);
		user.setUserName("Poorva");
		user1.setUserName("Sahil");
		
		userService.addUser(user);
		userService.addUser(user1);
		
		userService.listUsers();*/
		
		User user = userService.getUserById(1);
		user.setUserName("CPoorva");
		userService.updateUser(user);
		userService.deleteUser(1);
		
	}

}
