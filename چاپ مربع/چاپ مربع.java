import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        do
        {
            n = sc.nextInt();
        } while(n<3 || n>10);
        for(int i=0; i<n; i++)
        {
            System.out.print('*');
        }
        System.out.print('\n');
        for(int i=0; i<(n-2); i++) {
            System.out.print('*');
            for (int j = 0; j < (n - 2); j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            System.out.print('\n');
        }
        for(int i=0; i<n; i++)
        {
            System.out.print('*');
        }
    }
}