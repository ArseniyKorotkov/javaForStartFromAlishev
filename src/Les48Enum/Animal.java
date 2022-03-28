package Les48Enum;

public enum Animal {
    DOG("sobaka"), CAT("kot"), FROG("lagushka");

    private String transcription;

    Animal(String transcription) {
        this.transcription = transcription;
    }

    @Override
    public String toString() {
        return transcription;
    }
}
