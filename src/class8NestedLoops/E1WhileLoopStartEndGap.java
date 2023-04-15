package class8NestedLoops;

import java.util.Scanner;

public class E1WhileLoopStartEndGap {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the starting point, endong point and the steps");
        int start= scanner.nextInt();
        int end= scanner.nextInt();
        int gap= scanner.nextInt();
        int number= start;
        while(number<=end){
            System.out.print(number+" ");
            number=number+gap;
        }
    }
}
