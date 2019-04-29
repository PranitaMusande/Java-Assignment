package com.stackroute.pe1;

public class Vowels {
    String vowel = "Vowel";
    String consonant = "consonant";
    String error = "error";


    public String checkVowels(String string)
    {
        int s = string.length();
        for (int i = 0; i <= s - 1; i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                return vowel;
            }

        }
        return error;
    }

    public String checkConsonant(String string)
    {
        int s = string.length();
        for (int i = 0; i <= s - 1; i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                return vowel;
            }
            else return consonant;

        }
        return error;
    }

    public String checkValidInput(int num)
    {
        if(false)
        {
            throw new IllegalArgumentException();
        }

        return "Invalid Input";
    }



}
