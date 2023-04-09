/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import static Utilities.AdExcel.getRowsExcel;
import java.io.File;
import java.util.ArrayList;
import static javax.management.Query.value;
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
        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Obtener los datos del archivo Excel
        ArrayList<Row> data = getRowsExcel(excelFile);

        // Limpiar la tabla
        model.setRowCount(0);

        // Agregar los datos a la tabla, comenzando desde la fila 2
        for (int rowIndex = 1; rowIndex < data.size(); rowIndex++) {
            Row row = data.get(rowIndex);
            Object[] rowData = new Object[row.getLastCellNum()];
            for (int i = 0; i < rowData.length; i++) {
                Cell cell = row.getCell(i);
                rowData[i] = cell == null ? "" : cell.toString();
            }
            model.addRow(rowData);
        }

        // Hacer que la tabla no sea editable
        table.setDefaultEditor(Object.class, null);
    }

    public static void updateTableFromExcelAtribute(JTable table, File excelFile, String value1, String value2) {
        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        boolean hasData = false;

        // Obtener los datos del archivo Excel
        ArrayList<Row> data = getRowsExcel(excelFile);

        // Limpiar la tabla
        model.setRowCount(0);

        // Agregar los datos a la tabla, comenzando desde la fila 2
        for (int rowIndex = 1; rowIndex < data.size(); rowIndex++) {
            Row row = data.get(rowIndex);
            Object[] rowData = new Object[row.getLastCellNum()];
            for (int i = 0; i < rowData.length; i++) {
                if (row.getCell(0).getStringCellValue().equals(value1) && row.getCell(2).getStringCellValue().equals(value2)) {
                    Cell cell = row.getCell(i);
                    rowData[i] = cell == null ? "" : cell.toString();
                    if (!rowData[i].equals("")) {
                        hasData = true;
                    }
                }
            }
            if (hasData) {
                model.addRow(rowData);
            }
        }

        // Hacer que la tabla no sea editable
        table.setDefaultEditor(Object.class, null);
    }

//Se llena una tabla con dos archivos excel.
    public static void updateTableFromTwoExcelFiles(JTable table, File excelFile1, File excelFile2) {
        // Actualizar tabla con el primer archivo de Excel
        updateTableFromExcel(table, excelFile1);

        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Obtener los datos del segundo archivo Excel
        ArrayList<Row> data2 = getRowsExcel(excelFile2);

        // Agregar los datos a la tabla, comenzando desde la fila 2
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
