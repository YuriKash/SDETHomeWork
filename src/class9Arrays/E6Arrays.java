package class9Arrays;

public class E6Arrays {
    public static void main(String[] args) {
        int[] a = {10, 50, 60, 45, 100};
        for (int i = 1; i < a.length; i++) {
            if (i % 2!=0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}