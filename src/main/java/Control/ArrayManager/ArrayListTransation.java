/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Transation;
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
public class ArrayListTransation {

    //Array de Transation
    private ArrayList<Transation> transations = new ArrayList<>();
    //constructor vacio 

    public ArrayListTransation() {
    }

    //Añadir
    public void addTransation(Transation transation) {
        transations.add(transation);
    }

    // Guardar/Crear/Llenar Excel
    public void SaveTransationExcel() {
        try {
            File file = new File("rom/Transations/Transations.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i < transations.size(); i++) {
                    lastRow++;
                    XSSFRow row = sheet.createRow(lastRow);
                    row.createCell(0).setCellValue(transations.get(i).getDate());
                    row.createCell(1).setCellValue(transations.get(i).getCode());
                    row.createCell(2).setCellValue(transations.get(i).getName());
                    row.createCell(3).setCellValue(transations.get(i).getExpenses());
                    row.createCell(4).setCellValue(transations.get(i).getIncome());
                    row.createCell(5).setCellValue(transations.get(i).getDiscount());
                    row.createCell(6).setCellValue(transations.get(i).getProfits());
                    row.createCell(7).setCellValue(transations.get(i).getEspecifications());
                }
                fis.close();

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Transations");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Date");
                row.createCell(1).setCellValue("Code");
                row.createCell(2).setCellValue("Name");
                row.createCell(3).setCellValue("Expenses");
                row.createCell(4).setCellValue("Income");
                row.createCell(5).setCellValue("Discount");
                row.createCell(6).setCellValue("profits");
                row.createCell(7).setCellValue("Specifications");

                for (int i = 0; i < transations.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(transations.get(i).getDate());
                    row.createCell(1).setCellValue(transations.get(i).getCode());
                    row.createCell(2).setCellValue(transations.get(i).getName());
                    row.createCell(3).setCellValue(transations.get(i).getExpenses());
                    row.createCell(4).setCellValue(transations.get(i).getIncome());
                    row.createCell(5).setCellValue(transations.get(i).getDiscount());
                    row.createCell(6).setCellValue(transations.get(i).getProfits());
                    row.createCell(7).setCellValue(transations.get(i).getEspecifications());
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
