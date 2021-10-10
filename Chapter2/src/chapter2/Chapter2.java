
package chapter2;

import java.util.Scanner;

public class Chapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your houlry pay rate");
        
        double PayRate = Double.parseDouble(Keyboard.nextLine());
        
        System.out.println("Please enter the number of hours you work");

        double HoursWorked = Double.parseDouble(Keyboard.nextLine());
           
        double WeeklyPay = PayRate * HoursWorked; 
        
        System.out.println("Your weekly pay is: $" + WeeklyPay);

        
    }
    
}
