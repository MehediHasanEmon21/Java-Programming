
package javacode;

import java.util.Scanner;


public class UserInput {

    
    public static void main(String[] args) {
        
        int num;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = input.nextInt();
        System.out.println("Number is = "+num);
    }
    
}
