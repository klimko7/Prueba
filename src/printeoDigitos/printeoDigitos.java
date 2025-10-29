/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package printeoDigitos;

import java.util.Scanner;

/**
 *
 * @author yoivi
 */
public class printeoDigitos {
    
    //PRINTEO DE DIGITOS DE UN INT
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter any integer: ");
        
        String a = scanner.nextLine();                //PIDO STRING

        
        for (char simb : a.toCharArray()) {           //CONVIERTO String en array con metodo toCharArray, y RECORRO ARRAY DE CHARACTERS CON UN FOR-EACH y
            System.out.println(simb);
            
        }
        
        
        
    }
}
