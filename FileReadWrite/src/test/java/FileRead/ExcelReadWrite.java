package FileRead;
// Code to read write excel
// check if using excel 2003 formal the poi dependence is poi(just poi)
//for 2007  format xlxs format use poi-ooxml dependency
//HSSF: denotes the API is for working with Excel 2003 and earlier.
//XSSF: denotes the API is for working with Excel 2007 and later.
/*Workbook: high level representation of an Excel workbook. Concrete implementations are: HSSFWorkbookand XSSFWorkbook.
Sheet: high level representation of an Excel worksheet. Typical implementing classes are HSSFSheetand XSSFSheet.
Row: high level representation of a row in a spreadsheet. HSSFRowand XSSFRoware two concrete classes.
Cell: high level representation of a cell in a row. HSSFCelland XSSFCellare the typical implementing classes.*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static void main(String[] args) throws IOException {
		String sPath=System.getProperty("user.dir")+"/Excel/excel.xlsx";
		System.out.print(sPath);
		excelFileRead(sPath);
		excelFileWrite(sPath);
	}

	public static void excelFileRead(String sPath) throws IOException {
		FileInputStream fl= new FileInputStream(sPath);
		//XSSFWorkbook myWorkBook = new XSSFWorkbook (fl);// XssFworkBook only takes the file input stream not file reader
		Workbook workbook = new XSSFWorkbook(fl);
		Sheet firstSheet = workbook.getSheetAt(0);
		int rowCount=firstSheet.getLastRowNum()+1;// to get the row number for looping+1 here bcoz i think by default getlastword excludes first row 
		int colCount=firstSheet.getRow(0).getLastCellNum();// to get the col number for looping


		for (int i=0;i<rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				/* when i want to print the cell getStringCellValue() it threw an error this 
				 *  error was if the cell is of numeric or boolean 
				 *  1 way -0>so first get the cell type and then display o/p
				 *  2.Else set the cell type to string and then get the values 
				 *  3. go to excel -format-cells and change the cell type to string -> in my case iam using google sheets so dnt know how to do
				 *  
				 */

				/*  System.out.println(i);
                //GET CELL
                Cell cell1 = sheet1.getRow(i).getCell(0);   
                //SET AS STRING TYPE
                cell1.setCellType(Cell.CELL_TYPE_STRING);
                String data0= cell1.getStringCellValue();
                System.out.println("Test Data From Excel : "+data0);*/

				Cell MytempCell = firstSheet.getRow(i).getCell(j); 	

				if (MytempCell.getCellType()== Cell.CELL_TYPE_STRING) {
					System.out.print(MytempCell.getStringCellValue());
					//break;
				} 
				else if (MytempCell.getCellType()== Cell.CELL_TYPE_BOOLEAN) {
					System.out.print(MytempCell.getBooleanCellValue());
					//break;
				}  
				else if (MytempCell.getCellType()== Cell.CELL_TYPE_NUMERIC) {
					System.out.print(MytempCell.getNumericCellValue());
					//break;
				}  
				System.out.print(" - ");
			}
			System.out.println();
		}



	}





	public static void excelFileWrite(String sPath) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Java Books");// to create a new sheet
		//XSSFSheet sheet = workbook.getSheetAt(0);
		Object data [][]= { {"xx",20},
				{"ss",30}

		};
		int rowCount = 0;

		for (Object[] adata : data) {
			Row row = sheet.createRow(++rowCount);

			int columnCount = 0;

			for (Object field : adata) {
				Cell cell = row.createCell(++columnCount);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}


			FileOutputStream fo=new FileOutputStream(sPath);
			workbook.write(fo);
		}



	}

}