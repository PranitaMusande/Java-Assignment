package PE1;

import java.util.Scanner;

public class Program10
{
    public void repeatChar()
    {
        String str="" ,substr="";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        str= in.nextLine();

        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();

        int len=str.length();

        int repeate=len-num;


        substr = str.substring(repeate);
        System.out.print(str);

        for( int i = 0; i < num ; i++)
        {
            System.out.print(substr);
        }
    }



    public static void main(String[] args)
    {
        Program10 a=new Program10();
        a.repeatChar();
    }



}
