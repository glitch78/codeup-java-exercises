package Util;

public class InputTest {

    public InputTest() {
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("enter your answer. Yes or no");
        System.out.println(input.yesNo());
        System.out.println(input.getString("What's up with my brain"));

        System.out.println(input.getDouble(0.5, 10.5));
    }
}
