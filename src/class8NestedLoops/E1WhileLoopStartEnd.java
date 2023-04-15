package class8NestedLoops;

import java.util.Scanner;

public class E1WhileLoopStartEnd {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the starting point, endong point");
        int start= scanner.nextInt();
        int end= scanner.nextInt();
        int number= start;
        while(number<=end){
            System.out.print(number+" ");
            number++;
        }
    }
}
