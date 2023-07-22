package zoo;

public class Penguin extends Animal implements Oviparous{

    public Penguin(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
    public void makeANoise() {
        System.out.println("MitMondAPingvin");
    }
}
