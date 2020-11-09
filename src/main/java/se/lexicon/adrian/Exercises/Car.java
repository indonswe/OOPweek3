//package se.lexicon.adrian;

package se.lexicon.adrian.Exercises;

public class Car {
    private int id;
    private int year;
    public String model;
    private String colour;
    public int motorSize;

    public void drive(String model, String vM, int motorSize, String cDN){

        System.out.printf(model);
        System.out.printf(" ");
        System.out.printf(vM);
        System.out.printf(" ");
        System.out.printf(String.valueOf(motorSize));
        System.out.printf(" ");
        System.out.printf(vM);


//+ this.motorSize+ ” can drive now.”);
    }
}
