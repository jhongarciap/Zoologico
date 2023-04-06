/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.AdministrativeDepartment;

import Model.Employee;
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
public class ArrayListEmployee {
    //Array de Employee

    private ArrayList<Employee> employees = new ArrayList<>();

    public ArrayListEmployee() {

    }

    //Añadir
    public void addemployee(Employee employee) {
        employees.add(employee);
    }
   // Guardar/Crear/Llenar Excel
    public void SaveEmployeeExcel() {
        try {
            File file = new File("rom/Employees.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i < employees.size(); i++) {
                    lastRow++;
                    XSSFRow row = sheet.createRow(lastRow);
                    row.createCell(0).setCellValue(employees.get(i).getId());
                    row.createCell(1).setCellValue(employees.get(i).getName());
                    row.createCell(2).setCellValue(employees.get(i).getPost());
                    row.createCell(3).setCellValue(employees.get(i).getFuncions());
                }
                fis.close();

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Employees");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("ID");
                row.createCell(1).setCellValue("Name");
                row.createCell(2).setCellValue("Post");
                row.createCell(3).setCellValue("Funcions");

                for (int i = 0; i < employees.size(); i++) {
                    row = sheet.createRow(i + 1);
                   row.createCell(0).setCellValue(employees.get(i).getId());
                    row.createCell(1).setCellValue(employees.get(i).getName());
                    row.createCell(2).setCellValue(employees.get(i).getPost());
                    row.createCell(3).setCellValue(employees.get(i).getFuncions());
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
