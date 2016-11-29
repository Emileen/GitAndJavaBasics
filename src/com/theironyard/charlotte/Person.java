package com.theironyard.charlotte;

/**
 * Created by loydcharles on 11/29/16.
 */
public class Person {
    String firstName  = "Emileen";
    String lastName = "Marianayagam";
    int Age  = 35;





    public void myInfo(){

        System.out.println("My Name is: " + firstName + " " + lastName + " and I am " + Age);

        if (Age <30){
            System.out.println("you are young");
        }else if (Age>=30||Age<=50){
            System.out.println("you are wise!!!");
        }else if(Age>50){
            System.out.println("you are the wisest");
        }else{
            System.out.println("you are old -- :)");
        }
    }


}
