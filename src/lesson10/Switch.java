package lesson10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        switch (age){
            case 1 :
                System.out.println("Ты младенец");
                break;
            case 5 :
                System.out.println("Пошел в дедсад");
                break;
            case 7 :
                System.out.println("Пошел в школу");
                break;
            case 20 :
                System.out.println("Работаешь в макдональц");
                break;
            case 80 :
                System.out.println("Умер");
                break;
        }
    }
}