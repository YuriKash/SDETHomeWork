package class8NestedLoops;

public class E5WhileAndBreak {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=85;
        while(summer){
            if(temp<100){
                System.out.println("Its good");
            }else{
                System.out.println("too hot");
                break;
            }
            temp=temp+5;

        }

    }
}
