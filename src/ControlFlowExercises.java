import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//
//
//        int i = 4;

//        int square = byTwo * byTwo;
//    while (i < 15){
//        i++;
//        System.out.println(i);
//    }/////////increment by 2 //////////
        int count = 0;
//        do {
//
//            count +=2;
//            System.out.println( count);
//        } while (count < 100);
////////////// decrement by 5 ///////////////
//        int decrement = 105;
//        do {
//            decrement-=5;
//            System.out.println(decrement);
//        }while (decrement > -10);
/////////////// square ///////////////////
//                long byTwo = 2;
//        do {
//            System.out.println(byTwo);
//            byTwo *= byTwo;
//        } while (byTwo <   1000000);
//
//        for(byTwo = 2; byTwo < 1000000; byTwo *= byTwo ){
//            System.out.println(byTwo);
//        }

//////////// 1 to 100 & FizzBuzz///////////////////////
//
//        for(int toOneHundred = 1; toOneHundred <= 100; toOneHundred++){
//            System.out.println(toOneHundred);
//            if(toOneHundred % 3 == 0  && toOneHundred % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(toOneHundred % 3 == 0 ){
//                System.out.println("Fizz");
//            } else if(toOneHundred % 5 == 0){
//                System.out.println("Buzz");
//            }
//        }
        System.out.println("Please enter a number");
        int num = input.nextInt();
        System.out.println("number = " + num);

    }
}


