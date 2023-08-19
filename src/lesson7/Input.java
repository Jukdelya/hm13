package lesson7;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = scanner.nextInt();
        System.out.println("вы ввели "+i);
    }
}
