package BoxClass;


public class BoxDemo {
   

    public static void main(String[] args) {
               
    Box mybox = new Box(); 
    Box mybox2 = mybox;
    
    mybox = null;
    
    double vol; 
    // assign values to mybox's instance variables 
    mybox2.width = 10; 
    mybox2.height = 20; 
    mybox2.depth = 15; 
    // compute volume of box 
    vol = mybox2.width * mybox2.height * mybox2.depth; 
    System.out.println("Volume is " + vol); 
        
    }

}
