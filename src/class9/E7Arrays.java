package class9;

public class E7Arrays {
    public static void main(String[] args) {

        boolean[] a = {true,false,true,false,false,true};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==false) {  // if(!a[i])
              sum++;

            }
        }System.out.print(sum);
    }
}