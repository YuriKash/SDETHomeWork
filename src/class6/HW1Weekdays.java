package class6;

public class HW1Weekdays {
    public static void main(String[] args) {


/*Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output
“It is a weekend”,any other day → output “Invalid day”
 */

        int day=6;

        if(day>=1 && day<=5){
            System.out.println("its a weekday");
        }else if(day>=6 && day<=7){
            System.out.println("Its a weekend");
        }else{
            System.out.println("invalid day");
        }
    }
}
