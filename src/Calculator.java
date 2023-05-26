import java.util.Scanner;

public class Calculator {
    public static void functional() {
        boolean infinity = true;
        while (infinity) {
            System.out.println("Добро пожаловать в мой калькулятор!");
            System.out.println("Выберите дальнейшие действия");
            System.out.println("1. Сумма\n2. Вычитание\n3. Уможение\n4. Деление\n5. Выход");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();


            if (choice == 1) {
                System.out.println("Вы выбрали функционал сложения");
            } else if (choice == 2) {
                System.out.println("Вы выбрали функционал вычитания");
            } else if (choice == 3) {
                System.out.println("Вы выбрали функционал умножения");
            } else if (choice == 4) {
                System.out.println("Вы выбрали функционал деления");
            } else if (choice == 5) {
                infinity = false;
                System.out.println("Вы выбрали выход из программы, удачно Вам дня и до скорых встреч");
                System.exit(0);
            } else {
                System.out.println("Вы выбрали неверное значение, просьба повторить операцию");
                functional();

            }

            System.out.println("Введите 2 числа");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("----------------");
                    System.out.println("Результат Вашего сложения составляет = " + summa(a, b));
                    System.out.println("----------------");
                    break;
                case 2:
                    System.out.println("----------------");
                    System.out.println("Результат Вашего вычитания составляет = " + subtraction(a, b));
                    System.out.println("----------------");
                    break;
                case 3:
                    System.out.println("----------------");
                    System.out.println("Результат Вашего умножения составляет = " + multiplication(a, b));
                    System.out.println("----------------");
                    break;
                case 4:

                    if (division(a, b) == 0) {
                        System.out.println("----------------");
                        System.out.println("Деление на ноль невозможно");
                        System.out.println("----------------");
                    } else {
                        System.out.println("----------------");
                        System.out.println("Результат Вашего деления составляет = " + division(a, b));
                        System.out.println("----------------");
                    }
                    break;
            }
        }
    }


    public static int summa(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Вы попытались поделить на ноль");
        }
        return result;
    }
}