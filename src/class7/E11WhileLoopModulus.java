package class7;

public class E11WhileLoopModulus {
    public static void main(String[] args) {


        int counter = 100;
        while (counter > 0) {
            System.out.print(counter + " ");
            counter--;
        }

        counter = 20;
        System.out.println();
        while (counter <= 100) {
            System.out.print(counter + " ");
            counter += 2;
        }
        counter = 100;
        System.out.println();
        while (counter >= 1) {
            if(counter%2==1) { //odd numbers divided by 2 gives 1 as a remainder
                System.out.print(counter + " ");
            }
            counter --;
        }

    }
}

