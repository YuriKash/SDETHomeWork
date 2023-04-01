package class6;

import java.util.Scanner;

public class HW6CountryLanguage {
    public static void main(String[] args) {
        /*Ask user to enter their country and capture it. Once values are captured print which language user speaks.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your country?");
        String country=scanner.next();

        if(country.equals("USA")||country.equals("United States")||country.equals("Canada")||country.equals("Australia")) {

            System.out.println("You speak English");
        }else if(country.equals("France")){
            System.out.println("you speak French");
        }else if(country.equals("Germany")){
            System.out.println("You speak German");
        }else {
            System.out.println("I don't know");
        }


    }
}
