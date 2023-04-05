package Utilities;

import Model.*;
import ArrayManager.*;
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

public class BillExcel {

    public BillExcel() {
    }

    public void createExcel(ArrayList list) {
        if (list instanceof ArrayList<?>) {
            Class<?> type = list.getClass().getComponentType();
            if (type != null && type.equals(SaleBill.class)) {
                ArrayListBillSale excel = new ArrayListBillSale();
                excel.SaveBillSaleExcel();
            }
            if (type != null && type.equals(ShoppingBill.class)) {
                ArrayListBillShopping excel = new ArrayListBillShopping();
                excel.SaveBillShoppingExcel();
            }
            if (type != null && type.equals(ShoppingBill.class)) {
                ArrayListBillShopping excel = new ArrayListBillShopping();
                excel.SaveBillShoppingExcel();
            }
            if (type != null && type.equals(Domestic.class)) {
                ArrayListDomestic excel = new ArrayListDomestic();
                excel.saveDomesticExcel();
            }
            if (type != null && type.equals(Employee.class)) {
                ArrayListEmployee excel = new ArrayListEmployee();
                excel.SaveEmployeeExcel();
            }
            if (type != null && type.equals(Minor.class)) {
                ArrayListMinor excel = new ArrayListMinor();
                excel.saveMinorExcel();
            }
            if (type != null && type.equals(Plan.class)) {
                ArrayListPlan excel = new ArrayListPlan();
                excel.SavePlanExcel();
            }
            if (type != null && type.equals(Supply.class)) {
                ArrayListSupply excel = new ArrayListSupply();
                excel.SaveSupplyeExcel();
            }
            if (type != null && type.equals(Transation.class)) {
                ArrayListTransation excel = new ArrayListTransation();
                excel.SaveTransationExcel();
            }
            if (type != null && type.equals(Wild.class)) {
                ArrayListWild excel = new ArrayListWild();
                excel.saveWildExcel();
            }

        }
    }

    public static ArrayList<Row> getRowsExcel(File file) {
        ArrayList<Row> rows = new ArrayList<>();
        try {
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

    public Float sumBillExcel(File file) {
        float totalValue = 0f;
        try {
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
                                Float value = Float.valueOf(stringValue);
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

    public static void deleteRowBill(String codigo, String filePath) {
        try {
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

        } catch (IOException e) {
        }
    }

    public static Row getRowBill(String codigo, String filePath) {
        try {
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
