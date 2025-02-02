import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        if (Character.getNumericValue(a.charAt(0)) == 1 &&
                Character.getNumericValue(a.charAt(2)) == 1 &&
                Character.getNumericValue(a.charAt(4)) == 2 &&
                Character.getNumericValue(a.charAt(6)) == 2 &&
                Character.getNumericValue(a.charAt(8)) == 2 &&
                Character.getNumericValue(a.charAt(10)) == 8) {
            System.out.println(a);
        } else {
            int b = 1 - Character.getNumericValue(a.charAt(0));
            int c = 1 - Character.getNumericValue(a.charAt(2));
            int d = 2 - Character.getNumericValue(a.charAt(4));
            int e = 2 - Character.getNumericValue(a.charAt(6));
            int f = 2 - Character.getNumericValue(a.charAt(8));
            int g = 8 - Character.getNumericValue(a.charAt(10));
            System.out.println(b + " " + c + " " + d + " " + e + " " + f + " " + g);
        }

        scanner.close();
    }
}
