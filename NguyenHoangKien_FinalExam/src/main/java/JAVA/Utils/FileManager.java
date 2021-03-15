package JAVA.Utils;

import java.io.File;

public class FileManager {
	
//	Question 1: Check File is exists
//	Táº¡o 1 method cÃ³ Ä‘áº§u vÃ o lÃ  String path Ä‘á»ƒ check xem path Ä‘Ã³ cÃ³ tá»“n
//	táº¡i hay khÃ´ng.
//	VD: path = "C:\Users\pc\Desktop\Test.txt"

	public static boolean checkExist(String filePath) {
		File file = new File(filePath);
		if (file.exists()) {
			System.out.println("File is exist!");
		} else {
			System.out.println("File is not exist!");
		}
		return true;

	}
//	Question 2: Create new file
//	Táº¡o 1 method Ä‘á»ƒ cÃ³ thá»ƒ táº¡o Ä‘Æ°á»£c file.
//	ChÃº Ã½:
//	Kiá»ƒm tra xem file Ä‘Ã£ tá»“n táº¡i hay chÆ°a, náº¿u file Ä‘Ã£ tá»“n táº¡i thÃ¬ sáº½
//	throw ra Exception "Error! File Exist."

//	Gá»£i Ã½:
//		Táº¡o method void createNewFile(String pathFile)
//		VÃ o táº¡o thÃªm method void createNewFile(String path, String
//		fileName)

	public static void createNewFile1(String pathFile) throws Exception {

		File file = new File(pathFile);
		if (file.exists()) {
			throw new Exception("Error! File Exist");

		} else if (file.createNewFile()) {
			System.out.println("Congratulations! Create Successfully");
		}
	}

//	Question 4: Delete file
//	Táº¡o 1 method Ä‘á»ƒ cÃ³ thá»ƒ delete file
//	ChÃº Ã½: 
//	Kiá»ƒm tra xem file Ä‘Ã£ tá»“n táº¡i hay chÆ°a, náº¿u file chÆ°a tá»“n táº¡i thÃ¬
//	sáº½ throw ra Exception "Error! File Not Exist."
//	Gá»£i Ã½: Táº¡o method void deleteFile(String pathFile)

	public static void deleteFile(String pathFile) throws Exception {

		File file = new File(pathFile);

		if (file.exists()) {
			file.delete();
			System.out.println("Congratulations! Delete Successfully");

		} else {
			throw new Exception("Error! File Not Exist");
		}
	}
//	Question 5: Check path is File or Folder
//	Táº¡o 1 method Ä‘á»ƒ kiá»ƒm tra xem path cÃ³ thá»ƒ lÃ  File hay Folder.
//	Gá»£i Ã½: Táº¡o method boolean isFolder(String path)

	public static void isFolder(String path) {
		File file = new File(path);
		System.out.println(file.isDirectory() ? "Path is Folder " : "Path is File");
	}

//	Question 6: Get all File name of Folder
//	Táº¡o 1 method Ä‘á»ƒ láº¥y ra táº¥t cáº£ cÃ¡c tÃªn file trong 1 Folder.
//	ChÃº Ã½:
//	Kiá»ƒm tra xem path nháº­p vÃ o cÃ³ pháº£i lÃ  folder hay khÃ´ng, náº¿u
//	khÃ´ng pháº£i thÃ¬ sáº½ throw ra Exception "Error! Path is not folder."
//	Gá»£i Ã½: Táº¡o method List<String> getAllFileName(String path)
	public static void getAllFileName(String path) throws Exception {
		File file = new File(path);
		if (file.isDirectory()) {
			for (String fileName : file.list()) {
				System.out.println(fileName);
			}
		} else {
			throw new Exception("Error! Path is not folder");
		}

	}

//	Question 7: Copy File
//	Táº¡o 1 method Ä‘á»ƒ copy file.
//	ChÃº Ã½:
//	Náº¿u file khÃ´ng tá»“n táº¡i thÃ¬ sáº½ throw ra Exception "Error! Source
//	File Not Exist."
//	Náº¿u file Ä‘Ã­ch Ä‘Ã£ tá»“n táº¡i thÃ¬ sáº½ throw ra Exception "Error!
//	newPath has File same name."

	public static void copyFile(String sourceFile, String distinationPath, String newName) throws Exception {
		File file = new File(sourceFile);
		if (!file.exists()) {
			throw new Exception("Error! Source File Not Exist");
		} else if (file.exists()) {
			throw new Exception("Error! newPath has File same name");
		}
	}

}
