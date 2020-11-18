package com.project.stock.utility;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.project.stock.entity.CompanyData;

public class ExcelParser {
  public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
  static String[] HEADERs = { "name", "exchange", "price", "date","time" };
  static String SHEET = "Sheet1";

  public static boolean hasExcelFormat(MultipartFile file) {

    if (!TYPE.equals(file.getContentType())) {
      return false;
    }

    return true;
  }

  public static List<CompanyData> excelToTable(InputStream is) {
    try {
      Workbook workbook = new XSSFWorkbook(is);
      Sheet sheet = workbook.getSheet(SHEET);
      Iterator<Row> rows = sheet.iterator();

      List<CompanyData> tutorials = new ArrayList<CompanyData>();

      int rowNumber = 0;
      while (rows.hasNext()) {
        Row currentRow = rows.next();

        // skip header
        if (rowNumber == 0) {
          rowNumber++;
          continue;
        }

        Iterator<Cell> cellsInRow = currentRow.iterator();
        CompanyData company = new CompanyData();
      
        int cellIdx = 0;
        
        while (cellsInRow.hasNext()) {
          Cell currentCell = cellsInRow.next();
          switch (cellIdx) {
          case 0:
        	  String name =currentCell.getStringCellValue();
        	  System.out.println(name);
            company.setName(currentCell.getStringCellValue());
            break;

          case 1:
        	  String name1 =currentCell.getStringCellValue();
        	  System.out.println(name1);
        	  company.setExchange(currentCell.getStringCellValue());
        	  break;

          case 2:
        	  float name2 =(float) currentCell.getNumericCellValue();
        	  System.out.println(name2);
	          company.setPrice((float)currentCell.getNumericCellValue());
	          break;

          case 3:  
        	  String name3 =currentCell.getStringCellValue();
        	  System.out.println(name3);
        	  company.setDate(currentCell.getStringCellValue());
        	  break;
        	  
          case 4:
        	  String name4 =currentCell.getStringCellValue();
        	  System.out.println(name4);
        	  company.setTime(currentCell.getStringCellValue());
        	  break;

          default:
            break;
          }
          System.out.println("Control out of switch"+cellIdx);
          cellIdx++;
        }

        tutorials.add(company);
      }

      workbook.close();

      return tutorials;
    } catch (IOException e) {
      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
    }
  }
}