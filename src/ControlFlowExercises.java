import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int decrement = 105;
//        int count = 0;
//        int i = 4;

//        int square = byTwo * byTwo;
//    while (i < 15){
//        i++;
//        System.out.println(i);
//    }/////////increment by 2 //////////
//        do {
//
//            count +=2;
//            System.out.println( count);
//        } while (count < 100);
////////////// decrement by 5 ///////////////
//        do {
//            decrement-=5;
//            System.out.println(decrement);
//        }while (decrement > -10);
                long byTwo = 2;
        do {
            System.out.println(byTwo);
            byTwo *= byTwo;
        } while (byTwo <   1000000);
    }
}


