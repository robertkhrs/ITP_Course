package Lab_11.Exercise_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("/Users/robertkharisov/IdeaProjects/Lab Assignments/src/Lab_11/Exercise_3/input.txt"));
             PrintWriter writer = new PrintWriter("/Users/robertkharisov/IdeaProjects/Lab Assignments/src/Lab_11/Exercise_3/output.txt")) {

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = num1 / num2;

            writer.print(result);

        } catch (FileNotFoundException e) {
            System.err.println("Error: File 'input.txt' didn't find.");

        } catch (InputMismatchException e) {
            System.err.println("Error: File contains a non-integer value.");

        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero");

        } catch (NoSuchElementException e) {
            System.err.println("Error: There are not enough numbers in the file to perform the division.");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}