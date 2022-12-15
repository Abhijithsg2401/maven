package com.nest.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility1 {
	private static XSSFWorkbook book;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	
	public static XSSFCell getCellData(int row,int column) throws Exception {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Abhi.xlsx");
		book=new XSSFWorkbook(file);
		sheet=book.getSheetAt(0);
		cell=sheet.getRow(row).getCell(column);
		return cell;
}
}