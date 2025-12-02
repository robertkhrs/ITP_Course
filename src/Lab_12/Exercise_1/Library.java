package Lab_12.Exercise_1;
import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {

    private List<T> resources = new ArrayList<>();

    public void addMedia(T media) {
        resources.add(media);
    }

    public T getMedia(int index) {
        return resources.get(index);
    }
}