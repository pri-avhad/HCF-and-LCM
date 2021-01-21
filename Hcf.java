import java.util.*;
class Hcf
{
    static void main()
    {
        int a = 0 , b = 0 , h = 1 , l = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no.s");
        a = sc.nextInt();
        b = sc.nextInt();
        int p = a*b;
        for (int i = 1 ; i <= p ; i++)
        {
            if (a%i==0&&b%i==0)
            h=i;
        }
        l= a*b/h;
        System.out.println(l+ " " + h);
    }
}
        