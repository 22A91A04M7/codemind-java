import java.util.*;
public class sample
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
            System.out.format("%c ",i+64);
            
        }
        System.out.println();
    }
}
}