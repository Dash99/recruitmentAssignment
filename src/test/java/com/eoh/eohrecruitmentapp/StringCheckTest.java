/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eoh.eohrecruitmentapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K.Molotsi
 */
public class StringCheckTest {
    
    //Test Case 1 :
    @Test
    public void testReverseString() {
        String inputText = "HelloWorld";
        String expected = "dlroWolleH";

        String result = StringCheck.ReverseString(inputText);

        assertEquals(expected, result);
    }

    //Test Case 2 :
    @Test
    public void testReverseString2() {
        String inputText = "8BitPlatoon";
        String expected = "nootalPtiB8";
        
        String result = StringCheck.ReverseString(inputText);
        
        assertEquals(expected, result);
        
    }
    
}
