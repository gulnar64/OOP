package edu.mypackage;

public class Person {
    private int privateVariable;
    int defaultVariable;
    protected int protectedVariable = 3;
    public int publicVariable;

    public Person(int defaultVariable) {
        System.out.println("super i parameter");
        this.defaultVariable = defaultVariable;
    }

    public Person() {
        System.out.println("Person constructor");
    }

    private void privateMethod() {
        System.out.println("this is private method");
    }

    void defaultMethod() {
        System.out.println("this is default method");
    }

    protected void protectedMethod() {
        System.out.println("this is protect method");
    }

    public void publicMethod() {
        System.out.println("this is public method");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.defaultVariable);
    }
}
