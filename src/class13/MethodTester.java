package class13;

public class MethodTester {

    public static void main(String[] args) {
        E9Methods obj=new E9Methods(); // created object obj with the class E9Methods
        obj.printSomething(); // calling object

        obj.printWord("Yuri");
        obj.printWord(" is Cool");

        obj.printWordManyTimes("alex",5);
    }
}
