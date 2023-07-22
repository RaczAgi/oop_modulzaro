package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zoo {
    List<Animal> zoo = new ArrayList<>();


    public void addAnimal(Animal animal) {
        zoo.add(animal);
    }

    public void removeAnimal(Animal animal) throws NoSuchAnAnimalException {
        for (Animal animal1 : zoo) {
            if (animal.equals(animal1)) {
                zoo.remove(animal1);
            }
        }
        throw new NoSuchAnAnimalException("Nincs ilyen állat");
    }

    public void animalList() {
        for (Animal animal : zoo) {
            System.out.println(animal);
        }
    }

    public void mammalList() {
        for (Animal animal : zoo) {
            if (animal.getType().equals(Type.MAMMAL)) {
                System.out.println(animal);

            }
        }
    }

    public void birdList() {
        for (Animal animal : zoo) {
            if (animal.getType().equals(Type.BIRD)) {
                System.out.println(animal);

            }
        }
    }

    public void reptileList() {
        for (Animal animal : zoo) {
            if (animal.getType().equals(Type.REPTILE)) {
                System.out.println(animal);
            }
        }
    }
}
