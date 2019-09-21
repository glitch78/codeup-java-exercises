import java.util.Scanner;

public class udemyCondtionals {
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
        System.out.println("Welcome to SuperFast Rollercoaster");
        System.out.print("Please enter your height in inches:");
        int height = sc.nextInt();

       if(height < 60){
           System.out.println("Sorry, you're too short");
       } else if(height > 84) {
           System.out.println("Sorry, you're too tall");
       }

       else {
           System.out.println("Enjoy the ride");
       }
    }
}

