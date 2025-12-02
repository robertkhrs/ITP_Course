package Lab_12.Exercise_1;

public class Main {
    public static void main(String[] args) {

        // Generic
        System.out.println(" - Generic - ");
        Library<Book> bookLib = new Library<>();
        bookLib.addMedia(new Book("Harry Potter"));
        System.out.println(bookLib.getMedia(0));

        // Non-generic
        System.out.println("\n - Non-Generic - ");
        Library<Video> videoLib = new Library<>();
        videoLib.addMedia(new Video("Matrix"));
        System.out.println(videoLib.getMedia(0));

    }
}