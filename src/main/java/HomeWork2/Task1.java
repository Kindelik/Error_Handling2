/**     Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

package HomeWork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
     String input = inputUser();
     boolean flag = inputCheck(input);
     while (!flag){
         input = inputUser();
         flag = inputCheck(input);
     }
     System.out.println(Float.parseFloat(input));
        System.out.println("Ты смог :) ");
    }

    public static String inputUser(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число с десятичной дробью (Пример ввода 11.3)\n =>");
        String input = sc.next();
        return input;
    }

    public static boolean inputCheck(String input) throws Exception {
        try {
            Float inputF = Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            System.err.println("Неверный ввод");
            return false;
        }

    }
}
