/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

;
import Utilities.BillExcel;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowSale;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import java.util.ArrayList;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowSale;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Cell;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowSale;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import java.util.ArrayList;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowSale;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowsSalesExcel;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowSale;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import java.util.ArrayList;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowSale;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Cell;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowSale;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import java.util.ArrayList;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import static Control.ArrayManager.ArrayListBillSale.getRowSale;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;
import org.apache.poi.ss.usermodel.Row;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.SaleBill;
import Control.ArrayManager.ArrayListBillSale;

/**
 *
 * @author garci
 */


public class Zoo {

    public static void main(String[] args) {
        ArrayList<SaleBill> billsSales = new ArrayList();

// Agregar nuevas ventas a la lista de ventas
        SaleBill billSale = new SaleBill("2023-04-04", "", 100.0f, 10.0f, 90.0f, "John Doe", "Product", "5678", 1);
        billsSales.add(billSale);
        BillExcel a = new BillExcel();
        a.saveBillSaleExcel(billsSales);

// Guardar todas las ventas, incluyendo las nuevas, en el archivo Excel
        //billSales.SaveBillSaleExcel();
        //billSales.ShowRowsSalesExcel();

        //Float total = billSales.sumSalesExcel();
        //System.out.println("La suma de todas las celdas es: " + total);
        //Elimina
        // billSales.deleteRowSale("BS2");
        //Muestra todas los elementos del excel en un array 
  /*    ArrayList<Row> rows = getRowsSalesExcel();
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
  /*
        // Llamada al método para obtener la fila correspondiente
        Row fila = getRowSale("BS3");

// Si la fila es distinta de null, mostrar los valores en la consola
        if (fila != null) {
            System.out.println("Fila encontrada:");
            System.out.println("Celda 0: " + fila.getCell(0));
            System.out.println("Celda 1: " + fila.getCell(1));
            System.out.println("Celda 2: " + fila.getCell(2));
        } else {
            System.out.println("No se encontró ninguna fila con el código especificado.");
        }
*/
    }

}
