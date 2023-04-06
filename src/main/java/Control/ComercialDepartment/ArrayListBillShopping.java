/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ComercialDepartment;

import Model.ShoppingBill;
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
public class ArrayListBillShopping {

    //Array de bill 
    private ArrayList<ShoppingBill> billsShoppings = new ArrayList<>();
    //añadir 

    public void addBillShopping(ShoppingBill billShopping) {
        billsShoppings.add(billShopping);
    }

// Crear hoja de excel
    public void SaveBillShoppingExcel() {
        try {
            File file = new File("rom/Bills/BillShopping.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i < billsShoppings.size(); i++) {
                    lastRow++;
                    XSSFRow row = sheet.createRow(lastRow);
                    row.createCell(0).setCellValue(billsShoppings.get(i).getDate());
                    row.createCell(1).setCellValue(billsShoppings.get(i).getCode());
                    row.createCell(2).setCellValue(billsShoppings.get(i).getValue());
                    row.createCell(3).setCellValue(billsShoppings.get(i).getDiscount());
                    row.createCell(4).setCellValue(billsShoppings.get(i).getTotalvalue());
                    row.createCell(5).setCellValue(billsShoppings.get(i).getCostormerName());
                    row.createCell(6).setCellValue(billsShoppings.get(i).getProduct());
                    row.createCell(7).setCellValue(billsShoppings.get(i).getProductld());
                    row.createCell(8).setCellValue(billsShoppings.get(i).getAmount());
                }
                fis.close();

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("BillShopping");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Date");
                row.createCell(1).setCellValue("Code");
                row.createCell(2).setCellValue("Value");
                row.createCell(3).setCellValue("Discount");
                row.createCell(4).setCellValue("Total Value");
                row.createCell(5).setCellValue("Customer Name");
                row.createCell(6).setCellValue("Product");
                row.createCell(7).setCellValue("Product ID");
                row.createCell(8).setCellValue("Amount");

                for (int i = 0; i < billsShoppings.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(billsShoppings.get(i).getDate());
                    row.createCell(1).setCellValue(billsShoppings.get(i).getCode());
                    row.createCell(2).setCellValue(billsShoppings.get(i).getValue());
                    row.createCell(3).setCellValue(billsShoppings.get(i).getDiscount());
                    row.createCell(4).setCellValue(billsShoppings.get(i).getTotalvalue());
                    row.createCell(5).setCellValue(billsShoppings.get(i).getCostormerName());
                    row.createCell(6).setCellValue(billsShoppings.get(i).getProduct());
                    row.createCell(7).setCellValue(billsShoppings.get(i).getProductld());
                    row.createCell(8).setCellValue(billsShoppings.get(i).getAmount());
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
