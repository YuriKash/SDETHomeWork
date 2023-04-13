package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int start= scanner.nextInt();

        while (start!=-1){
            System.out.println("Enter another number");
            start= scanner.nextInt();
        }

    }
}
