import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sh, ek, d2, se, ch, pa, jo;
        sh = ek = d2 = se = ch = pa = jo = 0;
        int res = 7;

        for(int i =0; i<3 ; i++)
        {
            int j = sc.nextInt();
            char[] a = new char[j];
            for(int k =0 ; k<j; k++ )
            {
                a[k] = sc.next().charAt(0);

                switch(a[k]) {
                    case 's':
                        sh=1;
                        break;
                    case '1':
                        ek=1;
                        break;
                    case '2':
                        d2=1;
                        break;
                    case '3':
                        se=1;
                        break;
                    case '4':
                        ch=1;
                        break;
                    case '5':
                        pa=1;
                        break;
                    case 'j':
                        jo=1;
                        break;
                }
            }
        }
        res = res - (sh+ek+d2+se+ch+pa+jo);
        System.out.println(res);
    }
}