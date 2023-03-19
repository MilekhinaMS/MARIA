/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1m;

/**
 *
 * @author Home
 */
public class FoodShop extends Store{
    private String directorsName;
    private int discountForPensioners;
    private int scalesForVegetables;
    private int numberOfCashRegisters;
    public void seasonVegetable(int vegetable){
        System.out.println("Now a seasonal vegetable is " + vegetable );
    }
    public void bestProduct(int product){
        System.out.println("The best product is " + product );
    }

    public FoodShop(String name, int openingTime, int closingTime, String daysOff,String directorsName,int discountForPensioners,int scalesForVegetables,int numberOfCashRegisters) {
        super(name, openingTime, closingTime, daysOff);
        this.directorsName=directorsName;
        this.discountForPensioners=discountForPensioners;
        this.numberOfCashRegisters=numberOfCashRegisters;
        this.scalesForVegetables=scalesForVegetables;
    }

    public String getDirectorsName() {
        return directorsName;
    }

    public int getDiscountForPensioners() {
        return discountForPensioners;
    }

    public int getScalesForVegetables() {
        return scalesForVegetables;
    }

    public int getNumberOfCashRegisters() {
        return numberOfCashRegisters;
    }
    @Override
    public String toString() {
        String str = "Name = "+ getName() + ", Opening time = "+ getOpeningTime() + ", Closing time= "+ getClosingTime()+ ", Days offe= "+ getDaysOff()+ ", Directors name= " + getDirectorsName()+ ", Discount for pensioners= " +getDiscountForPensioners()+ ", Nomber of scales for vegetables= " +getScalesForVegetables()+ ", Number of cash registers= " +getNumberOfCashRegisters();
        return str;
    }
    
}
