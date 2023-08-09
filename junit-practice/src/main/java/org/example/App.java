package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Calculator cal = new Calculator();

        Integer sum =  cal.add(1,2);

        System.out.println("sum is "+sum);
    }
}
