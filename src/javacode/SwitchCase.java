
package javacode;

import java.util.Scanner;


public class SwitchCase {

    
    public static void main(String[] args) {
        
        int digit;
        
        System.out.print("Enter a Digit: ");
        Scanner input = new Scanner(System.in);
        digit = input.nextInt();
        
        switch(digit){
            case 1:
                System.out.println("Digit is One");
                break;
            case 2:
                System.out.println("Digit is Two");
                break;
            case 9: 
                System.out.println("Digit is Nine");
                break;
            default:
                System.out.println("Not a Digit");
        }
        
        
        
    }
    
}
