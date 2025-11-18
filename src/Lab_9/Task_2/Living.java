package Lab_9.Task_2;

public interface Living {
    default void live() {
        System.out.println(this.getClass().getSimpleName() + " lives");
    }
}