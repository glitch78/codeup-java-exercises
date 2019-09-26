import java.util.Arrays;

public class ArraysExercises {

    static Person[] people = new Person[4];
//
//    public static void main(String[] args) {
//        addPerson();
//        people[0] = new Person("Jayd");
//        people[1] = new Person("Sydney");
//        people[2] = new Person("Lancelot");
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
//        for (Person person : people) {
//            System.out.println(person.getName());
//
//        }
//    }
//    static void addPerson() {
//        Person[] addPerson = Arrays.copyOf(people, people.length + 1);
//        people[3] = new Person("Kona");
//    }

    Person[] peopple = {
            people[0] = new Person("Jayd"),
            people[1] = new Person("Sydney"),
            people[2] = new Person("Lancelot"),

    };

    public static Person[] addPerson(Person[] people, Person p){
        Person[] output = new Person[people.length + 1];

        for (int i = 0; i < people.length; i +=1){
            output[i] = people[i];
        }

        output[output.length -1] = p;

        return output;
    }
}





