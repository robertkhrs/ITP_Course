package Lab_12.Exercise_1;

public abstract class Media {
    private String title;

    public Media(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + title;
    }
}