/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1m;

/**
 *
 * @author Home
 */
public class ClothingStore extends Store{
    private String nameOfTheMainSeller;
    private int nomberOfChangingRooms;
    private int discountForRegularCustomers;
    private int numberOfSellers;
    public void seasonalclothing(int clothing){
        System.out.println("Now a seasonal clothing is " + clothing);
    }
    public void favoriteColor(int color){
        System.out.println("Now the favorite color of buyers is " + color );
    }
    public ClothingStore(String name, int openingTime, int closingTime, String daysOff,String nameOfTheMainSeller,int nomberOfChangingRooms,int discountForRegularCustomers,int numberOfSellers) {
        super(name, openingTime, closingTime, daysOff);
        this.nameOfTheMainSeller=nameOfTheMainSeller;
        this.discountForRegularCustomers=discountForRegularCustomers;
        this.nomberOfChangingRooms=nomberOfChangingRooms;
        this.numberOfSellers=numberOfSellers;
    }

    public String getNameOfTheMainSeller() {
        return nameOfTheMainSeller;
    }

    public int getNomberOfChangingRooms() {
        return nomberOfChangingRooms;
    }

    public int getDiscountForRegularCustomers() {
        return discountForRegularCustomers;
    }

    public int getNumberOfSellers() {
        return numberOfSellers;
    }
    @Override
    public String toString() {
        String str = "Name = "+ getName() + ", Opening time = "+ getOpeningTime() + ", Closing time= "+ getClosingTime()+ ", Days offe= "+ getDaysOff()+ ", Name of the main seller= " + getNameOfTheMainSeller()+ ", Nomber of changing rooms= " +getNomberOfChangingRooms()+ ", Discount for regular customers= " +getDiscountForRegularCustomers()+ ", Number of sellers= " +getNumberOfSellers();
        return str;
    }
}
