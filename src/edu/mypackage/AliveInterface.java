package edu.mypackage;

public interface AliveInterface {
    int i = 70;
    void interfaceMethod(int i);
    default void interfaceImplMethod(int i) {
        System.out.println("interfaceImplMethod");
    }
}
