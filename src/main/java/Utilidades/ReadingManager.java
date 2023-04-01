/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author garci
 */
public class ReadingManager {
    //método  que  lee  datos desde  el teclado,  y devuelve  solo enteros.

    /**
     *
     * @return
     * @throws IOException
     */
     public static int convertirInt() throws IOException {
        String ingreso;
        int numero;
        //capturar errores  falta
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        ingreso = stdin.readLine();
        numero = Integer.parseInt(ingreso);   
        return numero;
    }
    
    //método  que  lee  datos desde  el teclado,  y devuelve  solo enteros.

    /**
     *
     * @return
     * @throws IOException
     */
     public static Float convertirFloat() throws IOException {
        String ingreso;
        Float numero;
        //capturar errores  falta
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        ingreso = stdin.readLine();
        numero = Float.parseFloat(ingreso); 
        return numero;
    }
    
}
