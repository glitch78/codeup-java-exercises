import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class extraPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ////////These Problems are from: http://www.beginwithjava.com/java/methods/questions.html/////////////
/////// Write a program with a method named getTotal that accepts two integers as an argument and return its sum. Call this method from main( ) and print the results.//////////
//
//        int num1, num2;
//       System.out.println("Enter the first number");
//       num1 = Integer.parseInt(input.nextLine());
//        num1 = input.nextInt();
//        System.out.println(num1);
//
//        System.out.println("Enter the second number");
//        num2 =input.nextInt();
//        System.out.println(num2);
//System.out.format("The sum is : %s", num1 + num2);
//
//System.out.println("\nEnter a number");
//int evenNum = input.nextInt();
//        if(evenNum % 2 == 0){
//            System.out.print(true);
//        }else {
//            System.out.print(false);
//        }
//        System.out.println("\nWrite a sentence");
//        String vowels = input.nextLine();
//        for(int i = 0; i < vowels.length(); i++) {
//         if (vowels.charAt(i)== 'a' || vowels.charAt(i)== 'e' || vowels. charAt(i) == 'i' || vowels.charAt(i) == 'o' || vowels.charAt(i) == 'u'){
//               System.out.println("Sentence contains vowel at: " + vowels.charAt(i) + "at the index of " + i);
//           }
//       }

        ///////// The following methods are from the following youtube link: https://www.youtube.com/watch?v=-IJ5izjbWIA \\\\\\\\\\\\\\

        sayHelloWorld();

        sayHelloTo("Sydney");

        int x = return5();
        System.out.println(x);

        int result = square(return5());
        System.out.println(result);
    }
    // This method returns a value, and takes in dada
    static int square(int x){
        return x * x;
    }

    // This method returns an int type with the value of 5
    static int return5() {
        return 5;
    }

    // This method will say hello with the name that has been passed when called
    static void sayHelloTo(String name) {
        System.out.println("Say Hello to " + name);
    }
     //This method says Hello, World!
    static void sayHelloWorld() {
        System.out.println("Hello, World");


        /// Objects Practice///////
        JFrame window = new JFrame();   // window variable that holds JFrame objects, and create Jframe to assign to our variable
        window.setTitle("JFrame Window"); // calling methods on our JFrame object to configure it
        window.setSize(800, 600);
        window.setVisible(true);

        JLabel label = new JLabel();  // label variable holds JLabel objects, and creates JFrame to assign to our variable variable
        label.setText("My Label"); // calling the setText method on our JLabel object

        window.add(label);  // calling the add method to add our label to the window


    }

}

