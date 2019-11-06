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
public class Task6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int number1, number2;
        
        System.out.println("Please Enter First Number: ");
        number1=sc.nextInt();
        System.out.println("Please Enter Secound Number: ");
        number2=sc.nextInt();
        
        if(number1>number2)
        {
            System.out.println("First is Greater");
        }
        else
            System.out.println(" First is not Greater");
        
    }
    
}
