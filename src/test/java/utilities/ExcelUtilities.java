package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	public FileInputStream fi;
	
	public XSSFWorkbook wb;
	
	public XSSFSheet sh;
	
	public String path;
	
	 ExcelUtilities(String path) {
		
		this.path=path;
	}
	
	public int getRows(String sheet) throws IOException {
		
		fi=new FileInputStream(path);
		
		
		wb=new XSSFWorkbook(fi);
		
		
		sh=wb.getSheet(sheet);
		
		int rows=sh.getLastRowNum();
		
		wb.close();
		
	fi.close();
		
		return rows;
		
		
		
		
		
		
	}
	
	public int getcells(String sheet, int row) throws IOException {
		
fi=new FileInputStream(path);
		
		
		wb=new XSSFWorkbook(fi);
		
		
		sh=wb.getSheet(sheet);
		
		int cells=sh.getRow(row).getLastCellNum();
		
		wb.close();
		
		fi.close();
		
		return cells;
		
		
		
		
	}
	
	public String getcelldata(String sheet, int row,int cell) throws IOException {
		
		fi=new FileInputStream(path);
				
				
				wb=new XSSFWorkbook(fi);
				
				
				sh=wb.getSheet(sheet);
				
				String data= sh.getRow(row).getCell(cell).toString();
				
				
				
				wb.close();
				
				fi.close();
				
				return data;
				
				
				
				
			}

	
	
	

}
