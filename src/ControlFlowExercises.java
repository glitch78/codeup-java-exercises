import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decrement = 105;
        int count = 0;
        int i = 4;
    while (i < 15){
        i++;
        System.out.println(i);
    }
        do {

            count +=2;
            System.out.println( count);
        } while (count < 100);

        do {
            decrement-=5;
            System.out.println(decrement);
        }while (decrement > -10);
    }
}


//
//    int i = 2;
//    double square = Math.pow(i, 2);
//do {
//
//        }while ();

