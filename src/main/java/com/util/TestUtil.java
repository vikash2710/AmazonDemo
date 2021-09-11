package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT= 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void switchToFrame(){
	driver.switchTo().frame("mainpanel");
	}
	
//	public static String TESTDATA_SHEET_PATH = "D:\\Automation\\ScientificStudyBDD\\ScientificStudy\\SchoolManagement.xlsx";
	
//	public static HSSFWorkbook workbook;
//    public static HSSFSheet worksheet;
//    public static DataFormatter formatter= new DataFormatter();
//    public static String sheetpath = "D:\\Automation\\ScientificStudyBDD\\ScientificStudy\\SchoolManagement.xlsx";
	
//	public static Object[][] ReadExcel(String sheetName) throws Exception
//    {
//    FileInputStream fileInputStream= new FileInputStream(sheetpath); //Excel sheet file location get mentioned here
//        workbook = new HSSFWorkbook (fileInputStream); //get my workbook 
//        worksheet=workbook.getSheet(sheetName);// get my sheet from workbook
//        HSSFRow Row=worksheet.getRow(0);     //get my Row which start from 0   
//     
//        int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
//        int ColNum= Row.getLastCellNum(); // get last ColNum 
//         
//        Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array
//         
//            for(int i=0; i<RowNum-1; i++) //Loop work for Rows
//            {  
//                HSSFRow row= worksheet.getRow(i+1);
//                 
//                for (int j=0; j<ColNum; j++) //Loop work for colNum
//                {
//                    if(row==null)
//                        Data[i][j]= "";
//                    else
//                    {
//                        HSSFCell cell= row.getCell(j);
//                        if(cell==null)
//                            Data[i][j]= ""; //if it get Null value it pass no data 
//                        else
//                        {
//                            String value=formatter.formatCellValue(cell);
//                            Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
//                        }
//                    }
//                }
//            }
// 
//        return Data;
//    }

}





