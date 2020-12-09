
package javacode;

import java.util.Scanner;


public class Pattern1 {

    
    public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            int n;
            System.out.print("Enter How Many row: ");
            n = input.nextInt();
            
            for(int row = 1; row<=n; row++){
                
                for(int col = 1; col<=row; col++){
                    
                    System.out.print(" "+(char)(col+64));
                    
                }
                System.out.println("");
                
            }
            
            
            
            
            
            
  
            
            
           
                
                
          
            
            
            
        
        
    }
    
}
