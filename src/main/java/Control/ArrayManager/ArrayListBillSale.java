/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.BillSale;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author garci
 */
public class ArrayListBillSale {

    public ArrayListBillSale() {
    }

    //Array de bill 
    private final ArrayList<BillSale> billsSales = new ArrayList<>();

    //añadir 
    public void addBillSale(BillSale billsale) {
        billsSales.add(billsale);
    }

    //Crear Hoja Excel BillSales
    /**
     *
     */
// Guardar/Crear/Llenar Excel
    public void SaveBillSaleExcel() {
        try {
            File file = new File("rom/Bills/BillSale.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i < billsSales.size(); i++) {
                    lastRow++;
                    XSSFRow row = sheet.createRow(lastRow);
                    row.createCell(0).setCellValue(billsSales.get(i).getDate());
                    row.createCell(1).setCellValue(billsSales.get(i).getCode());
                    row.createCell(2).setCellValue(billsSales.get(i).getValue());
                    row.createCell(3).setCellValue(billsSales.get(i).getDiscount());
                    row.createCell(4).setCellValue(billsSales.get(i).getTotalvalue());
                    row.createCell(5).setCellValue(billsSales.get(i).getCostormerName());
                    row.createCell(6).setCellValue(billsSales.get(i).getProduct());
                    row.createCell(7).setCellValue(billsSales.get(i).getProductld());
                    row.createCell(8).setCellValue(billsSales.get(i).getAmount());
                }
                fis.close();

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("BillSale");

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

                for (int i = 0; i < billsSales.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(billsSales.get(i).getDate());
                    row.createCell(1).setCellValue(billsSales.get(i).getCode());
                    row.createCell(2).setCellValue(billsSales.get(i).getValue());
                    row.createCell(3).setCellValue(billsSales.get(i).getDiscount());
                    row.createCell(4).setCellValue(billsSales.get(i).getTotalvalue());
                    row.createCell(5).setCellValue(billsSales.get(i).getCostormerName());
                    row.createCell(6).setCellValue(billsSales.get(i).getProduct());
                    row.createCell(7).setCellValue(billsSales.get(i).getProductld());
                    row.createCell(8).setCellValue(billsSales.get(i).getAmount());
                }

                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            }
        } catch (Exception e) {
            System.out.println("Hay un error, revisa.");
        }
    }
// Método para mostrar todas las filas del archivo Excel

    public void ShowRowsExcel() {
        try {
            File file = new File("rom/Bills/BillSale.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i <= lastRow; i++) {
                    XSSFRow row = sheet.getRow(i);
                    System.out.println("Fila " + (i + 1) + ":");
                    XSSFCell celda0 = row.getCell(0);
                    XSSFCell celda1 = row.getCell(1);
                    XSSFCell celda2 = row.getCell(4);
                    System.out.println(celda0);
                    System.out.println(celda1);
                    System.out.println(celda2);
                }
                fis.close();
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (Exception e) {
            System.out.println("Hay un error, revisa.");
        }
    }

    // Método para sumar todas las ventas
      Float TotalValue=0f;
    public Float sumSalesExcel() {
        //Float TotalValue=0f;
        try {
            File file = new File("rom/Bills/BillSale.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();
                for (int i = 0; i <= lastRow; i++) {
                    XSSFRow row = sheet.getRow(i);
                    XSSFCell celda2 = row.getCell(4);
                    String stringValue = celda2.toString();
                    Float value = Float.valueOf(stringValue);
                    TotalValue += value;
                }
                fis.close();
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (Exception e) {
            System.out.println("Hay un error, revisa.");
        }
        return TotalValue;
    }

    //Para jtable 
    /*public DefaultTableModel getTableModelFromExcel() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Columna 1");
    model.addColumn("Columna 2");

    try {
        File file = new File("rom/Bills/BillSale.xlsx");
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int lastRow = sheet.getLastRowNum();

            for (int i = 0; i <= lastRow; i++) {
                XSSFRow row = sheet.getRow(i);
                String celda0 = row.getCell(0).getStringCellValue();
                String celda1 = row.getCell(3).getStringCellValue();
                model.addRow(new Object[] { celda0, celda1 });
            }
            fis.close();
        } else {
            System.out.println("El archivo no existe.");
        }
    } catch (Exception e) {
        System.out.println("Hay un error, revisa.");
    }

    return model;
}
     */
}
