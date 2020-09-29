/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bsp3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */

 

public class NumberTester implements NumberTest{

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private File file;
    
    public NumberTester(String fileName) {
        file = new File(fileName);
    }
    
    public void setOddEvenTester(NumberTest oddTester){
            this.oddTester= oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
            this.primeTester= primeTester;
    }
    
    public void setPalindromeTester(NumberTest palindromeTester){
            this.palindromeTester= palindromeTester;
    }
    
    public void testFile(){
        
        /*setOddEvenTester(number -> number /2 ==0);
        setPrimeTester(number -> for(int i=2; i<number; i++){});
        setPalindromeTester(palindromeTester);*/
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    @Override
    public boolean testNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
