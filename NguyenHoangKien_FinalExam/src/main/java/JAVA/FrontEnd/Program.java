package JAVA.FrontEnd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import JAVA.Utils.*;

public class Program {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Function function = new Function();
		ScannerUtils scannerUtils = new ScannerUtils();
		do {
			
			System.out.println("----Menu-----");			
			System.out.println("1. In ra thong tin user theo id project nhap vao.");		
			System.out.println("2. Lay ra Manage cua project.");
			System.out.println("3. Login.");
			System.out.println("4. Exit.\n");
			System.out.printf("Enter choice : ");
			
			int choice = scannerUtils.inputInt("Re-Enter");
			
			switch (choice) {
			
			case 1:
				function.getListUser();
				break;
				
			case 2:
				function.getManager();
				break;
				
			case 3:
				function.login();
				break;
			case 4:
				System.exit(0);
				
			default:
				System.out.println("Re-Enter");
				break;
			}
		} while (true);
	}
}
