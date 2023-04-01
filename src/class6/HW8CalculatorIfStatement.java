package class6;

import java.util.Scanner;

public class HW8CalculatorIfStatement {
    public static void main(String[] args) {
        /*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
 */

        Scanner key=new Scanner(System.in);
        System.out.println("Enter a number");
        int number1=key.nextInt();
        System.out.println("Enter another number");
        int number2= key.nextInt();
        System.out.println("Enter an operator such as + - * or /");
        char operator=key.next().charAt(0);

        if(operator=='+'){
            System.out.println(number1+number2);
        }else if(operator=='-'){
            System.out.println(number1-number2);
        }else if(operator=='*'){
            System.out.println(number1*number2);
        }else if(operator=='/'){
            System.out.println(number1/number2);
        }
    }
}
