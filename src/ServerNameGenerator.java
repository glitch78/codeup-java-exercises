import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {
    private static String[] nouns = {"tissue, van, juice, hand, dirt, space, Kleenex, v8, Lancelot, England"};
    private static String[] adjectives = {"calm, carefree, basic, bleak, bouncy, biodegradable, coordinated eager, devoted, fortunate"};
//
//    private static String[] names = { "Terminator", "Slicer","Ninja", "cow", "Robot", "littlegirl" };
//    name = names[(int) (Math.random() * names.length)];
//System.out.println(name);

    public static String returnRandomElement(String[] arr){
        int index = (int)(Math.random() * ((arr.length -1) -1) + 1);
    return arr[index];
    }
    public static void main(String[] args) {

//        String randomWord = nouns[new Random().nextInt(nouns.length)];
//        System.out.println(randomWord);

//        for (int i = 0; i < 100; i += 1){
//            System.out.println(returnRandomElement(nouns));
//        }

        String message = String.format("%s-%s ", returnRandomElement(adjectives), returnRandomElement(nouns));
        System.out.println(message);
    }



}

