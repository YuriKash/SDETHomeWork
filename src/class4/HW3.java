package class4;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        /* You are DMV representative and you need to ask customer their age.
        If they are 18 and older you will issue a driver license to them, otherwise you
        will offer them to get a learners permit.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you?" );
        int age= scanner.nextInt();

        if(age>=18){
            System.out.println("We are going to issue a DL for you");
        }else if(age<18){
            System.out.println("You are gonna need to get a LP");}


    }
}
