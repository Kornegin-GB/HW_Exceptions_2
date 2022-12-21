package HW_Exceptions_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String text = scann.nextLine();
        if (text.isEmpty()) {
            throw new RuntimeException("Вводить пустые строки нельзя");
        }
        System.out.println(text);
        scann.close();
    }
}
