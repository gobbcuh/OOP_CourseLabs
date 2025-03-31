package assessment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assessment2 {
    public static void main(String[] args) {
        // Assessment 2: Calculator Program with Error Handling
        Scanner s = new Scanner(System.in);
        
        System.out.println("\n\t\tJASMIN'S SIMPLE CALCULATOR");
        System.out.println("\t------------------------------------------");
        System.out.println("\t  Enter [number 1] [+ - * /] [number 2]");
        
        do {
            try {
                System.out.print("\n\tEnter here: ");
                double num1 = s.nextDouble();
                char operatorChoice = s.next().charAt(0);
                double num2 = s.nextDouble();
                
                double result = operation(num1, operatorChoice, num2);
                System.out.println("\t" + num1 + " " + operatorChoice + " " + num2 + " = " + result);
                break;
            } catch (ArithmeticException error) {
                s.nextLine();
                System.out.println("\tError. Your number cannot be divided by 0.");
            } catch (InputMismatchException error) {
                s.nextLine();
                if (error.getMessage() != null && error.getMessage().contains("The only available operations are +, -, *, /.")) {
                    System.out.println("\tError. The only available operations are +, -, *, /.");
                } else {
                    System.out.println("\tError. Please enter a valid input.");
                }
            } catch (Exception error) {
                s.nextLine();
                System.out.println("\tError. An unexpected error occurred. Please try again.");
            }
        } while (true);
        
        System.out.println("\t------------------------------------------");
        System.out.println("\t THANK YOU FOR USING JASMIN'S CALCULATOR!");
    }
    
    public static double operation(double num1, char operatorChoice, double num2) {
        switch(operatorChoice) {
            case '+': 
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("\tError. Your number cannot be divided by 0.");
                }
                return num1 / num2;
            default:
                throw new InputMismatchException("\tError. The only available operations are +, -, *, /.");
        }
    }
}