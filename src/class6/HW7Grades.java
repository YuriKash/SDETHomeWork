package class6;

import java.util.Scanner;

public class HW7Grades {
    public static void main(String[] args) {
        /*Allow user to enter grade (A, B, or C etc...) and then provide explanation:
A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
At the end your program should print which grade was entered by a user with explanation.
 */

        Scanner key=new Scanner(System.in);
        System.out.println("What is your grade?");
        char grade=key.next().charAt(0);

        if(grade=='A'){
            System.out.println("A-Excellent");
        }else if(grade=='B'){
            System.out.println("B-Good");
        }else if(grade=='C'){
            System.out.println("C-Avarage");
        }else if(grade=='D'){
            System.out.println("D-Bad");
        }else{
            System.out.println("Not Acceptable");
        }
    }
}
