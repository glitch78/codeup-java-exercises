package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }




//    public static void main(String[] args) {
//        Input input = new Input();
//        System.out.println("what would you like to do?" + "\n0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category");
//        int userinput = input.getInt();

//    }

}
