package javaAssignment9;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateRandomNumbersExcelAndRead {

	public static void main(String[] args) throws IOException {
		String path = "data/file.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("RandomNumbers");
		Random rn = new Random();
		Set<Integer> myData = new LinkedHashSet<Integer>();
		int min = 1;
		int max = 1000;

		while (myData.size() != 500) {
			myData.add(rn.nextInt((max - min) + 1) + min);

		}
		Object[] myData1 = myData.toArray();

		for (int i = 0; i < 500; i++) {

			ws.createRow(i).createCell(0).setCellValue(myData1[i].toString());
		}
		File f = new File(path);
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		CreateRandomNumbersExcelAndRead obj = new CreateRandomNumbersExcelAndRead();
		obj.ReadExcel1(path);
	}
	public void ReadExcel1(String path) {
		File f=new File(path);
		try {
			FileInputStream fi=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fi);
			Sheet ws=wb.getSheetAt(0);
			int rc=ws.getLastRowNum();
			for(int i=0;i<=rc;i++) {
				
				System.out.println(ws.getRow(i).getCell(0));
			}
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}

