package com.company;
import java.util.Scanner;

import java.util.Random;

class GuessTheNumber{
    int rand, userChoice, noOfGuesses=0;
   public GuessTheNumber(){
       Random rd = new Random();
       rand =rd.nextInt(100);
   }
   void takeUserInput(){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your number in between 0 to 100 :- ");
       userChoice = sc.nextInt();
       noOfGuesses++;
   }
   boolean isNumberCorrect(){
       if(userChoice == rand)
       {
           System.out.println("Congratulation! You Guess the Right Number...");
           return false;
       }
        else if (userChoice < rand)
       {
           System.out.println("Sorry! you guess the Wrong number.");
           System.out.println("The number is less than the Computer generated number.");
           return true;
       }
        else
       {
           System.out.println("Sorry! you guess the Wrong number.");
           System.out.println("The number is greater than the Computer generated number.");
           return true;
       }
   }
}

public class Exercise03_GuessTheNumber {

    public static void main(String[] args) {
        boolean i=true;
        GuessTheNumber obj = new GuessTheNumber();
        while(i)
        {
           obj.takeUserInput();
           i=obj.isNumberCorrect();
        }
        System.out.println("Total number of Guesses = "+obj.noOfGuesses);

    }
}
