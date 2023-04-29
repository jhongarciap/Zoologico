package Utilities;

import static Utilities.AdExcel.getRowsExcel;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author garci
 */
public class loadExcelDataToTable {

    public static void updateTableFromExcel(JTable table, File excelFile) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        ArrayList<Row> data = getRowsExcel(excelFile);
        model.setRowCount(0);
        for (int rowIndex = 1; rowIndex < data.size(); rowIndex++) {
            Row row = data.get(rowIndex);
            Object[] rowData = new Object[row.getLastCellNum()];
            for (int i = 0; i < rowData.length; i++) {
                Cell cell = row.getCell(i);
                rowData[i] = cell == null ? "" : cell.toString();
            }
            model.addRow(rowData);
        }
        table.setDefaultEditor(Object.class, null);
    }
    
    public static void updateTableFromExcelOneAtribute(JTable table, File excelFile, String value, int columnValue) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        boolean hasData = false;
        ArrayList<Row> data = getRowsExcel(excelFile);
        model.setRowCount(0);
        for (int rowIndex = 1; rowIndex < data.size(); rowIndex++) {
            Row row = data.get(rowIndex);
            Object[] rowData = new Object[row.getLastCellNum()];
            for (int i = 0; i < rowData.length; i++) {
                if (row.getCell(columnValue).getStringCellValue().equals(value)) {
                    Cell cell = row.getCell(i);
                    rowData[i] = cell == null ? "" : cell.toString();
                    if (!rowData[i].equals("")) {
                        hasData = true;
                    }
                }
            }
            if (hasData == true) {
                model.addRow(rowData);
            }
        }
    }

    public static void updateTableFromExcelTwoAtribute(JTable table, File excelFile, String value1, int columnValue1, String value2, int columnValue2) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        boolean hasData = false;
        ArrayList<Row> data = getRowsExcel(excelFile);
        model.setRowCount(0);
        for (int rowIndex = 1; rowIndex < data.size(); rowIndex++) {
            Row row = data.get(rowIndex);
            Object[] rowData = new Object[row.getLastCellNum()];
            for (int i = 0; i < rowData.length; i++) {
                if (row.getCell(columnValue1).getStringCellValue().equals(value1) && row.getCell(columnValue2).getStringCellValue().equals(value2)) {
                    Cell cell = row.getCell(i);
                    rowData[i] = cell == null ? "" : cell.toString();
                    if (!rowData[i].equals("")) {
                        hasData = true;
                    }
                }
            }
            if (hasData == true) {
                model.addRow(rowData);
            }
        }
    }
    public static void updateTableFromTwoExcelFiles(JTable table, File excelFile1, File excelFile2) {
        updateTableFromExcel(table, excelFile1);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        ArrayList<Row> data2 = getRowsExcel(excelFile2);
        for (int rowIndex = 1; rowIndex < data2.size(); rowIndex++) {
            Row row = data2.get(rowIndex);
            Object[] rowData = new Object[row.getLastCellNum()];
            for (int i = 0; i < rowData.length; i++) {
                Cell cell = row.getCell(i);
                rowData[i] = cell == null ? "" : cell.toString();
            }
            model.addRow(rowData);
        }
    }
}
