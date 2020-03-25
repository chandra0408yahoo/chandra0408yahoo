package Seleniumstartup;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
public class UploadAExcelValue {

    @Test
    public void testxlsheet() throws IOException, BiffException {

        FileInputStream fis = new FileInputStream("/Users/chandrapuli/IdeaProjects/SamplJavaProject/src/test/java/Seleniumstartup/TestFileBook1.xls");
        Workbook wb = Workbook.getWorkbook(fis);

        // TO get the access to the sheet
        Sheet sh = wb.getSheet("Sheet1");
        String CellGetContent = sh.getCell(0,0).getContents();
        System.out.println(CellGetContent);

    }

}
