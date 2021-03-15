package JAVA.Utils;

import java.io.*;

public class IOStream {
//	Question 1: Táº¡o method        //READ FILE
	// Táº¡o 1 method cÃ³ Ä‘áº§u vÃ o lÃ  String filePath vÃ  return ra ná»™i dung trong file.
	// ChÃº Ã½:
	// Náº¿u file khÃ´ng tá»“n táº¡i thÃ¬ sáº½ throw ra Exception "Error! File
	// Not Exist." (sá»­ dá»¥ng FileManager á»Ÿ trÃªn Ä‘áº» check)
	// Gá»£i Ã½: Táº¡o method String readFile(String pathFile)

	public static String readFile(String filePath) throws Exception {
		// check exists
		if (!FileManager.checkExist(filePath)) {
			throw new Exception("Sorry! File is not Exist!");
		}

		FileInputStream file = new FileInputStream(filePath);
		byte[] b = new byte[1024];
		int length = file.read(b);
		System.out.println(length);

		while (length > -1) {
			String content = new String(b, 0, length);
			System.out.println(content);
			System.out.println("------------------------------------");
			length = file.read(b);

		}
		file.close();
		String content = "";
		return content;
	}

//	Question 2: Táº¡o method write content to File
//	Táº¡o 1 method Ä‘á»ƒ write file
//	ChÃº Ã½:
//	Náº¿u file khÃ´ng tá»“n táº¡i thÃ¬ sáº½ throw ra Exception "Error! File
//	Not Exist." (sá»­ dá»¥ng FileManager á»Ÿ exercise trÃªn Ä‘á»ƒ check)
//	Gá»£i Ã½: Táº¡o method void writeFile(String pathFile, isContinuing
//	String content)
//	Náº¿u isContinuing = false thÃ¬ sáº½ xÃ³a háº¿t ná»™i dung trong file Ä‘i vÃ  write content má»›i vÃ o
//	Náº¿u isContinuing = true thÃ¬ sáº½ ghi content vÃ o cuá»‘i file

	public static String writeFile(String pathFile, boolean isContinuing, String content) throws Exception {
		if (!FileManager.checkExist(pathFile)) {
			throw new Exception("Error! File Not Exist");
		}
		FileOutputStream fileOutPut = new FileOutputStream(pathFile, isContinuing);
		fileOutPut.write(content.getBytes());
		fileOutPut.close();
		return content;

	}
}
