package edu.mypackage;

public class Employer extends Person {
    private int i;
    private Employer employer;

    public static void main(String[] args) {
        Employer employer1 = new Employer();
        Person person = new Employer();
        employer1.publicMethod();
    }

//    @Override
//    public void publicMethod() {
//        super.publicMethod();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public  Employer createObject() {
        return this;
    }

    public static Employer createObject(Employer employer) {
        return employer;
    }


//    public Employer() {
//        super(5);
//        System.out.println("no parameter");
//    }

//    public Employer(Employer employer) {
//        this();
//        System.out.println("employer parameter");
//        this.employer = employer;
//    }
//
//    public Employer(int i) {
//        System.out.println("i parameter");
//        this.i = i;
//    }

    class Engeneer {
        public void method() {
            System.out.println("engeneer method");
        }
    }

    static class Doctor {
        public static void method() {
            System.out.println("doctor method");
        }

        public void method2() {
            System.out.println("doctor method2");
        }

    }

    public interface innerInterface {

    }
}
