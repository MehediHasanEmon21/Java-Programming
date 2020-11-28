
package javacode;

import java.util.Scanner;


public class TimeTableDemo {

    
    public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            int count = 0;
            
            
  
            
            
            for (int i = 2; i <= 100; i++) {
                
                
                for (int j = 2; j <= i-1; j++) {
                    
                    if(i % j == 0){
                        
                        count++;
                        break;
                        
                    }
                    
                }
                if(count == 0)
                System.out.println(i);
                count = 0;
                
                
            }
            
            
            
        
        
    }
    
}
