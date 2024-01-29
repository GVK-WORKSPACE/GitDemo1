
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;

public class dataDriven {

public static void main(String[] args) throws IOException
{
	FileInputStream fis=new FileInputStream("F:\\demodata.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet;
	int sheets=workbook.getNumberOfSheets();
	for(int i=0;i<sheets;i++)
	{
		System.out.println(i);
		System.out.println(workbook.getSheetName(i));
		sheet=workbook.getSheet("cricket");

		XSSFRow row=sheet.getRow(3);
		XSSFCell cell=cell=row.getCell(2);
		System.out.println(cell);
		//if(workbook.getSheetName(i).equalsIgnoreCase("cricket"))
				 //sheet = workbook.getSheetAt(i);
	//	System.out.println(workbook.getSheetAt(i));
	}
}
}