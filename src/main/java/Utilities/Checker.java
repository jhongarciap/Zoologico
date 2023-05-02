/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

/**
 *
 * @author USUARIO
 */
public class Checker {
    /* El método en si no va a hacer que se vuelva a preguntar puesto que eso 
     * se debe hacer dentro del codigo de donde se va a llamar el IntChecker
     * eso se logra con un ciclo while que vaya preguntando por cada iteración
     * que tenga al método como variable iteradora.
    */
    public static boolean IntChecker(String str) { // Este método sirve para validar si el String ingresado es Integer o String.
        try {
            Integer.valueOf(str);
            return true; // Retorna true si el String puede ser cambiado en su totalidad en Integer.
        } catch (NumberFormatException e) {
            return false; // En caso contrario, retorna false.
        }
    }
    
    public static boolean FloatChecker(String str) { // Este método sirve para validar si el String ingresado es Float o String.
        try {
            Float.valueOf(str);
            return true; // Retorna true si el String puede ser cambiado en su totalidad en Integer.
        } catch (NumberFormatException e) {
            return false; // En caso contrario, retorna false.
        }
    }
}
