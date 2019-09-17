import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
           double pi = 3.14159;

//
        Scanner scanner = new Scanner(System.in);

      System.out.print("The value of pie is approximately " + pi);
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}

