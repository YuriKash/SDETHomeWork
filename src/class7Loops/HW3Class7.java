package class7Loops;

public class HW3Class7 {
    public static void main(String[] args) {

        /*
       Print even numbers from 20 to 1 (2 ways)
         */

        for(int j=20;j>=1;j-=2){

            System.out.print(j+" ");
        }
        System.out.println();
        for(int j=20;j>=1;j--){
            if(j%2==0){

            System.out.print(j+" ");}
        }
    }
}
