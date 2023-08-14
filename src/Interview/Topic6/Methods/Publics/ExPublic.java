package Interview.Topic6.Methods.Publics;

import Interview.Topic7.OOP.Person;

public class ExPublic {
    public static void main(String[] args) {
            Human person = new Human();

            person.setFirstName("Denis");
            person.setLastName("Cozma");
            person.setAge(23);
            person.speak();
            person.calculateYearsToRetirement();
            int age1 = person.calculateYearsToRetirement();
            System.out.println("Pina la pensie a ramas" +  " " +age1);
   /*     person.setFirstName("Denis");
        person.setAge(25);
        person.setLastName("Cozma");
        System.out.println("My  First Name is:" + person.getFirstName());
        System.out.println("My  Last Name is:" + person.getLastName());
        System.out.println("My age is: " + person.getAge());*/



     /*   System.out.println(person.Speak("Hellooo"));
*/
    }
}
