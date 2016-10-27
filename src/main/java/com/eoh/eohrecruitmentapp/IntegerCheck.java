/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eoh.eohrecruitmentapp;

/**
 *
 * @author K. Molotsi
 */

public class IntegerCheck {
    //Checks if number is not even
    public static boolean IsEven(int num) {
        Boolean isEven = false;
        if(num%2 == 0){
            isEven = true;
        }
        return isEven;
    }

    //Checks if number is a prime
    public static boolean IsPrime(int num) {
        Boolean isPrime = true;
        int rem;
        for (int x = 2; x <= (num/2); x++) {
            rem = num%x;
            if (rem == 0) {
                isPrime= false;
            } 
        }
        return isPrime;
    }

     //Checks if number is a palindrome
    public static boolean IsPalindrome(int num) {
        boolean isPalidrome = false;
        String intStr = Integer.toString(num);
        int revNum = Integer.parseInt(StringCheck.ReverseString(intStr));
        if(num == revNum){
            isPalidrome = true;
        }
        return isPalidrome;
    }

}
