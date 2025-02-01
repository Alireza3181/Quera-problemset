import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        int d = 0;
        int e = 0;

        if (b.length() == c.length() && b.length() == Integer.parseInt(a)) {
            for (int i = 1; i <= Integer.parseInt(a); i++) {
                if (b.charAt(e) == c.charAt(e)) {
                    d += 0;
                } else {
                    d += 1;
                }
                e += 1;
            }

            System.out.println(d);
        } else {
            System.out.println("The lengths of b and c must be equal to the integer value of a.");
        }

        scanner.close();
    }
}
