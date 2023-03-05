//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        .
//
//        2. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
//        .
//
//        3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
package lesson1;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class gbhwlesson1 {
    public static void main(String[] args) {
//        int[] arr = {10, 4, 6, 12, 5, 3, - 1}; // Задача 1
//        System.out.println(findMax(arr));
//        System.out.println(findMin(arr));
//        var nums = new int[]{3, 2, 2, 3, 10, 2, 3, 3, 15, 20}; // задача 2
//       sortArray(nums);
//        System.out.println(Arrays.toString(nums));
        LocalDateTime now = LocalDateTime.now(); // Задача 3
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(now);
        System.out.println("Введите имя!");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        System.out.println("Привет, " + name);
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        }

//        private static int findMax ( int[] arr){
//            int max = arr[0];
//
//            for (int i : arr) {
//                if (i > max) {
//                    max = i;
//                }
//            }
//            return max;
//        }
//
//        private static int findMin ( int[] arr){
//            int min = arr[0];
//
//            for (int i : arr) {
//                if (i < min) {
//                    min = i;
//                }
//            }
//            return min;
//        }
//
//        private static int sortArray ( int[] arr){
//            // `start` сохраняет индекс следующей доступной позиции
//            int start = 0;
//            int val = 3;
//
//            // делаем для каждого элемента
//            for (int i : arr) {
//                // если текущий элемент отличен от нуля, поместить элемент в
//                // следующая свободная позиция в массиве
//                if (i != val) {
//                    arr[start++] = i;
//                }
//            }
//
//            // перемещаем все значения val в конец массива (оставшиеся индексы)
//            for (int i = start; i < arr.length; i++) {
//                arr[i] = val;
//            }
//            return start;
//        }
    }
}
