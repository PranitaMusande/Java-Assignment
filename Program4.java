package PE1;

import java.util.Scanner;

public class Program4
{
    public void pattern()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int no=sc.nextInt();

        for(int i=1; i<=no; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
        }
    }

    public static void main(String args[]) {

        Program4 a=new Program4();
        a.pattern();
    }
}
