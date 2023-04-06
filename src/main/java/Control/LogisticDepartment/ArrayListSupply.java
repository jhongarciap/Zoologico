/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.LogisticDepartment;

import Model.Supply;
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
public class ArrayListSupply {

    //Array de Supply
    private ArrayList<Supply> supllys = new ArrayList<>();
    //constructor vacio 

    public ArrayListSupply() {
    }

    //añadir
    public void addSupply(Supply supply) {
        supllys.add(supply);
    }

    // Guardar/Crear/Llenar Excel
    public void SaveSupplyeExcel() {
        try {
            File file = new File("rom/Supply.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i < supllys.size(); i++) {
                    lastRow++;
                    XSSFRow row = sheet.createRow(lastRow);
                    row.createCell(0).setCellValue(supllys.get(i).getType());
                    row.createCell(1).setCellValue(supllys.get(i).getName());
                    row.createCell(2).setCellValue(supllys.get(i).getAnimal());
                    row.createCell(3).setCellValue(supllys.get(i).getSpecifications());
                }
                fis.close();

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Supplys");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Type");
                row.createCell(1).setCellValue("Name");
                row.createCell(2).setCellValue("Animal");
                row.createCell(3).setCellValue("Specifications");

                for (int i = 0; i < supllys.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(supllys.get(i).getType());
                    row.createCell(1).setCellValue(supllys.get(i).getName());
                    row.createCell(2).setCellValue(supllys.get(i).getAnimal());
                    row.createCell(3).setCellValue(supllys.get(i).getSpecifications());
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
