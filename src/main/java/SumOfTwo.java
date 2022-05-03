import java.util.Arrays;

public class SumOfTwo {

    /**
     * 14.	Написать алгоритм SumOfTwo, который принимает на вход
     * массив целых чисел, и число n. Алгоритм  возвращает
     * пары элементов, которые в сумме дают число n.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

    public int[][] sumOfTwoAlgoritm2(int[] a, int sum) {

        if (a.length > 0) {


            int[] b = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }

            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (sum == (a[i] + a[j])) {
                        count++;
                        a[i] = -2147483648;
                    }
                }
            }

            int[][] result = new int[count][2];

            count = 0;
            for (int i = 0; i < b.length; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (sum == b[i] + b[j]) {
                        result[count][0] = b[i];
                        result[count][1] = b[j];
                        count++;
                        b[i] = -2147483648;
                    }
                }
            }

            return result;
        }

        return new int[][]{};
    }

    //разбор решения другого ученика
    public static int[][] sumOfTwoAlgoritm1(int[] a, int sum) {

        if (a.length > 0) {

            //объявляем и инициализируем новый массив с такой же
            //длиной как у пришедшего массива
            int[] b = new int[a.length];

            //начинаем цикл от первого элемента до последнего
            //в новый массив записываем значения пришедшего массива
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            //объявили и инициализировали счетчик каунт, он будет считать
            //сколько пар, дающих сумму числа сам, есть в массиве а
            int count = 0;
            //начинаем цикл по массиву а от первого элемента до последнего
            for (int i = 0; i < a.length; i++) {
                //начинаем цикл по массиву а от второго элемента до последнего
                for (int j = i + 1; j < a.length; j++) {
                    //если число сам равно сумме первого и второго элемента
                    //увеличиваем счетчик и присваиваем первому элементу
                    //значение минимального интеджера
                    if (sum == (a[i] + a[j])) {
                        count++;
                        a[i] = -2147483648;
                    }
                }
            }

            //создали новый двумернй массив, в первом случае длина будет
            //равно счетчику, а во втором двум (эту длину понимаем из условия)
            int[][] result = new int[count][2];

            //обнуляем счетчик
            count = 0;
            //начинаем цикл по массиву б от первого элемена до конца длины
            for (int i = 0; i < b.length; i++) {
                //начинаем цикл по массиву б от второго элемента до конца длины
                for (int j = i + 1; j < b.length; j++) {
                    //если сумма соседних элементов равна числу сам
                    //записываем эти элементы в двумерный массив в первую секцию
                    //счетчик при этом увеличичваем а в первому элементу
                    // присваиваем значение минимального интереджера
                    //минимальный интеджер используем, чтобы при следующем
                    //прохождении внутреннего цикла снова не использовалось
                    //число, которое мы уже обнаружили
                    if (sum == b[i] + b[j]) {
                        result[count][0] = b[i];
                        result[count][1] = b[j];
                        count++;
                        b[i] = -2147483648;
                    }
                }
            }

            //возвращаем получившийся двумерный массив
            return result;
        }

        return new int[][]{};
    }

    //решение другого ученика
    public int[][] sumOfTwoAlgoritm(int[] a, int sum) {

        if (a.length > 0) {

            int[] b = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (sum == (a[i] + a[j])) {
                        count++;
                        a[i] = -2147483648;
                    }
                }
            }

            int[][] result = new int[count][2];

            count = 0;
            for (int i = 0; i < b.length; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (sum == b[i] + b[j]) {
                        result[count][0] = b[i];
                        result[count][1] = b[j];
                        count++;
                        b[i] = -2147483648;
                    }
                }
            }

            return result;
        }

        return new int[][]{};
    }

    public static void main(String[] args) {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] array1 = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] array2 = {-4, 3, 7, -12, -5, 2, -9, 4, 12};
        // 9
        System.out.println(Arrays.deepToString(sumOfTwoAlgoritm1(array,12)));
        System.out.println(Arrays.deepToString(sumOfTwoAlgoritm1(array1,-12)));
        System.out.println(Arrays.deepToString(sumOfTwoAlgoritm1(array2,12)));
        System.out.println(Arrays.deepToString(sumOfTwoAlgoritm1(array,0)));
        //System.out.println(sumOfTwoAlgoritm1(array1,-3));

    }
}
