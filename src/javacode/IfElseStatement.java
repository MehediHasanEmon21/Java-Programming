
package javacode;

import java.util.Scanner;


public class IfElseStatement {

    
    public static void main(String[] args) {
        
        int num;
        
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        
        num = input.nextInt();
        
        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
    
}
