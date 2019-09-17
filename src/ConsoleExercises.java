import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
           double pi = 3.14159;
//
//           System.out.println("The value of pi is approximately " + pi);
//
//           System.out.format("The value of pi is approximately %s",pi);
        Scanner input = new Scanner(System.in);
//        System.out.println("\nEnter an integer");
//        int num = input.nextInt();
//        System.out.format("You entered the number: %s", num);
//        System.out.println("\nEnter a word");
//        String word1 = input.next();
//        System.out.format("The first word entered %s", word1);
//        System.out.println("\nEnter a word");
//        String word2 = input.next();
//        System.out.format("The second word entered %s", word2);

//        System.out.println("\nEnter a word");
//        String word3 = input.next();
//        System.out.format("The third word entered %s", word3);
//
//        System.out.println("\nWrite a sentence");
//        String userInput = input.nextLine();
//        System.out.format("The sentence you entered is %s", userInput);

//        System.out.println("\n Enter length");
//        int length = input.nextInt();
//        System.out.println("\n Enter width");
//        int width = input.nextInt();
//        int area = length * width;
//        System.out.format("The area of the room is %s ", area);


        System.out.println("Enter length");
        String lengthStr = input.nextLine();
        System.out.println("Enter width");
        String widthStr = input.nextLine();


        int width = Integer.parseInt(lengthStr);


        int length = Integer.parseInt(widthStr);

        int area = length * width;

        int perimeter = ((length * 2)+(width * 2));

        System.out.format("The area of the room is %s", area);
        System.out.format("\nThe perimeter of the room is %s", perimeter);







    }
}

