
package assignment2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
            
       int number1, number2, sum, product,difference;
       Scanner sc= new Scanner(System.in);
        
        System.out.print("Please Enter First Number : ");
        number1=sc.nextInt();
        System.out.print("Please Enter First Number : ");
        number2=sc.nextInt();
        
        sum = number1+number2;
        product = number1*number2;
        difference= number1-number2;
        
        System.out.print("Result of Sumamtion: "+sum+difference+product);
        
    }
    
}
