package PE1;

import java.util.Scanner;

public class Program5
{
    public void sum()
    {
        int n, temp;
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();

            sum=sum+a[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        Program5 a=new Program5();
        a.sum();
    }
}
