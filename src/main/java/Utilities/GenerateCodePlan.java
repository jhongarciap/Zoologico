package Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class GenerateCodePlan {
    public static String generateCodePlan(String baseId){
        int numero=0;
    try {
        File file = new File("rom/Numero/numeroPlanID.txt");
        if (!file.exists()) {
            numero = 1;
        }
        String codigo = baseId + numero;

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
