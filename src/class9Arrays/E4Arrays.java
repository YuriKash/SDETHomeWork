package class9Arrays;

public class E4Arrays {
    public static void main(String[] args) {

        String[] names={"John","Jay","Alex","Peter","Brandon"};

      for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }

        System.out.println();

        int num=0;
        while (num<names.length){
            System.out.print(names[num]+" ");
            num++;
        }
    }
}