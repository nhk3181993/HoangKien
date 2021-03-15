package JAVA.BackEnd.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import JAVA.BackEnd.datalayer.IUserRepository;
import JAVA.BackEnd.datalayer.UserRepository;
import JAVA.Entity.Manager;
import JAVA.Entity.User;


public class UserService implements IUserService {
	private IUserRepository userRepository;

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	@Override
	public List<User> getListUsers() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.getListUsers();
	}

	@Override
	public List<Manager> getManager() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.getManager();
	}

	@Override
	public void login() throws Exception {
		// TODO Auto-generated method stub
		userRepository.login();
	}

}
