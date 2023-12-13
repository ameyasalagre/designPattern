/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ameya.design.patterns;

import com.ameya.design.patterns.builder.Builder;

/**
 *
 * @author ameya.salagre
 */
public class DesignPatterns {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //builder Pattern
        Builder b = new Builder.PersonBuilder().setPersonBuilderAge(31).build();
        System.out.println(b);
        
        
        
        
    }
}
