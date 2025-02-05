import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String a = scanner.nextLine();

        // Output
        System.out.println("saal:" + a.charAt(0) + a.charAt(1));
        System.out.println("maah:" + a.charAt(2) + a.charAt(3));
    }
}
