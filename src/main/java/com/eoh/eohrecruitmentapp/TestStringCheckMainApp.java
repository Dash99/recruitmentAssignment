/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eoh.eohrecruitmentapp;

import java.util.Scanner;

/**
 *
 * @author K. Molotsi
 */
public class TestStringCheckMainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StringCheck strChk = new StringCheck();
        
        System.out.println("Enter String / Text : ");
        
        String testStr = input.nextLine();
        System.out.println(strChk.ReverseString(testStr));
        
    }

}
