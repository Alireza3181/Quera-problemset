import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long n;
        do{
            n = sc.nextLong();
        }while(n<1);

        while(n>=10)
        {
            int sum = 0;
            while(n!=0)
            {
                sum += n % 10;
                n /= 10;
            }
            n=sum;
        }
        System.out.println(n);
    }
}