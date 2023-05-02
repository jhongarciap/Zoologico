package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AdExcel {

    public AdExcel() {
    }

//Muestra todos los elementos de excel

    public static ArrayList<Row> getRowsExcel(File file) {
        ArrayList<Row> rows = new ArrayList<>();
        try {
            if (file.exists()) {
                try (FileInputStream fis = new FileInputStream(file)) {
                    XSSFWorkbook workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    int lastRow = sheet.getLastRowNum();
                    for (int i = 0; i <= lastRow; i++) {
                        XSSFRow row = sheet.getRow(i);
                        rows.add(row);
                    }
                }
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println("Hay un error, revisa.");
        }
        return rows;
    }
//Suma ventas y compras en total

    public static Float sumBillExcel(File file) {
        float totalValue = 0f;
        try {
            if (file.exists()) {
                try (FileInputStream fis = new FileInputStream(file)) {
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
                }
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
        return totalValue; // retorna el valor total de las ventas
    }
//Elimina y organiza el excel 

    public static void deleteRow(String codigo, File file, String sheetName, int columnToDelete) {
        try {
            // Carga el archivo Excel
            FileInputStream archive = new FileInputStream(file);
            XSSFWorkbook book = new XSSFWorkbook(archive);

            // Selecciona la hoja
            XSSFSheet sheet = book.getSheet(sheetName);

            boolean rowDeleted = false; // Variable para controlar si se eliminó una fila en la iteración actual del ciclo for

            // Recorre cada fila de la hoja
            for (int i = sheet.getLastRowNum(); i >= sheet.getFirstRowNum(); i--) {
                Row fila = sheet.getRow(i);

                // Compara el código con la celda de la columna especificada
                if (fila.getCell(columnToDelete).getStringCellValue().equals(codigo)) {
                    if (i == sheet.getLastRowNum()) { // Si es la última fila, elimina sin desplazar
                        sheet.removeRow(fila);
                    } else { // De lo contrario, elimina y desplaza hacia arriba
                        sheet.removeRow(fila);
                        sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
                    }
                    rowDeleted = true;
                }
            }

            if (rowDeleted) {
                try ( // Guarda los cambios en el archivo
                        FileOutputStream exit = new FileOutputStream(file)) {
                    book.write(exit);

                    // Cierra los flujos de entrada y salida
                    archive.close();
                }
            }

        } catch (IOException e) {
        }
    }

//Convertir a row en un vector 
    public static String[] rowToVector(Row row) {
        int numCells = row.getLastCellNum();
        String[] vector = new String[numCells];

        for (int i = 0; i < numCells; i++) {
            Cell cell = row.getCell(i);
            if (cell != null) {
                vector[i] = cell.toString();
            } else {
                vector[i] = "";
            }
        }

        return vector;
    }

    public static Row getRow(String codigo, File file, String sheetName, int cellNum) {
        try {
            try ( // Carga el archivo Excel
                    FileInputStream archive = new FileInputStream(file)) {
                XSSFWorkbook book = new XSSFWorkbook(archive);
                // Selecciona la hoja
                XSSFSheet sheet = book.getSheet(sheetName);
                // Recorre cada fila de la hoja
                for (int i = sheet.getLastRowNum(); i >= sheet.getFirstRowNum(); i--) {
                    Row fila = sheet.getRow(i);

                    // Compara el código con la celda especificada
                    if (fila.getCell(cellNum).getStringCellValue().equals(codigo)) {
                        // Retorna la fila correspondiente
                        return fila;
                    }
                }   // Si no se encuentra ninguna fila correspondiente, retorna null
                System.out.println("No se encontró ninguna fila con el código " + codigo);
                // Cierra el flujo de entrada
            }

        } catch (IOException e) {
        }

        return null;
    }
    
//  Obetener una columna de una tabla
    public ArrayList<String> getColumn(File file, int columnIndex) {
    ArrayList<String> columnValues = new ArrayList<>();

    try {
        if (file.exists()) {
            XSSFWorkbook workbook;
            try (FileInputStream fis = new FileInputStream(file)) {
                workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);

                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    XSSFRow row = sheet.getRow(i);
                    if (row != null) {
                        XSSFCell cell = row.getCell(columnIndex);
                        if (cell != null) {
                            columnValues.add(cell.getStringCellValue());
                        }
                    }
                }
            }
        }
    } catch (IOException e) {
        // Manejo de excepciones
    }

    return columnValues;
}

    //  Obetener una columna de una tabla
    public ArrayList<Float> getColumnFloat(File file, int columnIndex) {
    ArrayList<Float> columnValues = new ArrayList<>();

    try {
        if (file.exists()) {
            XSSFWorkbook workbook;
            try (FileInputStream fis = new FileInputStream(file)) {
                workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);

                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    XSSFRow row = sheet.getRow(i);
                    if (row != null) {
                        XSSFCell cell = row.getCell(columnIndex);
                        if (cell != null) {
                            float cellFloat = Float.parseFloat(Double.toString(cell.getNumericCellValue()));
                            columnValues.add(cellFloat);
                        }
                    }
                }
            }
        }
    } catch (IOException e) {
        // Manejo de excepciones
    }

    return columnValues;
}

}
