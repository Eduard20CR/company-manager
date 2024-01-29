package calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Caculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        runCalculator();
    }

    public static void runCalculator() {
        while (true) {
            printStartMessage();
            int menuChoice = sc.nextInt();

            switch (menuChoice) {
                case 1:
                    float[] sumNumbers = getNumbers();
                    add(sumNumbers[0], sumNumbers[1]);
                    break;
                case 2:
                    float[] substractNumbers = getNumbers();
                    substract(substractNumbers[0], substractNumbers[1]);
                    break;
                case 3:
                    float[] multiplyNumbers = getNumbers();
                    multiply(multiplyNumbers[0], multiplyNumbers[1]);
                    break;
                case 4:
                    float[] divisionNumbers = getNumbers();
                    divide(divisionNumbers[0], divisionNumbers[1]);
                    break;
                case 5:
                    float[] powerNumbers = getNumbers();
                    power(powerNumbers[0], powerNumbers[1]);
                    break;
                default:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
            }
            System.out.println("Waiting...");
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Repeat...");
        }
    }

    public static void printStartMessage() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        System.out.println("Welcome to Calculator!");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Power");
        System.out.println("6) Exit");
    }

    public static float[] getNumbers() {
        System.out.println("Enter first number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();
        return new float[] { num1, num2 };
    }

    public static void add(float a, float b) {
        System.out.println(a + b);
    }

    public static void substract(float a, float b) {
        System.out.println(a - b);
    }

    public static void multiply(float a, float b) {
        System.out.println(a * b);
    }

    public static void divide(float a, float b) {
        System.out.println(a / b);
    }

    public static void power(float a, float b) {
        System.out.println(a + " to the power of " + b + " is:");
        float result = a;
        for (int i = 0; i < b - 1; i++) {
            result *= a;
        }
        System.out.println(result);
    }
}
