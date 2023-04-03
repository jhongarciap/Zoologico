/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.BillShopping;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author garci
 */
public class ArrayListBillShopping {

    //Array de bill 
    private ArrayList<BillShopping> billsShoppings = new ArrayList<>();
    //añadir 

    public void addBillShopping(BillShopping billShopping) {
        billsShoppings.add(billShopping);
    }

// Guardar/Crear/Llenar Excel 
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
    // Método para mostrar todas las filas del archivo Excel

    public void ShowRowsShoppingExcel() {
        try {
            File file = new File("rom/Bills/BillShopping.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i <= lastRow; i++) {
                    XSSFRow row = sheet.getRow(i);
                    System.out.println("Fila " + (i + 1) + ":");
                    XSSFCell cell0 = row.getCell(0);
                    XSSFCell cell1 = row.getCell(1);
                    XSSFCell cell2 = row.getCell(4);
                    System.out.println(cell0);
                    System.out.println(cell1);
                    System.out.println(cell2);
                }
                fis.close();
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (Exception e) {
            System.out.println("Hay un error, revisa.");
        }
    }

    // Método para sumar todas las compras
    public Float sumShoppinsExcel() {
        float totalValue = 0f; // inicializa la variable totalValue como float y en 0

        try {
            File file = new File("rom/Bills/BillShopping.xlsx");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                int lastRow = sheet.getLastRowNum();

                for (int i = 0; i <= lastRow; i++) {
                    XSSFRow row = sheet.getRow(i);

                    // verifica que la fila exista y no sea nula
                    if (row != null) {
                        XSSFCell cell = row.getCell(4);

                        // verifica que la celda exista y no sea nula
                        if (cell != null) {
                            String stringValue = cell.toString();

                            // verifica que el valor de la celda sea un número flotante
                            try {
                                Float value = Float.parseFloat(stringValue);
                                totalValue += value;
                            } catch (NumberFormatException e) {

                            }
                        }
                    }
                }
                fis.close();
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
        return totalValue; // retorna el valor total de las ventas
    }

    public static void deleteRowShopping(String codigo) {
        try {
            // Ruta del archivo Excel
            String filePath = "rom/Bills/BillShopping.xlsx";

            // Carga el archivo Excel
            FileInputStream archive = new FileInputStream(new File(filePath));
            XSSFWorkbook book = new XSSFWorkbook(archive);

            // Selecciona la hoja
            XSSFSheet sheet = book.getSheet("BillShopping");

            // Recorre cada fila de la hoja
            for (int i = sheet.getLastRowNum(); i >= sheet.getFirstRowNum(); i--) {
                Row fila = sheet.getRow(i);

                // Compara el código con la celda 1 de la fila
                if (fila.getCell(1).getStringCellValue().equals(codigo)) {
                    // Elimina la fila y desplaza las filas hacia arriba
                    sheet.removeRow(fila);
                    sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
                    i--; // Decrementa el contador para evitar omitir la fila siguiente
                }
            }

            // Guarda los cambios en el archivo
            FileOutputStream exit = new FileOutputStream(new File(filePath));
            book.write(exit);

            // Cierra los flujos de entrada y salida
            archive.close();
            exit.close();

        } catch (Exception e) {
            e.printStackTrace();
        }}
}

    
