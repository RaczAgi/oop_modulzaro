package zoo;

public class Dog extends Animal implements Viviparous{

    public Dog(String name, int age, Type type) {
        super(name, age, type);
    }


    @Override
    public void makeANoise() {
        System.out.println("WuffWuff");
    }
}
