/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author UYS
 */
public class Task9 {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int number1, number2, Result;
        
        //Input First Number
        System.out.println("Please Enter First Number: ");
        number1 = sc.nextInt();
        
        //Input Secound Number
        System.out.println("Please Enter Secound Number: ");
        number2=sc.nextInt();
        
        
        // Compare Two Number
        if(number1>number2)
        {
            Result=number1-number2;
            System.out.println("The Result is : "+Result);
            
        }
        else if(number1<number2)
        {
             Result=number2-number1;
             System.out.println("The Result is : "+Result);
        
        }
        
    }
    
}
