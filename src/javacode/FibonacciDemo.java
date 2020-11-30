
package javacode;

import java.util.Scanner;


public class FibonacciDemo {

    
    public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            int m,fibo;
            System.out.print("How Many Number: ");
            
            m = input.nextInt();
            
            int first = 0;
            int second = 1;
            
            System.out.print(first+" "+second);
            
            for(int i = 3; i <= m; i++){
                
                fibo = first + second;
                first = second;
                second = fibo;
                
                System.out.print(" "+fibo);
                
            }
            System.out.println();
            
            
  
            
            
           
                
                
          
            
            
            
        
        
    }
    
}
