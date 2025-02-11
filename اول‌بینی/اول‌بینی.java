import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean first = true;

        for (int i = a + 1; i < b; i++) {
            if (isPrime(i)) {
                if (!first) {
                    System.out.print(",");
                }
                System.out.print(i);
                first = false;
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n %i == 0) return false;
        }
        return true;
    }
}