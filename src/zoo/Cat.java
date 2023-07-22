package zoo;

public class Cat extends Animal implements Viviparous{
    public Cat(String name, int age, Type type) {
        super(name, age, type);
    }

    @Override
    public void makeANoise() {
        System.out.println("MiuMiu");
    }
}
