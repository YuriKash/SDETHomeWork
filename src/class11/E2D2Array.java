package class11;

public class E2D2Array {
    public static void main(String[] args) {
        String[][] names={
                {"Sarah","Artem","Lean","Semir"},
                {"Farwa","Halim","Alina","Semir"},
        };

        for (String[] name : names) {
            for (String s : name) {
                System.out.print(s+" ");

            }

        }

        System.out.println("--------------------");

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]+" ");

            }

        }
    }
}
