package Interview.Topic6.Methods.Publics;

import java.util.Scanner;

public class Human {
    public String firstName;
    public String lastName;
    public int age;

    void speak(){
        for (int i = 0 ; i<5; i++){
            System.out.println("My first name is: "+ firstName+ " "+ " My last name is: "+ lastName + " " + "My age is: " + age);
        }
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void  setLastName(String lastName){
        this.lastName = lastName;
    }

    public int setAge(int age) {
      return  this.age = age;
    }

    public Human (int age ,String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public Human() {
    }

}






