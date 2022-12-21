package HW_Exceptions_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        boolean run = true;
        Float number = 0.0f;
        Scanner scannner;
        System.out.println("Введите дробное число. Числа должны быть разделены запятой");
        while (run) {
            scannner = new Scanner(System.in);
            if (scannner.hasNextFloat()) {
                number = scannner.nextFloat();
                System.out.printf("Вы ввели: %s", number);
                run = false;
                scannner.close();
            } else {
                System.out.println("Введено не дробное число или два числа разделены не запятой");
            }
        }
    }
}
