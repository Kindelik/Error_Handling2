/**Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
        Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
        метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.*/
/*
package org.example;

public class Task3 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}

        };
    }
    public static int sum(int[][] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

            }
        }
        return result;
    }
}*/
/**
    public static int sumOf2DArray(int [][] a) {
        int result = 0;
        for (int[] internal : a) {
            if (internal.length != a.length) {
                throw new RuntimeException("Array is not square");
            }
            for (int val : internal) {
                if (val != 0 && val != 1) {
                    throw new RuntimeException("Bad value");
                }
                result += val;
            }
        }
        return result;
    }*/
