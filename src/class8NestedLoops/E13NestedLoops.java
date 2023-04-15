package class8NestedLoops;

public class E13NestedLoops {
    public static void main(String[] args) {


        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= i + 4; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i <3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+i+" ");
            }
            System.out.println();
        }


    }
}
