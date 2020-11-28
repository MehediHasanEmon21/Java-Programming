
package javacode;

import java.util.Scanner;


public class TimeTableDemo {

    
    public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            int m;
            System.out.print("Enter Any Positive Integer: ");
            m = input.nextInt();
            int count = 0;
            
            
  
            
            
            for (int i = 2; i < m; i++) {
                
                if(m % i == 0){
                    
                    count++;
                    break;
                    
                }
                
                
            }
            
            if(count == 0){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not a Prime Number");
            }
            
        
        
    }
    
}
