/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bsp2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class HalloJavamitForEach {
    List<String> ls= new ArrayList<>();

    public HalloJavamitForEach() {
        
        ls.add("String 1");
        ls.add("String 2");
        ls.add("String 3");
        ls.add("String 4");


    }
    
    public void forEachLoop(){
        for (String l : ls) {
            System.out.println(l);
        }
    }
    
    public void lambdasPrinting(){
        ls.forEach((String s) -> System.out.println(s));
    }
    
    public void lambdasPrintingConsumer(){
        Consumer<String> consumer = (String s) -> System.out.println(s);
    }
    
    public void methodReference(){
     ls.forEach(System.out :: println);
    }
    
    public static void main (String [] args){
        HalloJavamitForEach hj= new HalloJavamitForEach();
        System.out.println("Loop:");
        hj.forEachLoop();
        System.out.println("Lambdas:");
        hj.lambdasPrinting();
        System.out.println("Method-Referenz");
        hj.methodReference();
    }
}
