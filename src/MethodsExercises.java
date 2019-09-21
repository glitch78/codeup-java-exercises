import java.util.Scanner;

public class MethodsExercises {
    public static void  main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println(addition(3, 5)+ " additon");

        System.out.println(subtraction(110,78) + " subtraction");

        System.out.println(multipication(3,15)+ " multiplication");

        System.out.println(division(15, 3) + " division");

        System.out.println(modulus(15, 2) + " modulus");

        int  userInput = getInteger(1, 10);

        int  userNum = factoral(1, 10);
//
    }
      public static int  addition(int num1, int num2){
        return num1 + num2;

      }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int multipication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }


    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max){
        System.out.println("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
         int userInput = sc.nextInt();
        if(userInput > min && userInput < max) {
            System.out.println("Valid number entered");
        return userInput;

    } else  {
            System.out.println("invalid number");
           return getInteger(min, max);
        }

        public static void factorialChart(int num) {

            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial = 1;
                System.out.print(i + "! = ");
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    if (j != i) System.out.print(" x ");
                    else {
                        for (int k = 1; k <= (num - i); k++) System.out.print("    ");
                        if (num > 9 && i <=9) System.out.print("  ");
                    }
                    factorial *= j;
                }
                System.out.println(" = " + factorial);

            }
        }
  }
    public static void  factorChart(int num){

      long  factorial = 1;

      for (int i =1; i <= num; i++){
          factorial = 1;
          System.out.println("enter a number between 1 and 10");
          System.out.println(i + "! = ");
      }
    }


}
