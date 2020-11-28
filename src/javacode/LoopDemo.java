
package javacode;

import java.util.Scanner;


public class LoopDemo {

    
    public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            int sum = 0;
            int m,n;
            
            System.out.print("Enter First number: ");
            m = input.nextInt();
            
            System.out.print("Enter Second number: ");
            n = input.nextInt();
            
            
            for (int i = m; i <= n; i++) {
                
                if(i % 2 == 0){
                    
                    System.out.print(i+", ");
                    sum = sum + i;
                }
                
            }
            System.out.println("Sum is: "+sum);
        
        
    }
    
}
