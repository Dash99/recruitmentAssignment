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
public class StringCheck {
    
    //function reverses input string characters
    public static String ReverseString(String textStr) {
        String inputText = textStr;
        String outputText = "";
        int txtLength = inputText.length();

        char[] alpha = new char[txtLength];

        for (int x = 0; x < txtLength; x++) {
            alpha[x] = inputText.charAt(x);
        }

        for (int y = (txtLength - 1); y >= 0; y--) {
            outputText = outputText + Character.toString(alpha[y]);
        }
        return outputText;
    }
    
}
