package class4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        /* Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is
        the city __ is __”
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the city do you live in?" );
        String city= scanner.next();

        System.out.println("Whats the temperature in F?" );
        double temp= scanner.nextDouble();

        System.out.println("You live in "+city+". The temperature is "+((temp-32)*5/9)+"C");


    }
}
