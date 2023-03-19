/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1m;

/**
 *
 * @author Home
 */
public class Store {
    private String name;
    private int openingTime;
    private int closingTime;
    private String daysOff;
    public void opens(int openHours){
        System.out.println("The store opens in " + openHours + " hours");
    }
    public void close(int closeHours){
        System.out.println("The store close in " + closeHours + " hours");
    }
     public Store(String name, int openingTime, int closingTime, String daysOff){
        this.name=name;
        this.openingTime=openingTime;
        this.closingTime=closingTime;
        this.daysOff=daysOff;
    }

    public String getName() {
        return name;
    }

    public int getOpeningTime() {
        return openingTime;
    }

    public int getClosingTime() {
        return closingTime;
    }

    public String getDaysOff() {
        return daysOff;
    }
     @Override
    public String toString() {
        String str = "Name = "+ getName() + ", Opening time = "+ getOpeningTime() + ", Closing time= "+ getClosingTime()+ ", Days offe= "+ getDaysOff();
        return str;
    }
}
