package edu.mypackage;

public class ChildAbstractClass extends AbstractClass implements AliveInterface, PersonInterface {
    @Override
    public void abstractMethod(int i) {
        System.out.println("I call abstratc method: " + i);
    }

    public static void main(String[] args) {
        ChildAbstractClass childAbstractClass = new ChildAbstractClass() ;
        childAbstractClass.startProject();
        childAbstractClass.abstractMethod(5);
        childAbstractClass.finalProject();
        childAbstractClass.interfaceMethod(10);
        childAbstractClass.interfaceImplMethod(70);
    }

    @Override
    public void interfaceMethod(int i) {
        System.out.println("interface method " + i);
    }
}
