package LogicalPrograme;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 1st number");
        double no1 = reader.nextDouble();
        System.out.println("Enter 2nd number");
        double no2 = reader.nextDouble();
        System.out.println("Enter an operator:(+,-,*,/):");
        char operator = reader.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+':
                result = no1 + no2;
                break;
            case '-':
                result = no1 - no2;
                break;
            case '*':
                result = no1 * no2;
                break;
            case '/':
                result = no1 / no2;
                break;
            default:
                System.out.println("Please pass a correct operator");
        }
        System.out.println(result);
    }
}
