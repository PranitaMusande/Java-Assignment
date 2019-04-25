package PE1;

import java.util.Scanner;

public class Program8
{
    public void guessNumber()
    {
        int guess;
        int number=50;

        while (true)
        {
            System.out.println("Guess my number (Range 1-50): ");

            Scanner input=new Scanner(System.in);

            guess = input.nextInt();

            if (guess == number)
            {
                System.out.println("You have guessed it right " + number + " Right");
                break;

            } else if (guess < number)
            {
                System.out.println(" Guessed Number is Lesser");
            }
        }
    }

    public static void main(String[] args)
    {
        Program8 a=new Program8();
        a.guessNumber();
    }

}
