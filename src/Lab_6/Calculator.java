package Lab_6;

import java.util.Scanner;
public class Calculator {
     static void main(String[] args) {
        int num1, num2, result;
        String operation;
        String line;
        Scanner input = new Scanner(System.in);
        line = input.nextLine();
        num1 = Integer.parseInt(line.split(" ")[0]);
        operation = line.split(" ")[1];
        num2 = Integer.parseInt(line.split(" ")[2]);
        if (operation.equals("+")) {
            result = num1 + num2;
            System.out.println(result);
        }
        if (operation.equals("-")) {
            result = num1 - num2;
            System.out.println(result);
        }
        if (operation.equals("*")) {
            result = num1 * num2;
            System.out.println(result);
        }
        if (operation.equals("/")) {
            if (num2 == 0) {
                System.out.println("Fool, u can't divide by zero");
                return;
            }
            result = num1 / num2;
            System.out.println(result);
        }



    }
}