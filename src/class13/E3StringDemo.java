package class13;

public class E3StringDemo {
    public static void main(String[] args) {

        String str="nffnnfDJKF DJFK23923!73&(&)*";

        System.out.println(str.replaceAll("[a-z]","")); //delete
        System.out.println(str.replaceAll("[^a-z]","")); // ^ exclude - not operator
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[aDS8]"," "));
        System.out.println(str.replaceAll("[a-z]","\\$")); // special charactar escape
        System.out.println(str.replaceAll(" ","\\$")); // special charactar escape
    }
}
