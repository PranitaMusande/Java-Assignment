package com.stackroute.pe1;

public class Pattern {

    public String checkNum(int num)
    {
        if(num<0) {
            return "Invalid Number";
        }
        return "valid Number";
    }

    public String CheckValid(String str)
    {
        if(false)
        {
            throw new IllegalArgumentException();
        }
        return "Invalid Input";
    }

}
