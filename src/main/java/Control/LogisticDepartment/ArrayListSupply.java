package Control.LogisticDepartment;

import Control.IList;
import Model.Supply;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author garci
 */
public class ArrayListSupply implements IList {

    private ArrayList<Supply> supllys;

    public ArrayListSupply() {
        this.supllys = new ArrayList<>();
    }

    @Override
    public void add(Object o) {
        supllys.add((Supply) o);
    }

    @Override
    public void saveExcel() {
        try {
            File file = new File("rom/Supply.xlsx");
            if (file.exists()) {
                XSSFWorkbook workbook;
                try ( FileInputStream fis = new FileInputStream(file)) {
                    workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    int lastRow = sheet.getLastRowNum();
                    for (int i = 0; i < supllys.size(); i++) {
                        lastRow++;
                        XSSFRow row = sheet.createRow(lastRow);
                        row.createCell(0).setCellValue(supllys.get(i).getType());
                        row.createCell(1).setCellValue(supllys.get(i).getName());
                        row.createCell(2).setCellValue(supllys.get(i).getAnimal());
                        row.createCell(3).setCellValue(supllys.get(i).getQuantity());
                        row.createCell(4).setCellValue(supllys.get(i).getSpecifications());
                    }
                }

                try ( FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Supplys");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Type");
                row.createCell(1).setCellValue("Name");
                row.createCell(2).setCellValue("Animal");
                row.createCell(3).setCellValue("Quantity");
                row.createCell(4).setCellValue("Specifications");

                for (int i = 0; i < supllys.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(supllys.get(i).getType());
                    row.createCell(1).setCellValue(supllys.get(i).getName());
                    row.createCell(2).setCellValue(supllys.get(i).getAnimal());
                    row.createCell(3).setCellValue(supllys.get(i).getQuantity());
                    row.createCell(4).setCellValue(supllys.get(i).getSpecifications());
                }

                try ( FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            }
        } catch (IOException e) {
            System.out.println("Hay un error, revisa.");
        }
    }

}
