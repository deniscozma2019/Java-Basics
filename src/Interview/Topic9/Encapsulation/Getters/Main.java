package Interview.Topic9.Encapsulation.Getters;

public class Main {


    public static void main(String[] args) {
        Persson persson = new Persson();
        persson.setAge(58);
        persson.setName("Denis");

        System.out.println("My name is Denis" + persson.getName() + " " + "I have a: " + persson.getAge() + " Old");
    }
}
