package Lab_12.Exercise_1;
import java.util.ArrayList;
import java.util.List;

public class NonGenericLibrary {
    private List<Object> resources = new ArrayList<>();

    public void addMedia(Object media) {
        resources.add(media);
    }

    public Object getMedia(int index) {
        return resources.get(index);
    }
}