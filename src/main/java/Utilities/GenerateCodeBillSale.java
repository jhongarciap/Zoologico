package Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author garci
 */
public class GenerateCodeBillSale {
    public static String generateCodeSale(String letra) {
    int numero=0;
    try {
        File file = new File("rom/Numero/numeroBillSale.txt");
        if (!file.exists()) {
            numero = 1;
        }
        String codigo = letra + numero;

        try (
                FileWriter writer = new FileWriter(file)) {
            writer.write(String.valueOf(numero + 1));
        }

        return codigo;
    } catch (IOException e) {
        System.out.println("Error al generar el código: " + e.getMessage());
        return null;
    }
}






}
