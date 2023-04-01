package class6;

import java.util.Scanner;

public class HW4Seasons {
    public static void main(String[] args) {
        /*Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("What month were you born?");
        String month= scanner.next();

        if(month.equals("June") || month.equals("July") || month.equals("August")){
            System.out.println("You were born in summer");
        }else if(month.equals("May") || month.equals("April") || month.equals("March")){
            System.out.println("You were born in spring");
        }else if(month.equals("September") || month.equals("October") || month.equals("November")){
            System.out.println("You were born in autumn");
        }else if(month.equals("December") || month.equals("January") || month.equals("February")){
            System.out.println("You were born in winter");
        }else{
            System.out.println("Wrong Entry");
        }

    }
}
