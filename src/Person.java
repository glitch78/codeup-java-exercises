public class Person {


    private String name;

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public  void SetName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Lance");
        Person person2 = new Person("Lance");
        person2 = person1;
//
//        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }
}
