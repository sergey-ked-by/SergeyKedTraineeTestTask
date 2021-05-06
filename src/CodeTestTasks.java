import java.util.Random;
import java.util.Scanner;

public class CodeTestTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.print("Enter the number of the algorithm from 1 to 3 or 0 to exit: ");
            int selectedAlgorithm = scanner.nextInt();
            switch (selectedAlgorithm) {
                case 0:
                    condition = false;
                    break;
                case 1:
                    compareEnteredNumber();
                    break;
                case 2:
                    compareEnteredName();
                    break;
                case 3:
                    System.out.print("Enter the required array length: ");
                    int arrayLength = scanner.nextInt();
                    checkForMultiplicity(arrayLength);
                    break;
                default:
                    System.out.println("Wrong choice!!!");
                    break;
            }
        }
    }


    public static void compareEnteredNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int enteredNumber = scanner.nextInt();
        if (enteredNumber > 7) {
            System.out.println("Hello!!!");
        }
    }

    public static void compareEnteredName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String enteredName = scanner.nextLine();
        if (enteredName.equals("Vyacheslav")) {
            System.out.println("Hello  " + enteredName + "!");
        } else {
            System.out.println("There is no such name.");
        }
    }

    public static void checkForMultiplicity(int arrayLength) {
        int[] arrayOfNumbers = new int[arrayLength];
        Random random = new Random();
        int counter = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
            System.out.print(arrayOfNumbers[i] + " ");
            if (arrayOfNumbers[i] % 3 == 0) {
                counter++;
            }
        }

        System.out.println("\nThe quantity of numbers that are multiples of 3: " + counter + ".");
    }
}