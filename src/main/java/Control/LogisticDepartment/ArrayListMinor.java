/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.LogisticDepartment;

import Model.Minor;
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
public class ArrayListMinor {
    //Array de Employee

    private ArrayList<Minor> minors = new ArrayList<>();

    //Constructor vacio
    public ArrayListMinor() {

    }

    //Añadir
    public void addDomestic(Minor minor) {
        minors.add(minor);
    }

    // Guardar/Crear/Llenar Excel
    public void saveMinorExcel() {
        try {
            File file = new File("rom/Animals/Minors.xlsx");
            if (file.exists()) {
                XSSFWorkbook workbook;
                try (FileInputStream fis = new FileInputStream(file)) {
                    workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    int lastRow = sheet.getLastRowNum();
                    for (int i = 0; i < minors.size(); i++) {
                        lastRow++;
                        XSSFRow row = sheet.createRow(lastRow);
                        row.createCell(0).setCellValue(minors.get(i).getName());
                        row.createCell(1).setCellValue(minors.get(i).getRace());
                        row.createCell(2).setCellValue(minors.get(i).getSex());
                        row.createCell(3).setCellValue(minors.get(i).getHabitad());
                        row.createCell(4).setCellValue(minors.get(i).getDiseases());
                        row.createCell(5).setCellValue(minors.get(i).getNativeClimate());
                        row.createCell(6).setCellValue(minors.get(i).getDiet());
                    }
                }

                try (FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Minors");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Name");
                row.createCell(1).setCellValue("Race");
                row.createCell(2).setCellValue("Sex");
                row.createCell(3).setCellValue("Habitad");
                row.createCell(4).setCellValue("Diseases");
                row.createCell(5).setCellValue("NativeClimate");
                row.createCell(6).setCellValue("Diet");

                for (int i = 0; i < minors.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(minors.get(i).getName());
                    row.createCell(1).setCellValue(minors.get(i).getRace());
                    row.createCell(2).setCellValue(minors.get(i).getSex());
                    row.createCell(3).setCellValue(minors.get(i).getHabitad());
                    row.createCell(4).setCellValue(minors.get(i).getDiseases());
                    row.createCell(5).setCellValue(minors.get(i).getNativeClimate());
                    row.createCell(6).setCellValue(minors.get(i).getDiet());
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
