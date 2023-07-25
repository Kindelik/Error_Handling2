/**
 * Создайте boolean метод, который запросит у пользователя поля: login, password и confirm password
 * Логин должен содержать только символы: a, b, c, d, e, 0,1, _, если это не так нужно бросить RuntimeException с соответствующим сообщением.
 * Логин должен быть не меньше 4 и не больше 8 символов, если это не так нужно бросить RuntimeException с соответствующим сообщением.
 * Пароль должен быть не меньше 4 и не больше 8 символов и состоять только из цифр, если это не так нужно бросить RuntimeException с соответствующим сообщением.
 * Пароль и его повтор должны совпадать, если это не так нужно бросить RuntimeException с соответствующим сообщением.
 */

package org.example;

public class Task5 {

    /**
     if (!login.matches("[abcde01_]{4,8}")) {
     throw new RuntimeException("Login should contain only a, b, c, d, e, 0, 1, _");
     }
     if (!password.matches("[0-9]+")) {
     throw new RuntimeException("Password should contain only digits");
     }
     */
    public static void main(String[] args) {
        String s = "qwerty";
    int n;
    n = Integer.getInteger(s);
    }
}