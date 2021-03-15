package JAVA.BackEnd.datalayer;

import java.sql.SQLException;
import java.util.List;

import JAVA.Entity.Manager;
import JAVA.Entity.User;



public interface IUserRepository {
	List<User> getListUsers() throws SQLException, ClassNotFoundException;
	
	List<Manager> getManager() throws SQLException, ClassNotFoundException;
	
	void login() throws Exception;
}
