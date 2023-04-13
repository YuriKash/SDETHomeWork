package class7;

public class HW4Class7 {
    public static void main(String[] args) {

        /*
       Print odd numbers between 20 and 50 (2 ways)
         */

        for(int j=21;j<=50;j+=2){

            System.out.print(j+" ");
        }
        System.out.println();
        for(int j=21;j<=50;j++){
            if(j%2!=0){

            System.out.print(j+" ");}
        }
    }
}
