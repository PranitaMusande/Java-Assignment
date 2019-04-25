package PE1;

import java.util.Scanner;

public class Program1
{
    public void palindrome()
    {
        int reverse=0, remainder, originalInteger;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num =num/ 10;

            if(remainder%2==0)
            {
                sum=sum+remainder;
            }
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if(originalInteger == reverse)
        {
            if (sum>25) {
                System.out.println(originalInteger + " is palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println(originalInteger + " is palindrome and the sum of even numbers is less than 25.");
            }
        }
        else
        {
            System.out.println(originalInteger + " is not palindrome");
        }
    }

    public static void main(String[] args)
    {
        Program1 a=new Program1();
        a.palindrome();
    }
}
