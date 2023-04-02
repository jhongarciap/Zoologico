/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

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
    int numero;
    try {
        // Leemos el número desde el archivo
        File file = new File("rom/Numero/numeroBillSale.txt");
        if (!file.exists()) {
            // Si el archivo no existe, empezamos con el número 1
            numero = 1;
        } else {
            Scanner scanner = new Scanner(file);
            numero = Integer.parseInt(scanner.nextLine());
            scanner.close();
        }
        
        // Generamos el código con la letra y el número
        String codigo = letra + numero;

        // Actualizamos el número en el archivo
        FileWriter writer = new FileWriter(file);
        writer.write(String.valueOf(numero + 1));
        writer.close();

        return codigo;
    } catch (IOException e) {
        System.out.println("Error al generar el código: " + e.getMessage());
        return null;
    }
}






}