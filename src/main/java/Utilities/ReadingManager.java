package Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author garci
 */
public class ReadingManager {

    /**
     *
     * @return
     * @throws IOException
     */
     public static int convertirInt() throws IOException {
        String ingreso;
        int numero;
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        ingreso = stdin.readLine();
        numero = Integer.parseInt(ingreso);   
        return numero;
    }

    /**
     *
     * @return
     * @throws IOException
     */
     public static Float convertirFloat() throws IOException {
        String ingreso;
        Float numero;
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        ingreso = stdin.readLine();
        numero = Float.valueOf(ingreso); 
        return numero;
    }
    
}
