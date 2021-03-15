package JAVA.BackEnd.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import JAVA.BackEnd.bussinesslayer.IUserService;
import JAVA.BackEnd.bussinesslayer.UserService;
import JAVA.Entity.Manager;
import JAVA.Entity.User;

public class UserController {
	private IUserService userService;
	
	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}
	
	public List<User> getListUsers() throws ClassNotFoundException, SQLException {
		return userService.getListUsers();
	}
	
	public List<Manager> getManager() throws ClassNotFoundException, SQLException{
		return userService.getManager();
	}
	
	public void login() throws Exception {
		userService.login();
	}

	
}
