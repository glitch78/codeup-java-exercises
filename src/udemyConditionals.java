
import jdk.swing.interop.SwingInterOpUtils;

import java.util.WeakHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.Scanner;

public class udemyConditionals {
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

//        int min = 1;
//        int max = 5;
//        int range = max - min + 1;
//
//        int randomNumber = (int) (Math.random() * range + min);
//        System.out.println(randomNumber);
//
//        System.out.println("Guess a number between 1 and 5");
//        int guessedNumber = sc.nextInt();
//        if (guessedNumber == randomNumber) {
//            System.out.println(" Aren’t you lucky.");
//        } else {
//            System.out.println("Wrong, you have one more guess");
//            guessedNumber = sc.nextInt();
//            if (guessedNumber == randomNumber) {
//                System.out.println("Got it right the second time");
//            } else {
//                System.out.println("Wrong number, better luck next time");
//            }
//        }
        /////////// The while loop ///////////
//
//        int i = 0;
//
//        while(i < 10){
//            System.out.println("test");
//            i = i + 1;
//
//        }

        /////////// For Loop ////////////
//
//        for(int i = 7; i <= 21; i ++){
//            System.out.println(i);
//        }

        ///////// Break and continue /////////
//
//        for(int i = 1; i <= 10; i ++){
//            if(i == 5){
////                break;
//                continue;
//            }
//            System.out.println(i);
//     }


        //////// The do-while loop ////////////
//
//        String again;
//
//        do {
//            int num = ThreadLocalRandom.current().nextInt(1, 7);
//            System.out.println("You rolled a " + num + ".");
//            System.out.println("Roll again, yes or no");
//            again = sc.next();
//        } while (again.equalsIgnoreCase("yes"));


//        Write a program which prints numbers from 89 to 117
//
//        for(int i = 89; i <= 117; i++) {
//            System.out.println(i);
//        }
//        Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”.

//        for(int i = 1; i <= 40; i++){
//            if(i % 3==0){
//                System.out.println(i +"\nQuack");
//            }
//            else {
//                System.out.println(i);
//            }
//        }
//        Write a program which asks the user for a password. Make the password “shark50”. Each time the user enters the password incorrectly, prompt them for a password again. When the user enters the password correctly, print “ACCESS APPROVED”.


//        String userPasswordInput;
//        String userPassword = "shark50";
//        String userPasswordInput;
//
//         do {
//             System.out.println("Enter your password");
//               userPasswordInput = sc.nextLine();
//         }while (!userPasswordInput.equals(userPassword));
//        System.out.println("ACCESS APPROVED");

        //Write a program which makes use of a loop to print the following output:
        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.

//        for(int i = 0; i <= 10; i++ ){
//            System.out.println(i);
//        }


//        Create a game where the program picks a random number from 1 to 100 and the player has to guess it. Each time the player makes a guess, print “HIGHER” if the guess was too low or “LOWER” if the guess was too high. If the player correctly guesses the number, print “CORRECT”, then end the game.
//
//        You can use the line of code below which produces a random number from 1 to 100, and stores it in randomNumber.


//
//            int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
//            int guess;
//            int guessCount = 0;
//        System.out.println(randomNumber);
//            do {
//                System.out.println("Enter a number between one and one hundred");
//                guess = sc.nextInt();
//                guessCount++;
//                if(guess < randomNumber){
//                    System.out.println("HIGHER");
//                } else if(guess > randomNumber){ ;
//                    System.out.println("LOWER");
//                } else {
//                    System.out.println("CORRECT! My number was: " + randomNumber);
//                    System.out.println("It took you " + guessCount + " guesses to guess my number.");
//                }
//            } while(guess != randomNumber);

        ///////// Introduction to arrays //////////

        int[] arbitraryNumbers = {75, 29, 350, 7, 204, 88, 67};
//        System.out.println(b[3]);
//
//        for(int i = 0; i < 5; i++){
//            System.out.println(b[i]);
//        }

        /////// Adaptive iteration /////////

//        for(int i = arbitraryNumbers.length - 1; i >=0; i--){
//            System.out.println(arbitraryNumbers[i]);
//        }

        /////// Simple processing using arrays /////////
//        int count = 0;
//        int sumOfNums = 0;
//
//        for(int i = 0; i < arbitraryNumbers.length; i++){
//            // count all numbers over 100
//        if(arbitraryNumbers[i] > 100){
//            System.out.println(arbitraryNumbers[i]);
//            count++;
//
//        }
//        // add up all numbers
//        sumOfNums = sumOfNums + arbitraryNumbers[i];
//
//        }
//        System.out.println("There were " + count + " numbers over one hundred" );
//        System.out.println();
//        double avg = (double) sumOfNums / arbitraryNumbers.length;
//        System.out.println("The average of arbitrary numbers is " + avg);
//
//        String[] predictions =  new String[3];
//        predictions[0] = "A pioneer";
//        predictions[1] = "You will be loved by many";
//        predictions[2] = "you'll be very wealthy";
//
//        System.out.println("I will predict your future, choose 1, 2, or 3.");
//        int choice = sc.nextInt();
//
//        System.out.println("In the future you will be " + predictions[choice -1]);

        /////////  Inputting data and generating a statistic /////////
        // exercise on race car driver lap times
//
//        System.out.println("Number of laps: ");
//
//
//        int numberOfLaps = sc.nextInt();
//
//        double[] lapTimes = new double[numberOfLaps];
//
//        for(int i = 0; i < numberOfLaps; i++){
//            System.out.println("Lap time:");
//            lapTimes[i] = sc.nextDouble();
//        }
//        double fastestTime = lapTimes[0];
//        for(int i = 0; i < lapTimes.length; i++){
//            if(lapTimes[i] < fastestTime){
//                fastestTime = lapTimes[i];
//            }
//        }
//
//        System.out.println("The fastest time was: " + fastestTime);

//
//        ////// Introduction to methods //////
//        System.out.println(19);
//        bar();
//        foo();
//        System.out.println(24);
//    }
//
//    public static void foo() {
//        int x = 50;
//        System.out.println(x);
//        System.out.println(16);
//    }
//    public static  void bar(){
//        foo();
//        System.out.println("12");

        ////// Passing data to methods ////////
//
//        int var = 5;
//
//
//        foo(var, 57.5, " It's hard to connect with people");
//
//
//    }
//    public static void foo(int a, double b, String c){
//        System.out.println(a + b + c);


        ////// Returning data from methods ///////

//        foo(3);
//
//        System.out.println(bar());
//    }
//
//    public static void foo(int a) {
//        if(a < 5){
//            return;
//        }
//        System.out.println(a);
//    }
//
//    public static double bar() {
//    return 49.5;

//        System.out.println(coneVolume(4, 5));
//    }
//
//    public static double coneVolume(double r, double h){
//        return Math.PI * r * r * h / 3;
//
//        public static void fizzBuzzLoop() {
//            int i = 1;
//            while (true) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//                if (i == 100) {
//                    break;
//                }
//                i++;
//            }
//        }

    }
}

