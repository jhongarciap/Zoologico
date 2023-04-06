/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Control.ComercialDepartment.ArrayListBillSale;
//import Utilities.AdExcel;
import Model.SaleBill;
import static Utilities.AdExcel.deleteRow;
//import static Utilities.AdExcel.getRow;
//import static Utilities.AdExcel.getRowsExcel;
import java.io.File;
//import java.util.ArrayList;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author garci
 */
public class Zoo {

    public static void main(String[] args) {
        ArrayListBillSale arrayListBillSale = new ArrayListBillSale();
        SaleBill saleBill = new SaleBill("2023-04-04", "", 100.0f, 10.0f,1, 90.0f, "John Doe", "Product", "5678");
        //Aquí se agregan elementos al objeto saleBill
        arrayListBillSale.addBillSale(saleBill);
        arrayListBillSale.SaveBillSaleExcel();
//Datos asociados a los metodos AdExcel
        File file = new File("rom/Bills/BillSale.xlsx");
        String sheetName = "BillSale";
        int column = 1;
        String codigo = "BS38";

        //Muestra todas los elementos del excel en un array 
 /*             ArrayList<Row> rows = getRowsExcel(file);
        for (Row row : rows) {
            for (int j = 0; j < row.getLastCellNum(); j++) {
                Cell cell = row.getCell(j);
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print("null" + "\t");
                }
            }
            System.out.println();
        }
 */       
//Eliminar alguna fila 
        deleteRow(codigo, file, sheetName, column);
        //Buscar una fila problema, hay que convertirlo en  array 
//        Row row = getRow(codigo, file, sheetName, column);
        
        //Este solo es para ver si si ejecuta 
  /*     for (Cell celda : row) {
    if (celda.getCellType() == CellType.STRING) {
        System.out.print(celda.getStringCellValue() + "\t");
    } else if (celda.getCellType() == CellType.NUMERIC) {
        System.out.print(celda.getNumericCellValue() + "\t");
    } else {
        System.out.print("\t");
    }
}
System.out.println();
*/
    }

}
