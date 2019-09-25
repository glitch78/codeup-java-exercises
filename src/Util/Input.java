package Util;

import java.util.Scanner;

public class Input {

   private Scanner sc = new Scanner(System.in);;


        public String getString(){
            return sc.nextLine();
        }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.getString();
    }

    public boolean yesNo() {
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
        } while(input<= min || input >= max);

        return input;
    }

    public int getInt() {
        System.out.println("enter an integer again");
        return sc.nextInt();
    }

    public double getDouble (double min, double max) {
        int input;

        do {
            System.out.println("enter an integer between " + min + "and " + max);
            input = sc.nextInt();
        } while(input<= min || input >= max);

        return input;
    }

    public double getDouble() {
        System.out.println("another double digit number please ");
        return sc.nextDouble();
    }
}
