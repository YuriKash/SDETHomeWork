package class13;

public class E2StringDemoReplaceAll {
    public static void main(String[] args) {

        String str="nffnnfDJKFDJFK23923!73&(&)*";

        System.out.println(str.replaceAll("[a-z]","*")); // find all lower cases letters and replace it with *
        System.out.println(str.replaceAll("[A-Z]","#")); // find all Upper cases letters and replace it with #
        System.out.println(str.replaceAll("[0-9]","%")); //
        System.out.println(str.replaceAll("[0-9a-z]","%")); //
        System.out.println(str.replaceAll("[A-Za-z]","%")); //
        System.out.println(str.replaceAll("[a-k]","*")); //
        System.out.println(str.replaceAll("[#-z]","*")); //

        char c='A';
        c++;
        for (int i = 0; i < 10; i++) {
            System.out.println(c++);

        }
    }
}
