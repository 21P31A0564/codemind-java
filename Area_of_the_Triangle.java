import java.util.*;
import java.lang.Math;
class area
{
    public static void main(String args[])
    {
        int a,b,c;
        double s;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(double)(a+b+c)/2;
        double x=(double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",x);
    }
}