package class6;

import java.util.Scanner;

public class HW3TimeIn24Hours {
    public static void main(String[] args) {
        /*Write a program that will ask user to input inputs the current time (use 24-hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("What time is it?");
        int number= scanner.nextInt();

        if(number>=1 && number<=11){
            System.out.println("Morning");
        }else if(number>=12 && number<=15){
            System.out.println("Afternoon");
        }else if(number>=16 && number<=20){
            System.out.println("Evening");
        }else if(number>=21 && number<=24){
            System.out.println("Night");
        }else{
            System.out.println("wrong entry");
        }
    }
}
