/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.hw1m;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class HW1M {

    public static void main(String[] args) {
        System.out.println("option №5 Maria Milekhina");
        Scanner in = new Scanner(System.in);
        System.out.println("You want to choose Store, Food store or Cloothing stor? \n Store 1 \n Food store 2 \n Cloothing stor 3 ");
        String storeType= in.nextLine();
        System.out.println("What name of store? ");
        String name= in.nextLine();
        System.out.println("What opening time? ");
        int openingTime=in.nextInt();
        System.out.println("What closing time? ");
        int closingTime=in.nextInt();
        System.out.println("On what days is the store closed? ");
        Scanner an = new Scanner(System.in);
        String daysOff=an.nextLine();
        if (storeType.equals("1")){
             Store firstStore = new Store(name,openingTime,closingTime,daysOff);
             System.out.println(firstStore.toString());
        }
        else if(storeType.equals("2")){
            Scanner on = new Scanner(System.in);
            System.out.println("What directors name? ");
             String directorsName= on.nextLine();
             System.out.println("What discount for pensioners? ");
             int discountForPensioners=in.nextInt();
             System.out.println("How many scales for vegetables? ");
             int scalesForVegetables=in.nextInt();
             System.out.println("What number of cash registers? ");
             int numberOfCashRegisters=in.nextInt();
             FoodShop firstFoodshop = new FoodShop(name,openingTime,closingTime,daysOff,directorsName,discountForPensioners,scalesForVegetables,numberOfCashRegisters);
             System.out.println(firstFoodshop.toString());
        }
        else if(storeType.equals("3")){
            Scanner en = new Scanner(System.in);
            System.out.println("What name of the main seller? ");
             String nameOfTheMainSeller= en.nextLine();
             System.out.println("What nomber of changing rooms? ");
             int nomberOfChangingRooms=in.nextInt();
             System.out.println("What discount for regular customers? ");
             int discountForRegularCustomers=in.nextInt();
             System.out.println("What number of sellers? ");
             int numberOfSellers=in.nextInt();
             ClothingStore firstClothingStore = new ClothingStore(name,openingTime,closingTime,daysOff,nameOfTheMainSeller,nomberOfChangingRooms,discountForRegularCustomers,numberOfSellers);
             System.out.println(firstClothingStore.toString());
        }
    }
}
