
package assignment2;

import java.util.Scanner;

public class Task7 {
    
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int number1, number2;
        
        //Input First Number
        System.out.println("Please Enter First Number: ");
        number1 = sc.nextInt();
        
        //Input Secound Number
        System.out.println("Please Enter Secound Number: ");
        number2=sc.nextInt();
        
        
        // Compare Two Number
        if(number1>number2)
        {
            System.out.println("First is gretter");
        }
        else if(number1==number2)
        {
            System.out.println("Both Are Equal");
        }
        else
             System.out.println("Secound is Greater");
        
          
        
    }
    
}
