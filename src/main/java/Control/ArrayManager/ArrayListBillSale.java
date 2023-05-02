/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.BillSale;
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

    public static ArrayList<Row> getRowsSalesExcel() {
        ArrayList<Row> rows = new ArrayList<>();
    try {
        File file = new File("rom/Bills/BillSale.xlsx");
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int lastRow = sheet.getLastRowNum();

            for (int i = 0; i <= lastRow; i++) {
                XSSFRow row = sheet.getRow(i);
                rows.add(row);
            }
            fis.close();
        } else {
            System.out.println("El archivo no existe.");
        }
    } catch (Exception e) {
        System.out.println("Hay un error, revisa.");
    }
    return rows;
}

//Hay que modificarlo y agregarlo a  utilidades
    // Método para sumar todas las ventas
    public Float sumSalesExcel() {
        float totalValue = 0f; // inicializa la variable totalValue como float y en 0

        try {
            File file = new File("rom/Bills/BillSale.xlsx");
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
//Busca y elimina la fila asociada al codigo
    public static void deleteRowSale(String codigo) {
        try {
            // Ruta del archivo Excel
            String filePath = "rom/Bills/BillSale.xlsx";

            // Carga el archivo Excel
            FileInputStream archive = new FileInputStream(new File(filePath));
            XSSFWorkbook book = new XSSFWorkbook(archive);

            // Selecciona la hoja
            XSSFSheet sheet = book.getSheet("BillSale");

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
        }
    }
//Buscar la fila que se necesita 

    public static Row getRowSale(String codigo) {
        try {
            // Ruta del archivo Excel
            String filePath = "rom/Bills/BillSale.xlsx";

            // Carga el archivo Excel
            FileInputStream archive = new FileInputStream(new File(filePath));
            XSSFWorkbook book = new XSSFWorkbook(archive);

            // Selecciona la hoja
            XSSFSheet sheet = book.getSheet("BillSale");

            // Recorre cada fila de la hoja
            for (int i = sheet.getLastRowNum(); i >= sheet.getFirstRowNum(); i--) {
                Row fila = sheet.getRow(i);

                // Compara el código con la celda 1 de la fila
                if (fila.getCell(1).getStringCellValue().equals(codigo)) {
                    // Retorna la fila correspondiente
                    return fila;
                }
            }

            // Si no se encuentra ninguna fila correspondiente, retorna null
            System.out.println("No se encontró ninguna fila con el código " + codigo);

            // Cierra el flujo de entrada
            archive.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}


