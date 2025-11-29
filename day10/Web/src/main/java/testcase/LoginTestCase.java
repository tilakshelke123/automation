package testcase;

import java.util.List;

import model.User;
import reader.ExcelReader;

public class LoginTestCase {

	public void login() {
		List<User> users = ExcelReader.readLoginUsers();
		
		System.out.println(users.size());
		
		for(User user: users) {
			System.out.println(user.getUsername()+":"+user.getPassword());
		}
	}
}
