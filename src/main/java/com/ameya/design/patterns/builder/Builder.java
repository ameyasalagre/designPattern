/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ameya.design.patterns.builder;

/**
 *
 * @author ameya.salagre
 */
public class Builder {
    
    private int age;
    private String name;
    
    private Builder(PersonBuilder personBuilder){
       
    this.age = personBuilder.age;
    this.name = personBuilder.name;
    }

    
    
    public static class PersonBuilder{
        
        private int age;
        private String name;
        
        
        
        public PersonBuilder setPersonBuilderName(String name){
        
            this.name = name;
            return this;

        }
        
        public PersonBuilder setPersonBuilderAge(int age){
            this.age = age;
            return this;
            
        }
        
        public Builder build(){
            return new Builder(this);
        }
        
    }
    
    
}
