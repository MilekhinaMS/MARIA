/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1m;

/**
 *
 * @author Home
 */
public class Auditor {
    public void closeStore(Store firstStore){
        String name1=firstStore.getName();
        String a="IKEA";
        if(name1.equals(a)){
            name1=null;
        }
        firstStore.setName(name1);
    }
    public void rebrand(Store firstStore){
        String name1=firstStore.getName();
        String a="MacDonalds";
        if(name1.equals(a)){
            name1="Вкусно и точка";
            firstStore.setName(name1);
        }
        else{
            name1 = name1.substring(1);
            firstStore.setName(name1);
        }
    }
    
}
