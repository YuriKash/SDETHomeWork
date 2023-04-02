package class5;

public class E4NestedIf {
    public static void main(String[] args) {

        int money = 5000;
        String day = "Monady";

        if (money > 10000){
                if (day.equals("Sunday")) {
                    System.out.println("Lets go shopping");
                } else {
                    System.out.println("Lets wait");
                }
            }else {
            System.out.println("more");
        }
    }
}
