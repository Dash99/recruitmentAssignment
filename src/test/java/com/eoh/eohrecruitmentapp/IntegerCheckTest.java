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
 * @author K. Molotsi
 */
public class IntegerCheckTest {
    
   //Test Case 1 (a) : IsEven
    @Test
    public void testIsEven1() {
        int inputNum = 0;
        boolean expected = true;
        
        boolean result = IntegerCheck.IsEven(inputNum);
        
        assertEquals(expected, result);
    }
    
    //Test Case 1 (b) : IsEven
    @Test
    public void testIsEven2() {
        int inputNum = 3;
        boolean expected = false;
        
        boolean result = IntegerCheck.IsEven(inputNum);
        
        assertEquals(expected, result);
    }
    
    //Test Case 1 (c) : IsEven
    @Test
    public void testIsEven3() {
        int inputNum = 6;
        boolean expected = true;
        
        boolean result = IntegerCheck.IsEven(inputNum);
        
        assertEquals(expected, result);
    }
    
    
    //
    
    
    //Test Case 2 (a) : IsPrime
    @Test
    public void testIsPrime1() {
        int inputNum = 1;
        boolean expected = false;
        
        boolean result = IntegerCheck.IsPrime(inputNum);
        
        assertEquals(expected, result);
    }
    
     //Test Case 2 (b) : IsPrime
    @Test
    public void testIsPrime2() {
        int inputNum = 3;
        boolean expected = true;
        
        boolean result = IntegerCheck.IsPrime(inputNum);
        
        assertEquals(expected, result);
    }
    
     //Test Case 2 (c) : IsPrime
    @Test
    public void testIsPrime3() {
        int inputNum = 110;
        boolean expected = false;
        
        boolean result = IntegerCheck.IsPrime(inputNum);
        
        assertEquals(expected, result);
    }
    
     //Test Case 2 (d) : IsPrime
    @Test
    public void testIsPrime4() {
        int inputNum = 113;
        boolean expected = true;
        
        boolean result = IntegerCheck.IsPrime(inputNum);
        
        assertEquals(expected, result);
    }
    
    //    
    
    //Test Case 3 (a) : IsPalindrome
    @Test
    public void testIsPalindrome1(){
    int inputNum = 121;
    boolean expected = true;
    
    boolean result = IntegerCheck.IsPalindrome(inputNum);
    
    assertEquals(expected, result);
    }
    
    //Test Case 3 (b) : IsPalindrome
    @Test
    public void testIsPalindrome2(){
    int inputNum = 121;
    boolean expected = true;
    
    boolean result = IntegerCheck.IsPalindrome(inputNum);
    
    assertEquals(expected, result);
    }
    
    //Test Case 3 (c) : IsPalindrome
    @Test
    public void testIsPalindrome3(){
    int inputNum = 121;
    boolean expected = true;
    
    boolean result = IntegerCheck.IsPalindrome(inputNum);
    
    assertEquals(expected, result);
    }
    
    
}
