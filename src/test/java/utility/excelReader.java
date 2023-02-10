package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class excelReader {
	
	public String [][] getData(String sheetName) throws IOException{
		
		File fs= new File("../SwagLabs/src/test/resources/Excel/Book1.xlsx");
		System.out.println(fs.exists());
		
		FileInputStream fis=new FileInputStream(fs);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		int Rown=sheet.getPhysicalNumberOfRows();
		int column=sheet.getRow(0).getLastCellNum();
		
		String [][] data=new String[Rown-1][column];
		
		for(int i=0;i<Rown-1;i++) {
			for(int j=0; j<column;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		
		for(String[] dataARR:data) {
			System.out.println(Arrays.toString(dataARR));
		}
		return data;
	}
	
	@DataProvider(name = "login")
	public Object[][] loginData() throws IOException{
		Object [][] login=getData("Login");
		return login;
	}
	
	@DataProvider
	public Object[][] infoData() throws IOException{
		Object[][] info=getData("Information");
		return info;
	}

}
