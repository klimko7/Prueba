/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package piramide;

import java.util.Scanner;

/**
 *
 * @author yoivi
 */
public class piramide {
    
    public static void main(String args[]){
        
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Please enter height of pyramid: ");
        
       int height = scanner.nextInt();
        
        
       outer1: 
         for(int i = 0; i < height; i++) {
             System.out.println("");
       inner : 
           for(int j = 0; j <= i; j++) {
                System.out.print("*");
            
                }
         }
        System.out.println("");

       
        outer2 : 
           for(int k = height - 1; k > 0; k--) {
                String resultado = "*".repeat(k);
                System.out.println(resultado);

            }
           }
}

 

        
            



            

