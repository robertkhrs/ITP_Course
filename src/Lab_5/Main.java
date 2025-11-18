package Lab_6;

public class Main {
    int seconds;
    int minutes;
    int hours;

    public Main(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {
        Main start = new Main(10, 20, 0);
        Main stop = new Main(5, 0, 0);
        Main diff;

        diff = difference(start, stop);
        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static Main difference(Main start, Main stop) {
        int startSeconds = start.hours * 3600 + start.minutes * 60 + start.seconds;
        int stopSeconds = stop.hours * 3600 + stop.minutes * 60 + stop.seconds;

        int diffSeconds = Math.abs(stopSeconds - startSeconds);

        int hours = diffSeconds / 3600;
        int remainingSeconds = diffSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        return new Main(hours, minutes, seconds);
    }
}