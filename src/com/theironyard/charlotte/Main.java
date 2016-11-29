package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println();
        Person createMe = new Person();
        createMe.myInfo();

        Dessert mycraving = new Dessert();
        mycraving.myDessert();


        Dance myDanceLike = new Dance();
        myDanceLike.music = "tamil";
        myDanceLike.type = "classical";
        myDanceLike.pace = "medium";

        myDanceLike.loveToDance(myDanceLike);

        Bird pet = new  Bird();
        pet.myBirdType();

        Car myRide = new Car();
        myRide.make = "BMW";
        myRide.model ="i8";
        myRide.year = 2017;
        myRide.cost = 141698;

        myRide.myCar();


    }
}
