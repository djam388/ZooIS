class AnimalFactoryImpl implements AnimalFactory {
    @Override
    public Animal createAnimal(String type, String name, String sound) {
        AnimalSound animalSound;
        if (sound == null || sound.isEmpty()) {
            animalSound = new NoSound();
        } else {
            animalSound = new AnimalSoundImpl(sound);
        }
        return new AnimalImpl(type, name, animalSound);
    }
}