package edu.mypackage;

public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void abstractMethod(int i) {
                System.out.println("constructor : " + i);
            }
        };
        abstractClass.startProject();
        abstractClass.abstractMethod(5);
    }
}
