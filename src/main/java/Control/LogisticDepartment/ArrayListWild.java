package Control.LogisticDepartment;

import Model.Wild;
import Control.IList;
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
public class ArrayListWild implements IList{
    private ArrayList<Wild> wilds = new ArrayList<>();
    public ArrayListWild(){

    }
    public void add(Object o) {
        wilds.add((Wild)o);
    }
    public void saveExcel() {
        try {
            File file = new File("rom/Animals/Wilds.xlsx");
            if (file.exists()) {
                XSSFWorkbook workbook;
                try (FileInputStream fis = new FileInputStream(file)) {
                    workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    int lastRow = sheet.getLastRowNum();
                    for (int i = 0; i < wilds.size(); i++) {
                        lastRow++;
                        XSSFRow row = sheet.createRow(lastRow);
                        row.createCell(0).setCellValue(wilds.get(i).getName());
                        row.createCell(1).setCellValue(wilds.get(i).getRace());
                        row.createCell(2).setCellValue(wilds.get(i).getSex());
                        row.createCell(3).setCellValue(wilds.get(i).getHabitad());
                        row.createCell(4).setCellValue(wilds.get(i).getBirthhabitat());
                        row.createCell(5).setCellValue(wilds.get(i).getDangerousness());
                        row.createCell(6).setCellValue(wilds.get(i).getDiet());
                    }
                }

                try (FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Wilds");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Name");
                row.createCell(1).setCellValue("Race");
                row.createCell(2).setCellValue("Sex");
                row.createCell(3).setCellValue("Habitad");
                row.createCell(4).setCellValue("Birth habitat");
                row.createCell(5).setCellValue("Dangerousness");
                row.createCell(6).setCellValue("Diet");
                

                for (int i = 0; i < wilds.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(wilds.get(i).getName());
                    row.createCell(1).setCellValue(wilds.get(i).getRace());
                    row.createCell(2).setCellValue(wilds.get(i).getSex());
                    row.createCell(3).setCellValue(wilds.get(i).getHabitad());
                    row.createCell(4).setCellValue(wilds.get(i).getBirthhabitat());
                    row.createCell(5).setCellValue(wilds.get(i).getDangerousness());
                    row.createCell(6).setCellValue(wilds.get(i).getDiet());
                }

                try (FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            }
        } catch (IOException e) {
            System.out.println("Hay un error, revisa.");
        }
    }

}
