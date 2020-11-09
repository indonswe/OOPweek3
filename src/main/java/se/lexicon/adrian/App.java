package se.lexicon.adrian;

import se.lexicon.adrian.Exercises.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car nio = new Car();
        nio.model = "es6";
        nio.motorSize = 160;
        String wM = "with motor";
        String cDN = "can drive now.";
        nio.drive(nio.model, wM, nio.motorSize, cDN);
    }
}
