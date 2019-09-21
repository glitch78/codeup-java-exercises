
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class udemyCondtionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ////////// Introduction to if-statements ///////////
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//
//        if(10 < 5){
//            System.out.println(4);
//            System.out.println(5);
//            System.out.println(6);
//        }
//
//        System.out.println(7);
//        System.out.println(8);
//        System.out.println(9);


        ///////// If, else-if, and else blocks  ///////////////
//        System.out.println("Welcome to SuperFast Rollercoaster");
//        System.out.print("Please enter your height in inches:");
//        int height = sc.nextInt();
//
//       if(height < 60){
//           System.out.println("Sorry, you're too short");
//       } else if(height > 84) {
//           System.out.println("Sorry, you're too tall");
//       }
//
//       else {
//           System.out.println("Enjoy the ride");
//       }
        ////////// Complex conditions with logical operators  /////////
//
//        if(height > 60 && height < 84) {
//            System.out.println("Enjoy the ride");
//        }else {
//            System.out.println("You do not meet the requirements");
//        }
        //////// Checking String Equality ///////////
//        System.out.println("The Vip Lounge");
//
//        System.out.println("Age");
//        int age = sc.nextInt();


//
//
//
//        if (age >= 18 && vipPassReply.equalsIgnoreCase("Yes")|| age>= 70) {
//            System.out.println("Thanks, go on in");
//        } else {
//            System.out.println("Sorry, can't let you in.");
//        }
        ///////// Nesting if-statements  ///////////
//
//        if (age>= 70 || (age >= 18 && vipPassReply.equalsIgnoreCase("Yes"))) {
//            System.out.println("Thanks, go on in");
//        } else {
//            System.out.println("Sorry, can't let you in.");
//        }
//
//        if(age >= 18){
//            System.out.println("Do you have a vip pass? yes/no");
//            String vipPassReply = sc.next();
//            if(vipPassReply.equalsIgnoreCase("yes") || age >= 70){
//                System.out.println("Thanks, go on in!");
//            }
//            else {
//                System.out.println("Sorry, you must be over 70 or  have a pass");
//            }
//        }
//        else {
//            System.out.println("Sorry, you must be 18");
//        }
//        ///////  Coding Challenge 3 - If-then Statements ///////

//        Write a program with two int variables, int x and int y, and give each one a value. Depending on their values, print “x is bigger than y”, “x is smaller than y”, or “x and y are the same”. Change the values and run the program a few times to check it works.

//        Modify the program from Exercise 1 so it also prints the difference between x and y.
//
//        System.out.println("enter first number");
//        int x = sc.nextInt();
//        System.out.println("Enter another number");
//        int y = sc.nextInt();
////
//        if (x > y){
//            System.out.println(x + " Is greater than " + y);
//            System.out.printf("The first number minus the second = %s", x-y);
//        }else {
//            System.out.println(y + " Is greater than " + x);
//            System.out.printf("The second number  minus the first number = %s", y-x);
//        }
//
//        Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it.
//
//                If the player guesses right, print “Correct! Aren’t you lucky.“.
//
//        If the player guesses wrong, print “Hard luck! Maybe next time.“.
//
//        You can use the line of code below which produces a random number from 1 to 5 and stores it in a variable called randomNumber.

        int min = 1;
        int max = 5;
        int range = max - min + 1;

        int randomNumber = (int) (Math.random() * range + min);
        System.out.println(randomNumber);

        System.out.println("Guess a number between 1 and 5");
        int guessedNumber = sc.nextInt();
        if (guessedNumber == randomNumber) {
            System.out.println(" Aren’t you lucky.");
        } else {
            System.out.println("Wrong, you have one more guess");
            guessedNumber = sc.nextInt();
            if (guessedNumber == randomNumber) {
                System.out.println("Got it right the second time");
            } else {
                System.out.println("Wrong number, better luck next time");
            }
        }
    }
}

