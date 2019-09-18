import java.awt.*;
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Bob, are you bored?");
//        String bobQeustion = input.nextLine();
//        System.out.format("\'%s.\'",bobQeustion);
//
//        System.out.println("Sit down Bob!");
//        String bobExclamaition = input.nextLine();
//        System.out.format(" \' %s! \'", bobExclamaition);


//
//        System.out.println("'Are you bored bob?");
//        String answer = input.nextLine();
//        String exclamaition = input.nextLine();
//           if(answer.equalsIgnoreCase("sure")){
//
//           System.out.format("\'%s.\'",answer);
//           } else {
//               System.out.println("ok");
//           }
//
//           System.out.println("Sit down Bob!");
//           if(exclamaition.contains("whoa")){
//               System.out.format("%s", exclamaition);
//           }else {
//               System.out.println("ok");
//           }

        String  response = input.nextLine();
        System.out.println(response);

        if(response.endsWith("?")) {
            System.out.println("sure");
        } else if(response.endsWith("!"))
            System.out.println("Whoa, Chill!");
        else if(response.isEmpty()) {
            System.out.println("Fine. Be that way!");
        }else {
            System.out.println("Whatever");
        }
    }
}
