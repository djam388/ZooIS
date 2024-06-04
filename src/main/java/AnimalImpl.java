class AnimalImpl implements Animal {
    private String type;
    private String name;
    private AnimalSound sound;

    AnimalImpl(String type, String name, AnimalSound sound) {
        this.type = type;
        this.name = name;
        this.sound = sound;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSound() {
        return sound.getSound();
    }
}