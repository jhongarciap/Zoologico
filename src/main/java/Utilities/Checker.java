package Utilities;

/**
 *
 * @author USUARIO
 */
public class Checker {
    public static boolean IntChecker(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean FloatChecker(String str) {
        try {
            Float.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
