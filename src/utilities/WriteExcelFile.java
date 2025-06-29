package utilities;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//crea un ejemplo de clase que escriba en un archivo Excel
public class WriteExcelFile {

    public static void writeExcelFile(String filePath) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Example Sheet");

        Row headerRow = sheet.createRow(0);
        Cell headerCell1 = headerRow.createCell(0);
        headerCell1.setCellValue("Header 1");
        Cell headerCell2 = headerRow.createCell(1);
        headerCell2.setCellValue("Header 2");

        Row dataRow = sheet.createRow(1);
        Cell dataCell1 = dataRow.createCell(0);
        dataCell1.setCellValue("Data 1");
        Cell dataCell2 = dataRow.createCell(1);
        dataCell2.setCellValue("Data 2");

        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            System.out.println("Excel file written successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "example.xlsx"; // Specify the path where you want to save the Excel file
        writeExcelFile(filePath);
    }

}


