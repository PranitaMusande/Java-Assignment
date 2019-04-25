package PE1;

import java.sql.Array;
import java.util.Scanner;

public class Program7
{
    public void sortArray()
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
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted number in non-increasing order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);

        for(int i=0; i<n; i++ )
        {
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            }
        }

        if(sum>15)
        {
            System.out.println("\nSum of even numbers :" +sum + "\nTrue");
        }
        else{
            System.out.println("\nSum of even numbers :" +sum + "\nFalse");
        }

    }

    public static void main(String[] args)
    {
        Program7 a=new Program7();
        a.sortArray();
    }
}
