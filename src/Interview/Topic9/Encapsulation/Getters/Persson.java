package Interview.Topic9.Encapsulation.Getters;

public class Persson {
    int age;
    String name;


    int getAge(){
        return  age;
    }

    String getName(){
        return name;
    }

    int setAge(int age){
        return  this.age=age;
    }

    String setName(String name){
        return this.name = name;
    }
}

