package class6;

import java.util.Scanner;

public class HW5Scores {
    public static void main(String[] args) {


/*Write a program that will read three inputs of scores (quiz, midterm, and final scores)
 and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your quiz score?");
        int quiz = scanner.nextInt();
        System.out.println("What is your midterm score?");
        int midterm = scanner.nextInt();
        System.out.println("What is your final score?");
        int finalScores = scanner.nextInt();


        if ((quiz + midterm + finalScores) / 3 >= 90) {
            System.out.println("A");
        } else if ((quiz + midterm + finalScores) / 3 >= 70 && (quiz + midterm + finalScores) / 3 < 90) {
            System.out.println("B");
        } else if ((quiz + midterm + finalScores) / 3 >= 50 && (quiz + midterm + finalScores) / 3 < 70) {
            System.out.println("C");
        } else if ((quiz + midterm + finalScores) / 3 < 50) {
            System.out.println("F");
        }
    }
}
