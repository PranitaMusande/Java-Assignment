package PE1;

import java.util.Scanner;

public class Program3
{
    public void conVowels()
    {
        String str="" ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        str= in.nextLine();
        int length=str.length();

        for( int i=0; i<=length-1; i++ )
        {
            System.out.print(str.charAt(i));


            if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')

                System.out.println("-Vowel " );

            else

                System.out.println("-Consonant ");

        }

    }

    public static void main(String[] args)
    {
        Program3 a=new Program3();
        a.conVowels();
    }
}
