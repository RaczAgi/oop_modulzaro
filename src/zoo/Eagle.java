package zoo;

public class Eagle extends Animal implements Oviparous, Flyable {

    public Eagle(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
    public void canFly() {

    }

    @Override
    public void makeANoise() {
        System.out.println("Visít?");
    }
}
