package edu.mypackage;

public abstract class AbstractClass {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void abstractMethod(int i);
    public void startProject() {
        System.out.println("Project start...");
    }
    public static void staticProject() {
        System.out.println("static Project start...");
    }
    public final void finalProject() {
        System.out.println("final Project start...");
    }
    public AbstractClass() {
    }
}
