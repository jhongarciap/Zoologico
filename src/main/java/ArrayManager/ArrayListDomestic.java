/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayManager;

import Model.Domestic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author garci
 */
public class ArrayListDomestic {
    //Array de Employee

    private ArrayList<Domestic> domestics = new ArrayList<>();

    //Constructor vacio
    public ArrayListDomestic() {

    }

    //Añadir
    public void addDomestic(Domestic domestic) {
        domestics.add(domestic);
        // Guardar/Crear/Llenar Excel
    }
        
    public void saveDomesticExcel() {
        try {
            File file = new File("rom/Animals/Domestics.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
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
                fis.close();

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
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

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            }
        } catch (Exception e) {
            System.out.println("Hay un error, revisa.");
        }
    }
}
