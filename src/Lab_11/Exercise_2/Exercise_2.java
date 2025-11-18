package Lab_11.Exercise_2;
import java.io.*;

public class Exercise_2 {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("/Users/robertkharisov/IdeaProjects/Lab Assignments/src/Lab_11/Exercise_2/input.txt");
             FileOutputStream output = new FileOutputStream("/Users/robertkharisov/IdeaProjects/Lab Assignments/src/Lab_11/Exercise_2/output.txt")) {
            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }

            System.out.println("File was successfully written");

        } catch (FileNotFoundException e) {
            System.err.println("File access error: File not found or no write permission.");
            System.err.println("Details: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Input/output error: " + e.getMessage());
        }
    }
}