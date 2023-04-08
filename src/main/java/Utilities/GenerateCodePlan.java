/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class GenerateCodePlan {
    public static String generateCodePlan(String baseId){
        int numero;
    try {
        // Leemos el número desde el archivo
        File file = new File("rom/Numero/numeroPlanID.txt");
        if (!file.exists()) {
            // Si el archivo no existe, empezamos con el número 1
            numero = 1;
        } else {
            Scanner scanner = new Scanner(file);
            numero = Integer.parseInt(scanner.nextLine());
            scanner.close();
        }
        
        // Generamos el código con la letra y el número
        String codigo = baseId + numero;

        try ( // Actualizamos el número en el archivo
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
