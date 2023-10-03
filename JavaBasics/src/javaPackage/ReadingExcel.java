package javaPackage;

import java.io.File;
import java.io.FileInputStream;


public class ReadingExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//specify the location of excel file
		File src= new File("C:\\Users\\Supriya\\Desktopgoogle-2023-8-18-22-46-27");
		
		//load file
		FileInputStream fis= new FileInputStream(src);
		
		//load workbook
		WorkBook wb=new XSSFWorkBook();
		
		
				

	}

}
 