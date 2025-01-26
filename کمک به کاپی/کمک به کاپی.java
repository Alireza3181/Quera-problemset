import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        String s;

        do {
            n = sc.nextInt();
        }while(n<0 || n>100);

        do {
            s =  sc.next();
        }while(s.length()>100);

        for(int i = 0; i < n; i++)
        {
            System.out.print("copy of ");
        }
        System.out.print(s);
    }
}