package class12;

public class E8StringDemo {
    public static void main(String[] args) {

        String sentence="  JAVA is very very easy";
        sentence=sentence.trim().toLowerCase();

        System.out.println(sentence.startsWith("java"));
        System.out.println(sentence.endsWith("java"));

    }
}
