import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//
//
//        int i = 5;

//        int square = byTwo * byTwo;
//    while (i <= 15){
//                System.out.println(i);
//        i++;

//    }
// ///////increment by 2 //////////
//        int count = 0;
//        do {
//            System.out.println( count);
//            count +=2;
//        } while (count <= 100);

////////////// decrement by 5 ///////////////
//        int decrement = 100;
//        do {
//              System.out.println(decrement);
//            decrement-=5;
//        }while (decrement >= -10);


/////////////// square ///////////////////
//                long byTwo = 2;
//        do {
//            System.out.println(byTwo);
//            byTwo *= byTwo;
//        } while (byTwo <   1000000);
//
//        for(byTwo = 2; byTwo <= 1000000; byTwo *= byTwo ){
//            System.out.println(byTwo);
//        }

//////////// 1 to 100 & FizzBuzz///////////////////////

//        for (int toOneHundred = 1; toOneHundred <= 100; toOneHundred++) {
//            System.out.println(toOneHundred);
//            if (toOneHundred % 3 == 0 && toOneHundred % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (toOneHundred % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (toOneHundred % 5 == 0) {
//                System.out.println("Buzz");
//            }else {
//                System.out.println(toOneHundred);
//            }
//        }
        System.out.println("Please enter a number");
        int num = Integer.parseInt(input.nextLine()) ;
        System.out.println("Here is your table");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int counter = 1; counter <= num; counter++){
            System.out.println(String.format("%d | %d | $d", counter, Math.pow(counter,2),Math.pow(counter,3)));
        }

    }
}


