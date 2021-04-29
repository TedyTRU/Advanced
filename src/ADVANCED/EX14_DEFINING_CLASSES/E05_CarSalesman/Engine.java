package ADVANCED.EX14_DEFINING_CLASSES.E05_CarSalesman;

public class Engine {

    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    //private static String defaultDisplacement = "n/a";
    //private static String defaultEfficiency = "n/a";

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }
}