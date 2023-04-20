/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ComercialDepartment;

import Model.SaleBill;
import Model.ShoppingBill;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
                    row.createCell(4).setCellValue(billsShoppings.get(i).getAmount());
                    row.createCell(5).setCellValue(billsShoppings.get(i).getTotalvalue());
                    row.createCell(6).setCellValue(billsShoppings.get(i).getCostormerName());
                    row.createCell(7).setCellValue(billsShoppings.get(i).getProduct());
                    row.createCell(8).setCellValue(billsShoppings.get(i).getProductld());
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
                row.createCell(4).setCellValue("Amount");
                row.createCell(5).setCellValue("Total Value");
                row.createCell(6).setCellValue("Customer Name");
                row.createCell(7).setCellValue("Product");
                row.createCell(8).setCellValue("Product ID");

                for (int i = 0; i < billsShoppings.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(billsShoppings.get(i).getDate());
                    row.createCell(1).setCellValue(billsShoppings.get(i).getCode());
                    row.createCell(2).setCellValue(billsShoppings.get(i).getValue());
                    row.createCell(3).setCellValue(billsShoppings.get(i).getDiscount());
                    row.createCell(4).setCellValue(billsShoppings.get(i).getAmount());
                    row.createCell(5).setCellValue(billsShoppings.get(i).getTotalvalue());
                    row.createCell(6).setCellValue(billsShoppings.get(i).getCostormerName());
                    row.createCell(7).setCellValue(billsShoppings.get(i).getProduct());
                    row.createCell(8).setCellValue(billsShoppings.get(i).getProductld());
                }

                try (FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            }
        } catch (IOException e) {
            System.out.println("Hay un error, revisa.");
        }
    }
    public void printBillsToTable(JTable tbProducts) {
    // Obtener el modelo actual de la tabla
    DefaultTableModel model = (DefaultTableModel) tbProducts.getModel();
    
    // Limpiar los datos existentes en la tabla
    model.setRowCount(0);
    
    // Recorrer la lista de facturas de venta
    for (ShoppingBill bill : billsShoppings) {
        // Agregar una nueva fila al modelo de la tabla
        Object[] rowData = { bill.getDate(), bill.getCode(), bill.getValue(), bill.getDiscount(), bill.getAmount(), bill.getTotalvalue(), bill.getCostormerName(), bill.getProduct(), bill.getProductld() };
        model.addRow(rowData);
    }
    
    // Establecer el modelo actualizado en la tabla
    tbProducts.setModel(model);
}
//Suma todas las compras de la array 
public String getTotalSales() {
    Float total = 0.0f;
    String total1= "";
    for (ShoppingBill bill : billsShoppings) {
        total += bill.getTotalvalue();
        total1=String.valueOf(total);
    }
    return total1;
}
//Eliminar el producto de la array 
public void removeBillSaleCode(String code) {
    for (int i = 0; i < billsShoppings.size(); i++) {
        if (billsShoppings.get(i).getCode().equals(code)) {
            billsShoppings.remove(i);
            break;
        }
    }
}
}
