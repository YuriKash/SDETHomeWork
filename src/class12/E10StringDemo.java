package class12;

public class E10StringDemo {
    public static void main(String[] args) {

        // print letters one by one
        String name="LEANDROR";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));

        }
        System.out.println("---");
        // how many time R is in the name?
        int sum=0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='R'){  // char is always ''
                sum++;

            }

        }
        System.out.println(sum);
    }
}
