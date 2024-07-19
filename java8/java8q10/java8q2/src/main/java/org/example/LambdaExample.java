package org.example;

interface Shape{
    void draw();
}

public class LambdaExample
{
    public static void main( String[] args )
    {
        Shape square = () -> {
            System.out.println( "*  *  *  *" );
            System.out.println( "*        *" );
            System.out.println( "*        *" );
            System.out.println( "*  *  *  *" );
        };

        Shape rectangle = () -> {
            System.out.println( "*  *  *  *  *  *" );
            System.out.println( "*              *" );
            System.out.println( "*              *" );
            System.out.println( "*  *  *  *  *  *" );
        };

        square.draw();
        rectangle.draw();
    }
}
