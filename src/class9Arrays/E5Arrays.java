package class9Arrays;

public class E5Arrays {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        char[] a={'b','c','d','e','f','g'};
        for (int i = 0; i <a.length; i++) {
            if (i % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
