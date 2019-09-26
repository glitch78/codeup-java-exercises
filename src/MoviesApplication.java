import movies.Movie;
import movies.MoviesArray;
import Util.Input;
public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        displayMenu();
int userChoice;

//
//
//        System.out.println(willContinue);

boolean willContinue;

//        do {
//            displayMenu();
//            userChoice = input.getInt(0,5);
//            willContinue = processChoice(userChoice);
//            System.out.println(willContinue);
//
//       } willContinue
//
//        System.out.println(MoviesArray.findAll()[0].getName());

//        for(int i = 0; i < MoviesArray.findAll().length; i++){
//            if(userChoice == 1){
//
//            }
//            System.out.println(MoviesArray.findAll()[i].getName());



//        }



    }
    public static void  displayMenu(){
        String menu = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";
    }

    public static boolean processChoice(int userChoice){
        boolean output = true;
        switch (userChoice){
            case 0 :
                System.out.println("exit");
                output = false;
                break;
            case 1:
                System.out.println("View All movies");
                break;
            case 2:
                System.out.println("View movies in the animated category");
                break;
            case 3:
                System.out.println("drama");
                break;
            case 4:
                System.out.println("horror");
                break;
            case 5:
                System.out.println("scifi");
                break;
        }
        return output;
    }

    public static void  display(){
        String output = "";
        for(Movie movie : MoviesArray.findAll())
            output += String.format("%s -- %s", movie.getName(),movie.getCategory());
        System.out.println(output);
    }

    public static void  display(String category) {
        String output = "";
        for (Movie movie : MoviesArray.findAll())
            if (category.equalsIgnoreCase(movie.getCategory()))
                output += String.format("%s -- %s", movie.getName(), movie.getCategory());
        System.out.println(output);
    }
}
