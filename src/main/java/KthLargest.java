import java.util.Arrays;

public class KthLargest {

    /**
     * 13. Написать алгоритм KthLargest, который принимает на вход
     * массив целых чисел и число k, и возвращает k-тый максимальный элемент.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
     * (12 и 12 - первый и второй самые большие элементы)
     */

    public int kthLargestAlgorithm2(int[] array, int k) {

        if (k > 0 && k <= array.length && array.length != 0) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int count = array[i];
                        array[i] = array[j];
                        array[j] = count;
                    }
                }
            }
            return array[k - 1];
        }

        return Integer.MIN_VALUE;
    }

    //мое решение отредактированное
    public static int kthLargestAlgorithm1(int[] array, int k) {
        //int result = 0;
        //int[] sorted; // объявили новый массив, который будем сортировать

        //если число к меньше нуля и больше либо равно длине массива
        //возвращаем минимальное значение интеджера, и если длина массива
        //равна нулю тоже возвращаем минимальное значение интеджера
        if (k > 0 && k <= array.length && array.length != 0) {

            //начинаем цикл от первого элемента массива до длины массива
            //увеличивая значение индекса с каждой итерацией на единицу
            for (int i = 0; i < array.length; i++) {
                //начинаем цикл от второго элемента массива до
                //длины массива и увеличиваем значение индекса
                //на единицу с каждой итерацией
                for (int j = i + 1; j < array.length; j++) {
                    //производим сортировку массива от меньшего элемента
                    // к большему
                    if (array[i] < array[j]) {
                        int count = array[i];
                        array[i] = array[j];
                        array[j] = count;
                    }
                }
            }
            //возвращаем элемент массива с индексом к-1
            return array[k - 1];
        }

        return Integer.MIN_VALUE;
    }

    public int kthLargest(int[] a, int k) {

        for (int bypass = 0; bypass < a.length - 1; bypass++) { //sorting
            boolean already_sorted = true;

            for (int i = 0; i < a.length - 1 - bypass; i++) {
                if (a[i] > a[i + 1]) {
                    int tempSort = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tempSort;
                    already_sorted = false;
                }
            }
            if (already_sorted) {
                break;
            }
        }
        ;
        return a[a.length - k];
    }

    //решение другого ученика
    public int kthLargestAlgorithm(int[] array, int k) {
        int result = 0;
        int[] sorted;

        if (k > 0 && k <= array.length) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    int count;

                    if (array[i] < array[j]) {
                        count = array[i];
                        array[i] = array[j];
                        array[j] = count;
                    }
                }
            }
            sorted = array;

            return sorted[k - 1];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] array1 = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] array2 = {-4, 3, 7, -12, -5, 2, -9, 4, 12};
        // 9
        System.out.println(kthLargestAlgorithm1(array,3));
        System.out.println(kthLargestAlgorithm1(array1,3));
        System.out.println(kthLargestAlgorithm1(array2,3));
        System.out.println(kthLargestAlgorithm1(array,0));
        System.out.println(kthLargestAlgorithm1(array1,-3));


    }
}
