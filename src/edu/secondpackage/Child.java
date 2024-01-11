package edu.secondpackage;

import edu.mypackage.Alive;
import edu.mypackage.Person;

public class Child extends Person{

    public static void main(String[] args) {
        Child child = new Child();
        child.setAge(10);
        System.out.println(child.getAge());
    }
}
