
package javacode;

import java.util.Scanner;


public class IfElseStatement {

    
    public static void main(String[] args) {
        
        char ch;
        
        System.out.print("Enter a Character: ");
        Scanner input = new Scanner(System.in);
        
        ch = input.next().charAt(0);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
        
    }
    
}
