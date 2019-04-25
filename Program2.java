package PE1;

import java.util.Scanner;

public class Program2
{
    public void evenOdd()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int no = sc.nextInt();

        if(no>=20 && no<=30)
        {
            if(no%2==0)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Tom");
            }
        }
    }

    public static void main(String[] args)
    {
        Program2 a=new Program2();
        a.evenOdd();

    }
}
