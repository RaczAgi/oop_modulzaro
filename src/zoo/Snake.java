package zoo;

public class Snake extends Animal implements Oviparous{

    public Snake(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
    public void makeANoise() {
        System.out.println("Ssssszzzzzzzzzzzzzzz");
    }
}
