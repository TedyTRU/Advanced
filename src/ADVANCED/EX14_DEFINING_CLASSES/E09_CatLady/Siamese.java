package ADVANCED.EX14_DEFINING_CLASSES.E09_CatLady;

public class Siamese extends Cat{

    private double earSize;

    public Siamese(String name, String breed, double earSize) {
        super(name, breed);
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", getBreed(), getName(), this.earSize);
    }
}
