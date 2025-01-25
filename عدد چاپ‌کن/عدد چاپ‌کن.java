import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        for(int i = 0 ; i < s.length(); i++)
        {
            System.out.print(s.charAt(i)+": ");
            for (int j = 0; j< s.charAt(i)-48 ; j++)
            {
                System.out.print(s.charAt(i));
            }
            System.out.print('\n');
        }
    }
}