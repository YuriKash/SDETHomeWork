package class13;



public class Task3 {
    public static void main(String[] args) {
        //How would you find out how many sentences are in that String?"

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";

        System.out.println(str.replaceAll("[^?]","").length());

        System.out.println("------");

        String[] strArr=str.split("[?]");
        System.out.println(strArr.length);

        char[] str2=str.toCharArray(); // convert to char array
    }
}
