package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class lesson4_1 {
            public static void main(String[] args) {
            LinkedList<String> inputLinkedList = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            String srtFromCons;
            System.out.println("Введите значение для строки.\nДля выхода используйте 'print'");

            while (!(srtFromCons = scanner.nextLine()).equals("print"))
                inputLinkedList.addFirst(srtFromCons);
            scanner.close();
            System.out.println("Получился перевёрнутый LinkedList: " + inputLinkedList.toString());

        }
}
