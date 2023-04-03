/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

;
import Model.Wild;
import Control.ArrayManager.ArrayListWild;
import Model.BillSale;
import Control.ArrayManager.ArrayListBillSale;

/**
 *
 * @author garci
 */


public class Zoo {

    public static void main(String[] args) {
        ArrayListBillSale billSales = new ArrayListBillSale();
        ArrayListWild wilds = new ArrayListWild();
        Wild wild = new Wild("jhon", "jhon", "jhon", "jhon", "jhon", "jhon", "jhon");
        wilds.addWild(wild);
        wilds.saveWildExcel();

// Agregar nuevas ventas a la lista de ventas
        BillSale billSale = new BillSale("2023-04-04", "", 100.0f, 10.0f, 90.0f, "John Doe", "Product", "5678", 1);
        billSales.addBillSale(billSale);

// Guardar todas las ventas, incluyendo las nuevas, en el archivo Excel
        billSales.SaveBillSaleExcel();
        //billSales.ShowRowsSalesExcel();

        //Float total = billSales.sumSalesExcel();
        //System.out.println("La suma de todas las celdas es: " + total);
        //Elimina
        billSales.deleteRowSale("BS2");

    }
}
