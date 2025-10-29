package printeomatriz;


public class printeomatriz {

    public static void main(String[] args) {
        
        int[][] matrix = 
        {
            
	{1, 2, 3, 4, 5,},
	{6, 7},
	{8, 9, 10}
                
                        };
        
        for (int[] fila : matrix) {
            for (int numero : fila) {
                System.out.print(numero + " ");
            }
            
            
            System.out.println("");
        }
        
    }

}
