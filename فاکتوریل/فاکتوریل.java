import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        long fact=1;

        do
        {
            n = sc.nextInt();
        } while(n<1 || n>15);

        for(int i=1; i<=n; i++)
        {
            fact  = fact*i;
        }

        System.out.println(fact);
    }
}