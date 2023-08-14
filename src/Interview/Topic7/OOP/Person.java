package Interview.Topic7.OOP;

public class Person {
    String name;
    int age;


}

class main {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 20;
        person.name = "Denis";
        System.out.println(person.name + " " +person.age);
    }
}
