package JAVA.BackEnd.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import JAVA.Entity.Manager;
import JAVA.Entity.User;
import JAVA.Utils.*;

public class UserRepository implements IUserRepository {

	private JdbcUltils jdbcUltils;
	private Connection connection;

	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUltils = new JdbcUltils();
	}

	@Override
	public List<User> getListUsers() throws SQLException, ClassNotFoundException {

		List<User> users = new ArrayList<>();
		try {
			connection = jdbcUltils.connect();
			System.out.print("Enter ID Project : ");
			int idProject = ScannerUtils.inputInt("Re-Enter");

			Statement statement = connection.createStatement();

			String sql = "SELECT * FROM finalexam.`user` WHERE ID = (SELECT e.ID FROM finalexam.employee e JOIN finalexam.project p "
					+ "											ON e.projectID = p.projectID WHERE p.projectID = "
					+ idProject + " ) " + "                                            OR "
					+ "                                            ID = (SELECT m.ID FROM finalexam.manager m JOIN finalexam.project p ON m.ID = p.idManager "
					+ "											WHERE p.projectID = " + idProject + " )";

			// PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// preparedStatement.setInt(1, idProject);
			// preparedStatement.setInt(2, idProject);

			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				int id = resultSet.getInt("ID");
				String fullName = resultSet.getString("fullName");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				User user = new User(id, fullName, email, password);
				users.add(user);
			}
			return users;
		} finally {
			connection.close();
		}
	}

	@Override
	public List<Manager> getManager() throws SQLException, ClassNotFoundException {

		List<Manager> managers = new ArrayList<>();
		try {
			connection = jdbcUltils.connect();

			System.out.println("---Project's Manages---");

			Statement statement = connection.createStatement();

			String sql = "SELECT u.*, m.ExpInYear FROM finalexam.`user` u JOIN (finalexam.manager m JOIN finalexam.project p ON m.ID = p.idManager)\r\n"
					+ "																					ON u.ID = m.ID";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt("ID");
				String fullName = resultSet.getString("fullName");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				int expInYear = resultSet.getInt("ExpInYear");
				Manager manager = new Manager(id, fullName, email, password, expInYear);
				managers.add(manager);
			}

			return managers;

		} finally {
			connection.close();
		}
	}

	@Override
	public void login() throws Exception {
		// TODO Auto-generated method stub
		try {
			connection = jdbcUltils.connect();
			System.out.print("Enter E-mail : ");
			String email = ScannerUtils.inputEmail("E-mail is wrong. Re-Enter, please");
			
			System.out.print("Enter password : ");
			String password = ScannerUtils.inputPassword("Password is wrong, password have 6-12 chars and 1 uppercase letter. Re-Enter, please");
			
			String sql = "SELECT * FROM User WHERE email = ? AND password = ? ";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				//int id = resultSet.getInt("ID");
				//String fullName = resultSet.getString("fullName");
				//User user = new User(id, fullName, email, password);
				
				System.out.println("Login successful!");
			} else {
				throw new Exception("E-mail or password is incorrect");
			}
			
		} finally {
			connection.close();
		}
	}

}
