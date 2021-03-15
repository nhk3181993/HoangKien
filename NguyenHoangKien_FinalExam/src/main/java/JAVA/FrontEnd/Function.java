package JAVA.FrontEnd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import JAVA.BackEnd.controller.UserController;
import JAVA.Entity.Manager;
import JAVA.Entity.User;
import JAVA.Utils.JdbcUltils;
import JAVA.Utils.ScannerUtils;

public class Function {
	
	private UserController userController;

	public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {

		this.userController = new UserController();
	}
	
	public void getListUser() throws ClassNotFoundException, SQLException {
		List<User> users = userController.getListUsers();
		System.out.printf("%-10s %-25s %-25s %-25s\n", "ID", "Full name", "E-mail", "Password");
		
		for (User user : users) {
			System.out.format("%-10s %-25s %-25s %-25s\n", user.getId(), user.getFullName(), user.getEmail(), user.getPassword());
		}
	}
	
	public void getManager() throws ClassNotFoundException, SQLException {
		List<Manager> managers = userController.getManager();
		System.out.printf("%-10s %-25s %-25s %-25s %-25s\n", "ID", "Full name", "E-mail", "Password", "ExpInYear");
		for (Manager manager : managers) {
			System.out.format("%-10s %-25s %-25s %-25s %-25s\n", manager.getId(), manager.getFullName(), manager.getEmail(), manager.getPassword(), manager.getExpInYear());
		}
		
	}
	
	public void login() {
				
			try {
				userController.login();
			} catch (Exception e) {
				
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		
	}
	
}
