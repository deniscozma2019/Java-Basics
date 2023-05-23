package Poo.Intefaces;

public class Test {
    public static void main(String[] args) {
       Info info = new Animal(1);
       Info info1 = new Person("Denis");
       info.showInfo();
       info1.showInfo();
    }
}
