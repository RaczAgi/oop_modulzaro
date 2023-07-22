package zoo;

public class Turtle extends Animal implements Oviparous{
    public Turtle(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
    public void makeANoise() {
        System.out.println("Teknősbeszéd");
    }
}
