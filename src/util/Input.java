package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

//    private Scanner scanner;
//    public Input (){
//        this.scanner = new Scanner(System.in);
//    }


    public String getString() {
        return this.sc.nextLine();
    }

    public String getString(String prompt) {
        if(prompt.isEmpty()){
            System.out.println("Type something");
        }else {
            System.out.println(prompt);
        }
        return this.getString();
    }

    public boolean yesNo() {
        System.out.println("Type yes/no");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        } else return false;
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return this.yesNo();
    }


    public int getInt(int min, int max) {

        int input;

        do {
            System.out.println("enter an integer between " + min + "and " + max);
            input = sc.nextInt();
        } while (input <= min || input >= max);

        return input;
    }


    public int getInt() {
        System.out.println("enter an integer again");
        return sc.nextInt();
    }

    public double getDouble(double min, double max) {
        int input;

        do {
            System.out.println("enter an integer between " + min + "and " + max);
            input = sc.nextInt();
        } while (input <= min || input >= max);

        return input;
    }

    public double getDouble() {
        System.out.println("another double digit number please ");
        return sc.nextDouble();
    }
}
