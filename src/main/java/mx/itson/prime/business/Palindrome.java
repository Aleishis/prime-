/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.prime.business;
import java.util.ArrayList;

/**
 *
 * @author alelo
 */
public class Palindrome {
    
    public static boolean isPalindrome (String value){
        
        value = value.replaceAll("\\s", "").toLowerCase();
        char[] letras = value.toCharArray();
        
        int counter = letras.length;
        for (char letra : letras){
         
            if (letra != letras[counter - 1]){
                return false;
            }
            counter--;

        }
        return true;
    }
}
