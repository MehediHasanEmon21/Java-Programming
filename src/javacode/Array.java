
package javacode;

import java.util.Scanner;


public class Array {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        System.out.print("Please Enter 5 number: ");
        int i;
        double sum = 0;
        
        for (i = 0; i < number.length; i++) {
            
            number[i] = input.nextDouble();
            
        }
        
        for(i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        
        System.out.println("Sum is :"+sum);
            
            
            
            
            
            
            
            
            
            
  
            
            
           
                
                
          
            
            
            
        
        
    }
    
}
