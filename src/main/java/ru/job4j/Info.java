package ru.job4j;
import java.util.Scanner;

public class Info {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int value;
         do{
            System.out.println("write 5");
            value = scanner.nextInt();
        } while(value!=5);

        System.out.println("u wrote 5");
    }
}
