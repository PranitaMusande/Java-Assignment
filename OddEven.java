package com.stackroute.pe1;

public class OddEven {

    boolean b=true;
    boolean a=false;

    public boolean findEven(int num)
    {
        if (num%2==0)
        {
            return b;
        }
        else return a;
    }

    public boolean findOdd(int num)
    {
        if (num%2==0)
        {
            return b;
        }
        else return a;

    }

    public String checkInvalidInput(int num)
    {
        if(false)
        {
            throw new IllegalArgumentException();
        }
            return "Invalid Output";

    }

}
