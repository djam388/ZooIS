public class AnimalSoundImpl implements AnimalSound{
    private final String sound;

    AnimalSoundImpl(String sound) {
        this.sound = sound;
    }

    @Override
    public String getSound() {
        return sound;
    }
}
