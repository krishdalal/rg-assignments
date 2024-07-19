package org.example;

interface MyInterface {
    void abstractMethod();
    default void defaultMethod(){
        System.out.println("This is default from interface...");
    }
    static void staticMethod(){
        System.out.println("This is static from interface...");
    }
}

class MyClass implements MyInterface {

    @Override
    public void abstractMethod() {
        System.out.println("This is abstract from class...");
    }

    @Override
    public void defaultMethod(){
        System.out.println("This is default from class...");
    }
}

public class DefaultStaticDemo
{
    public static void main( String[] args )
    {
        MyClass myClass = new MyClass();
        myClass.abstractMethod();
        myClass.defaultMethod();
        MyInterface.staticMethod();
    }
}