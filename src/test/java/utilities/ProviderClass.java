package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class ProviderClass   {
	
	public String path=System.getProperty("user.dir")+"\\testdata\\TestData1.xlsx";
	
	public ExcelUtilities ex;
	@DataProvider(name="dp")
	
	public Object[][] testdata() throws IOException {
		
		ex=new ExcelUtilities(path);
		
		int totalrows= ex.getRows("Sheet3");
		
		int totalcells=ex.getcells("Sheet3",1);
		
		Object data[][]= new Object[totalrows][totalcells];
		
		for (int i=1;i<=totalrows;i++) {
			
			
			for (int j=0;j<totalcells;j++) {
				
				 data[i-1][j]=ex.getcelldata("Sheet3",i,j);
			}
		}
		
		
		
	return data;
		
		
	}

}
