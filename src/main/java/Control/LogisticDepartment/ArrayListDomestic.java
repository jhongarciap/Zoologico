package Control.LogisticDepartment;

import Control.IList;
import Model.Domestic;
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
public class ArrayListDomestic implements IList {

    private ArrayList<Domestic> domestics = new ArrayList<>();

    public ArrayListDomestic() {

    }

    @Override
    public void add(Object o) {
        domestics.add((Domestic) o);
    }

    @Override
    public void saveExcel() {
        try {
            File file = new File("rom/Animals/Domestics.xlsx");
            if (file.exists()) {
                XSSFWorkbook workbook;
                try ( FileInputStream fis = new FileInputStream(file)) {
                    workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    int lastRow = sheet.getLastRowNum();
                    for (int i = 0; i < domestics.size(); i++) {
                        lastRow++;
                        XSSFRow row = sheet.createRow(lastRow);
                        row.createCell(0).setCellValue(domestics.get(i).getName());
                        row.createCell(1).setCellValue(domestics.get(i).getRace());
                        row.createCell(2).setCellValue(domestics.get(i).getSex());
                        row.createCell(3).setCellValue(domestics.get(i).getHabitad());
                        row.createCell(4).setCellValue(domestics.get(i).getOrigin());
                        row.createCell(5).setCellValue(domestics.get(i).getPsyche());
                        row.createCell(6).setCellValue(domestics.get(i).getDiet());
                    }
                }

                try ( FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Domestics");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Name");
                row.createCell(1).setCellValue("Race");
                row.createCell(2).setCellValue("Sex");
                row.createCell(3).setCellValue("Habitad");
                row.createCell(4).setCellValue("Origin");
                row.createCell(5).setCellValue("Psyche");
                row.createCell(6).setCellValue("Diet");

                for (int i = 0; i < domestics.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(domestics.get(i).getName());
                    row.createCell(1).setCellValue(domestics.get(i).getRace());
                    row.createCell(2).setCellValue(domestics.get(i).getSex());
                    row.createCell(3).setCellValue(domestics.get(i).getHabitad());
                    row.createCell(4).setCellValue(domestics.get(i).getOrigin());
                    row.createCell(5).setCellValue(domestics.get(i).getPsyche());
                    row.createCell(6).setCellValue(domestics.get(i).getDiet());
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
