package Util;

import java.util.Scanner;

public class Input {

        private Scanner scanner;

        public void input(){
            this.scanner = new Scanner(System.in);
        }

        public String getString(){
            return this.scanner.nextLine();
        }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.getString();
    }

        public boolean yesNo(){
           String answer = this.scanner.nextLine();
           if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
               return true;
           }else {
               return false;
           }

        }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return this.yesNo();
    }

    public static void main(String[] args) {
Input input = new Input();
        System.out.println("enter your answer. Yes or no");

    }

}
