package pruebas;

/**
 * Hello World aplicacion
 * @author yoivi
 * @version 1.0
 */
public class Pruebas {
    /**
     * The entry point to the program
     * @param args input arguments (command line arguments)
     */
    // This program will not compile 
  public static void main(String args[]) { 
      
    class Box { 
  double tuMama;
  double width; 
  double height; 
  double depth; 
  Box(double w, double h, double d) { 
    width = w; 
    height = h; 
    depth = d; 
  } 
  
  //USO DEL OVERRIDE EN STRINGS
  
  @Override
  public String toString() { 
    return "Dimensions are " + width + " by " + 
 
 
            depth + " by " + height + "."; 
  } 
} 

    Box b = new Box(10, 12, 14); 
    
    String s = "Box b: " + b; // concatenate Box object 
    System.out.println(b); // convert Box to string 
    System.out.println(s); 
  } 
}
    