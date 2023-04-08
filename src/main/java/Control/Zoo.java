/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Control.LogisticDepartment.ArrayListDomestic;
import Model.Domestic;
import View.X1;

/**
 *
 * @author garci
 */
public class Zoo {

    public static void main(String[] args) {
        //X1 MainScreen = new X1();
        //MainScreen.setVisible(true);
        // prueba
        ArrayListDomestic domestics = new ArrayListDomestic();
        Domestic domestic = new Domestic("Loco", "Cautiverio", "Juan", "Caballo", "Indefinido", "Ciudad", "Hamburguesas");
        domestics.addDomestic(domestic);
        domestics.saveDomesticExcel();
    }

}
