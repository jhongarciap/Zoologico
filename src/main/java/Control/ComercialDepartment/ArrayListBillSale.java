package Control.ComercialDepartment;

import Control.IList;
import Model.SaleBill;
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
public class ArrayListBillSale implements IList {

    public ArrayListBillSale() {
    }
    private final ArrayList<SaleBill> billsSales = new ArrayList<>();

    @Override
    public void add(Object o) {
        billsSales.add((SaleBill) o);
    }

    public ArrayList<SaleBill> get() {
        return billsSales;
    }

    @Override
    public void saveExcel() {
        try {
            File file = new File("rom/Bills/BillSale.xlsx");
            if (file.exists()) {
                XSSFWorkbook workbook;
                try ( FileInputStream fis = new FileInputStream(file)) {
                    workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    int lastRow = sheet.getLastRowNum();
                    for (int i = 0; i < billsSales.size(); i++) {
                        lastRow++;
                        XSSFRow row = sheet.createRow(lastRow);
                        row.createCell(0).setCellValue(billsSales.get(i).getDate());
                        row.createCell(1).setCellValue(billsSales.get(i).getCode());
                        row.createCell(2).setCellValue(billsSales.get(i).getValue());
                        row.createCell(3).setCellValue(billsSales.get(i).getDiscount());
                        row.createCell(4).setCellValue(billsSales.get(i).getAmount());
                        row.createCell(5).setCellValue(billsSales.get(i).getTotalvalue());
                        row.createCell(6).setCellValue(billsSales.get(i).getCostormerName());
                        row.createCell(7).setCellValue(billsSales.get(i).getProduct());
                        row.createCell(8).setCellValue(billsSales.get(i).getProductld());
                    }
                }

                try ( FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("BillSale");

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

                for (int i = 0; i < billsSales.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(billsSales.get(i).getDate());
                    row.createCell(1).setCellValue(billsSales.get(i).getCode());
                    row.createCell(2).setCellValue(billsSales.get(i).getValue());
                    row.createCell(3).setCellValue(billsSales.get(i).getDiscount());
                    row.createCell(4).setCellValue(billsSales.get(i).getAmount());
                    row.createCell(5).setCellValue(billsSales.get(i).getTotalvalue());
                    row.createCell(6).setCellValue(billsSales.get(i).getCostormerName());
                    row.createCell(7).setCellValue(billsSales.get(i).getProduct());
                    row.createCell(8).setCellValue(billsSales.get(i).getProductld());
                }

                try ( FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            }
        } catch (IOException e) {
            System.out.println("Hay un error, revisa.");
        }
    }

    public void printBillsToTable(JTable tbProducts) {
        DefaultTableModel model = (DefaultTableModel) tbProducts.getModel();
        model.setRowCount(0);
        for (SaleBill bill : billsSales) {
            Object[] rowData = {bill.getDate(), bill.getCode(), bill.getValue(), bill.getDiscount(), bill.getAmount(), bill.getTotalvalue(), bill.getCostormerName(), bill.getProduct(), bill.getProductld()};
            model.addRow(rowData);
        }
        tbProducts.setModel(model);
    }

    public String getTotalSales() {
        Float total = 0.0f;
        String total1 = "";
        for (SaleBill bill : billsSales) {
            total += bill.getTotalvalue();
            total1 = String.valueOf(total);
        }
        return total1;
    }

    public void removeBillSaleCode(String code) {
        for (int i = 0; i < billsSales.size(); i++) {
            if (billsSales.get(i).getCode().equals(code)) {
                billsSales.remove(i);
                break;
            }
        }
    }

    public void clearAllBillsSales() {
        billsSales.clear();
    }

}
