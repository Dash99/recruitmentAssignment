/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eoh.eohrecruitmentapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author K. Molotsi
 */
public class TestIntCheckMainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IntegerCheck intChk = new IntegerCheck();
        int testInt;
        
        System.out.println("Enter Integer to test if its a EVEN : ");
        
        try{
        testInt = input.nextInt();
        System.out.println(intChk.IsEven(testInt) + "\n");
        }catch(InputMismatchException e){
            throw new InputMismatchException("Invalid value");
        }
    
        
        try{
        System.out.println("Enter Integer to test if its a PRIME : ");
        testInt = input.nextInt();
        System.out.println(intChk.IsPrime(testInt)+"\n");
        }catch(InputMismatchException e){
            throw new InputMismatchException("Invalid value");
        }
        
         try{
        System.out.println("Enter Integer to test if its a PALINDROME : ");
        testInt = input.nextInt();
        System.out.println(intChk.IsPalindrome(testInt)+"\n");
        }catch(InputMismatchException e){
            throw new InputMismatchException("Invalid value");
        }
    }

}
