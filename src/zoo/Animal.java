package zoo;

public class Animal {
    protected String name;
    protected int age;
    protected Type type;

    public void makeANoise(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Animal(String name, int age, Type type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
}
