import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int nn [] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int a, b, comma=0;

        do {

            a=sc.nextInt();
            b=sc.nextInt();

        }while((a<1 || a>200) || (b<1 || b>200 || b<a));

        for(int i=0 ; i < nn.length; i++)
        {
            if(nn[i]>a && nn[i]<b)
            {
                if(comma!=0)
                    System.out.print(',');
                
                System.out.print(nn[i]);
                comma++;
            }
        }

    }
}