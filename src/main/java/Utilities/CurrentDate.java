/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author garci
 */
public class CurrentDate {
    public static String currentDate(){

    Date date=new Date();
    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
    
    return dateFormat.format(date);   
}
    
}
