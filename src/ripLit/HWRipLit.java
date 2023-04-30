package ripLit;

import java.util.Scanner;

public class HWRipLit {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        char[] charArray = word.replaceAll("[^aeiouAEIOU]", "").toCharArray();
        System.out.println(charArray);
    }
}



