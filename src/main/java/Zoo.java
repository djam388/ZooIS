import java.util.Arrays;
import java.util.List;

import static java.util.Objects.isNull;

public class Zoo {
    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();

        List<String[]> animalData = Arrays.asList(
                new String[]{"Dog", "Buddy", "Woof"},
                new String[]{"Cat", "Whiskers", "Meow"},
                new String[]{"Cow", "Bessie", "Moo"},
                new String[]{"Snake", "Slither"}
        );

        List<Animal> animals = zooManager.createAnimals(animalData);

        animalSounds(animals);
    }

    public static void animalSounds(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.print("Animal type: " + animal.getType() + ", Name: " + animal.getName());
            if (!isNull(animal.getSound())) {
                System.out.println(", Says: " + animal.getSound());
            }
        }
    }
}