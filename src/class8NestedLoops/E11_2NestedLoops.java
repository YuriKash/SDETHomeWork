package class8NestedLoops;

public class E11_2NestedLoops {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 4) {
            for (int j = 2; j <= 10; j = j + 2) {
                System.out.print(j+" ");
            }
            System.out.println();
            counter++;
        }
    }
}
