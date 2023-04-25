package class12;

public class E12StringDemo {
    public static void main(String[] args) {

        String sentence="yup we have another class";

        System.out.println(sentence.substring(4)); //used to get a part of string
        System.out.println(sentence.substring(4,11));
        System.out.println(sentence.substring(12,19));

        // how to print last 5 letters of any length of sentence

        int startIndex=sentence.length()-5;
        System.out.println(sentence.substring(startIndex));

        System.out.println(sentence.substring(sentence.length()-5));
    }
}
