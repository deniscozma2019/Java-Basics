package Poo.Intefaces;

public class Person implements Info {
    public String name;


    public void sayHello(){
        System.out.println("Hello");

    }

    public Person(String name) {
        this.name = name;
    }
    public void showInfo(){
        System.out.println("name is "+"" +this.name);
    }
}
