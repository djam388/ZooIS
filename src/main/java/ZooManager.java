import java.util.ArrayList;
import java.util.List;

class ZooManager {
    private AnimalFactory animalFactory = new AnimalFactoryImpl();

    public List<Animal> createAnimals(List<String[]> animalData) {
        List<Animal> animals = new ArrayList<>();
        for (String[] data : animalData) {
            String type = data[0];
            String name = data[1];
            String sound = data.length > 2 ? data[2] : "";
            animals.add(animalFactory.createAnimal(type, name, sound));
        }
        return animals;
    }
}