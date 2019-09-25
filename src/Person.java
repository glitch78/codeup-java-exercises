public class Person {


    private String name;

    public Person(String name) {
        this.name = name;
    }
    public Person(){}


    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bob Vila");
        Person person2 = new Person("lance Ellis");
        person2 = person1;
//
//        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }
}
