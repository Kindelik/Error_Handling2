/**
 * Задание 2
 * try {
 * int d = 0;
 * double catchedRes1 = intArray[8] / d;
 * System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 * System.out.println("Catching exception: " + e);
 * }
 */

package HomeWork2;

import java.util.Random;

public class Task2 {

    Random r = new Random();

    public static void main(String[] args) {

        int[] intArray = intArr();
            try {
               int d = 0;  //Далее следует деление ??? И надо ли убирать это число вообще?
                double catchedRes1 = (double) intArray[8] / d;     // Почему имеено 8?
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.err.println("Catching exception: " + e);
            }catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Выход за предел массива: " + e);
            }
    }

    public static int[] intArr() {
        Random r = new Random();
        int[] intArray = new int[r.nextInt(1,15)];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = r.nextInt(1, 100);   // просто чтобы не было гиганских чисел
        }
        return intArray;
    }
}
// Не понял что имеено надо исправить, но теперь он коректно выводит исключение и при надобности его можно обработать