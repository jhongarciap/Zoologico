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
        int number;
    try {
        // Leemos el número desde el archivo
        File file = new File("rom/Numero/numberPlanID.txt");
        if (!file.exists()) {
            // If the file doesn't exist, sets its number to 1 for being the
            // first code generated
            number = 1;
        } else {
            try (Scanner scanner = new Scanner(file)) {
                number = Integer.parseInt(scanner.nextLine());
            }
        }
        // Generate the code for the plans
        String code = baseId + number;

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(String.valueOf(number + 1));
        }

        return code;
    } catch (IOException e) {
        System.out.println("Error al generar el código: " + e.getMessage());
        return null;
    }
  }
}
