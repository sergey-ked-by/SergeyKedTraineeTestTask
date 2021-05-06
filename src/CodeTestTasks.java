import java.util.Random;
import java.util.Scanner;

public class CodeTestTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.print("Введите номер алгоритма проверяемого алгоритма от 1 до 3 или 0 для выхода: ");
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
                    System.out.print("Введите требуемую длину массива: ");
                    int arrayLength = scanner.nextInt();
                    checkForMultiplicity(arrayLength);
                    break;
                default:
                    System.out.println("Неправильный выбор!!!");
                    break;
            }
        }
    }


    public static void compareEnteredNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int enteredNumber = scanner.nextInt();
        if (enteredNumber > 7) {
            System.out.println("Hello!!!");
        }
    }

    public static void compareEnteredName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String enteredName = scanner.nextLine();
        if (enteredName.equals("Вячеслав")) {
            System.out.println("Привет, " + enteredName + "!");
        } else {
            System.out.println("Нет такого имени.");
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

        System.out.println("\nКолличество чисел, кратное трём: " + counter + ".");
    }
}