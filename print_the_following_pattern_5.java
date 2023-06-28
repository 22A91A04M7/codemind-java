import java.util.*;
public class Bhavani
{
public static void main(String args[])
{
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=a;j++)
        {
            if(i==j)
            System.out.print("0");
            else
            System.out.print("x");
            
        }
        System.out.println();
    }
}
}