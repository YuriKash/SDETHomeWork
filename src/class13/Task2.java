package class13;

public class Task2 {
    public static void main(String[] args) {
        String str="1234asdf!@#$";

        String str1=str.replaceAll("[^a-zA-Z0-9]","");
        int sum=0;
        for (int i = 0; i < str1.length(); i++) {
            sum++;
        }
        System.out.println(sum);

        System.out.println("---");

        System.out.println(str1.length());

        System.out.println("Shortest version");

        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length()); // shortest way
    }
}
