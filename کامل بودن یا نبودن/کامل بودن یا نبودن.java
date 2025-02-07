import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, m=0;

        do
        {
            n = sc.nextInt();
        } while(n<2 || n>200000);

        for(int i=n-1; i>=1; i--)
        {
            if(n%i==0)
            {
                m = m+i;
            }
        }

        if(n==m)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
}