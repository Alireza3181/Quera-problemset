import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();


        String[] b = {"sir", "senjed", "samano", "sib", "serke", "sabze", "sobol"};


        if (a >= 1 && a <= 7) {
            
            for (int i = 0; i < a; i++) {
                System.out.println(b[i]);
            }
        } else {
            System.out.println("Input must be between 1 and 7.");
        }

        scanner.close();
    }
}
