/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.AdministrativeDepartment;

import Model.Plan;
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
public class ArrayListPlan {

    //Array de Plan
    private ArrayList<Plan> plans = new ArrayList<>();

    //Contructor vacio
    public ArrayListPlan() {
    }

    //Añadir
    public void addPlan(Plan plan) {
        plans.add(plan);
    }

// Guardar/Crear/Llenar Excel
    public void SavePlanExcel() {
        try {
            File file = new File("rom/Plans.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i < plans.size(); i++) {
                    lastRow++;
                    XSSFRow row = sheet.createRow(lastRow);
                    row.createCell(0).setCellValue(plans.get(i).getProductId());
                    row.createCell(1).setCellValue(plans.get(i).getProduct());
                    row.createCell(2).setCellValue(plans.get(i).getValue());
                    row.createCell(3).setCellValue(plans.get(i).getSfications());
                }
                fis.close();

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Plans");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Product ID");
                row.createCell(1).setCellValue("Product");
                row.createCell(2).setCellValue("Value");
                row.createCell(3).setCellValue("sfications");

                for (int i = 0; i < plans.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(plans.get(i).getProductId());
                    row.createCell(1).setCellValue(plans.get(i).getProduct());
                    row.createCell(2).setCellValue(plans.get(i).getValue());
                    row.createCell(3).setCellValue(plans.get(i).getSfications());
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
