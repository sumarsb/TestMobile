package AmazonWeb;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelUtility {

	public static ExcelUtility excelUtility = null;

	private static HSSFWorkbook WorkBook;
	private static HSSFCell Cell;
	private static HSSFRow Row;

	public synchronized static ExcelUtility getInstance() {
		if (excelUtility == null) {
			excelUtility = new ExcelUtility();
		}
		return excelUtility;
	}

	public static void setCellData(int sheetIndex, int rowIndex, int columnIndex, String data) {
		excelUtility.WorkBook.getSheetAt(sheetIndex).getRow(rowIndex).createCell(columnIndex).setCellValue(data);
	}

	private ExcelUtility() {
		FileInputStream ExcelFile = null;
		try {
			ExcelFile = new FileInputStream("src\\AmazonWeb\\AmazonDataDriven.xls");
			WorkBook = new HSSFWorkbook(ExcelFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static java.lang.CharSequence getCellData(int sheetIndex, int rowIndex, int colnumIndex) throws Exception {

		String cellData;

		try {
			DataFormatter formatter = new DataFormatter();
			cellData = formatter.formatCellValue(WorkBook.getSheetAt(sheetIndex).getRow(rowIndex).getCell(colnumIndex));

			return cellData;

		} catch (NumberFormatException e) {
			System.out.println(e.getLocalizedMessage());
			return e.getLocalizedMessage();
		}
	}

	public static void writeCellData() throws Exception{

		try {
			
		 FileOutputStream  WriteExcelFile = new FileOutputStream("src\\AmazonWeb\\AmazonDataDriven.xls");
			WorkBook.write(WriteExcelFile);
			WriteExcelFile.flush();
			WriteExcelFile.close();
		} catch (NumberFormatException e) {

		}
	}
}
