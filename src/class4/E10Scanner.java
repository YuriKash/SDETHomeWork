package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your genter");
        char gender=scanner.next().charAt(0);
        System.out.println("you enter "+gender);
    }
}