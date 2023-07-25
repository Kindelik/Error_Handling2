/** Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
         Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
         1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
         2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
         3. если вместо массива пришел null, метод вернет -3
         4.Напишите метод, в котором реализуйте взаимодействие с пользователем.
         То есть, этот метод запросит искомое число у пользователя, вызовет первый,
         обработает возвращенное значение и покажет читаемый результат пользователю.
         Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.*/

package org.example;


import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random r = new Random();
        int randValue = r.nextInt();
        int[] arr = new int[randValue];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        System.out.println(getArrElement(arr,10,10));
    }

    public static int getArrElement(int[] array, int value, int target){
        if(array == null) return -3;
        if(array.length < value) return -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target) return i;
        }
        return -2;

    }

}
