package com.stackroute.pe1;

public class TomJerry {

    public String testEven(int num)
    {
        if(num > 20 && num < 30) {
            if (num % 2 == 0) {
                return "tom";
            } else
                return "jerry";
        }
        return "error";
    }

    public String testOdd(int num)
    {
        if (num > 20 && num <30)
        {
            if (num % 2 ==0)
            {
                return "tom";
            }
            else return "jerry";
        }
        return "error";
    }

}
