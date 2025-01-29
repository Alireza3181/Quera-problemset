
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n;
        char t;

        do {
            n = sc.next();
        } while (n.length() < 1 || n.length() > 20);

        for (int i = 0; i < n.length(); i++) {
            t = n.charAt(i);
            StringBuilder modifiedString = new StringBuilder(n);

            for (int j = i; j >= 0; j--) {
                modifiedString.setCharAt(j, t);
            }

            System.out.println(modifiedString);
        }
    }
}
