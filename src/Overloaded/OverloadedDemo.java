/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Overloaded;

/**
 *
 * @author yoivi
 */
public class OverloadedDemo {

    void test() { 
    System.out.println("No parameters"); 
  } 
  // Overload test for one integer parameter. 
  void test(int a) { 
    System.out.println("a: " + a); 
  } 
  // Overload test for two integer parameters. 
  void test(int a, int b) { 
    System.out.println("a and b: " + a + " " + b); 
  } 
  // Overload test for a double parameter 
  double test(double a) { 
    System.out.println("double a: " + a); 
    return a*a; 
  } 
    
}

