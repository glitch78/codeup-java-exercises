package animals;


public class InheritanceTest {
    public static void main(String[] args) {
        Dog kona = new Dog();
        kona.setBreed("Husky");
        kona.setAge(3);
        System.out.println(kona.getAge());
        System.out.println(kona.getBreed());

        Dog kamus = new Dog();
        kamus.setBreed("German Shepherd");
        System.out.println(kamus.getBreed());


    }
}
