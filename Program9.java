package PE1;

import java.util.Scanner;

public class Program9
{
    public void reverseString()
    {
        String string="",revString="";

        Scanner in = new Scanner(System.in);


        System.out.print("Enter a string :");

        string= in.nextLine();


        int len= string.length();

        for ( int i = len- 1 ; i >= 0 ; i-- )
        {
            revString= revString+ string.charAt(i);
        }

        System.out.println("Reverse String is: "+revString);
    }

    public static void main(String[] args)
    {
        Program9 a=new Program9();
        a.reverseString();
    }
}
