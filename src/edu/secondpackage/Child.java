package edu.secondpackage;

import edu.mypackage.Person;

public class Child extends Person{

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.protectedVariable);
    }
}
