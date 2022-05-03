import java.util.Arrays;

public class Utils {

    //сюда складываем переменные и методы, которые не имеют отношения
    // к бизнес-логике

    //* со звездочкой метод - с return, без звездочки - с void

    //метод для печати разделительной строки printLine
    //метод для печати пустой строки printNewLine
    //метод для печати номера задачи task
    //метод проверки массива не пустой ли он checkForEmptyArray *
    //метод для печати массива printArray
    //метод для вычисления среднего значения элементов массива averageArray*
    //метод вычисления минимального значения в массиве minValue*
    //метод вычисления максимального значения в массиве maxValue*
    //метод определения длины массива lengthArray*
    //метод проверки, что числа в массиве положительные checkPositiveNumbers*
    //метод-тест на то, что два значения равны между собой*
    //метод-тест на то, что два массива равны между собой*
    //метод печатает строку "Array is empty" printArrayIsEmpty
    //метод возвращает кол-во четных элементов в массиве countEvenElements*
    //метод возвращает кол-во нечетных элементов в массиве countOddElements*
    //м. возвращает булевый массив, если элемент больше числа,
    // то значение истинно isElementMoreDigit*
    //м. возвращает булевый массив, если элемент меньше числа,
    // то значение истинно isElementLessDigit*
    //метод возвращает массив из четных элементов arrayEvenNumbers*
    //метод возвращает массив из нечетных элементов arrayOddNumbers*
    //метод возвращает четный массив, если четных элементов больше и
    //наоборот нечетный, если равны - то пустой массив arrayEvenOrOdd*
    // метод возвращает рандомное число в указанных границах
    // включительно randomNumInclusive*
    //метод возвращает массив рандомных чисел, при указании длины массива
    // и границ рандомного промежутка включительно arrayRandomInclusive*
    //метод печатает минимум, максимум и среднее число массива numMinMaxAverage


    public static void printLine() {
        System.out.println("-------------");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    //метод для печати номера задачи

    public static void task(int number) {

        System.out.println("\n" + "\n===============\n" + "Task "
                + number + "\n===============\n");
    }

    //метод проверки массива не пустой ли он

    public static boolean checkForEmptyArray(int[] array) {

        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkForEmptyArray(String[] array) {

        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkForEmptyArray(double[] array) {

        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkForEmptyArray(boolean[] array) {

        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    //метод для печати массива

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(boolean[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //метод для вычисления среднего значения элементов массива

    public static double averageArray(int[] array) {

        double sumOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }

        return sumOfElements / array.length;
    }

    public static double averageArray(double[] array) {

        double sumOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }

        return sumOfElements / array.length;
    }

    //метод вычисления минимального значения в массиве

    public static int minValue(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static double minValue(double[] array) {

        double min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;

    }

    //метод вычисления максимального значения в массиве

    public static int maxValue(int[] array) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static double maxValue(double[] array) {

        double max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;

    }

    //метод определения длины массива

    public static int lengthArray(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }

    public static int lengthArray(double[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }

    public static int lengthArray(boolean[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }

    public static int lengthArray(String[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }

    //метод на проверку, что числа в массиве положительные

    public static boolean checkPositiveNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkPositiveNumbers(double[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0.0) {
                return false;
            }
        }

        return true;
    }

    //метод-тест на то, что два значения равны между собой

    public static String verifyTwoValue(int actualResult, int expectedResult) {

        if (actualResult == expectedResult) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";

        } else return "\u001B[31m" + "Fail" + "\u001B[0m";
    }

    public static String verifyTwoValue(double actualResult,
                                        double expectedResult) {

        if (actualResult == expectedResult) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";

        } else return "\u001B[31m" + "Fail" + "\u001B[0m";
    }

    public static String verifyTwoValue(String actualResult,
                                        String expectedResult) {

        if (actualResult.equals(expectedResult)) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";

        } else return "\u001B[31m" + "Fail" + "\u001B[0m";
    }

    public static String verifyTwoValue(boolean actualResult,
                                        boolean expectedResult) {

        if (actualResult == expectedResult) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";

        } else return "\u001B[31m" + "Fail" + "\u001B[0m";
    }

    //метод-тест на то, что два массива равны между собой

    public static String verifyTwoArrays(int[] actualResult,
                                         int[] expectedResult) {

        if (Arrays.equals(actualResult, expectedResult)) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";

        } else return "\u001B[31m" + "Fail" + "\u001B[0m";

    }

    public static String verifyTwoArrays(double[] actualResult,
                                         double[] expectedResult) {

        if (Arrays.equals(actualResult, expectedResult)) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";

        } else return "\u001B[31m" + "Fail" + "\u001B[0m";

    }

    public static String verifyTwoArrays(boolean[] actualResult,
                                         boolean[] expectedResult) {

        if (Arrays.equals(actualResult, expectedResult)) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";

        } else return "\u001B[31m" + "Fail" + "\u001B[0m";

    }

    public static String verifyTwoArrays(String[] actualResult,
                                         String[] expectedResult) {

        if (Arrays.equals(actualResult, expectedResult)) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";

        } else return "\u001B[31m" + "Fail" + "\u001B[0m";

    }

    public static void printArrayIsEmpty() {
        System.out.println("Array is empty");
    }

    public static int countEvenElements(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static double countEvenElements(double[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countOddElements(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static double countOddElements(double[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static boolean[] isElementMoreDigit(int[] array, int digit) {

        boolean[] isElementMoreDigit = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            isElementMoreDigit[i] = (array[i] > digit);
        }

        return isElementMoreDigit;
    }

    public static boolean[] isElementLessDigit(int[] array, int digit) {

        boolean[] isElementLessDigit = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            isElementLessDigit[i] = (array[i] < digit);
        }

        return isElementLessDigit;
    }

    public static int[] arrayEvenNumbers(int[] array) {

        int[] arrayEven = new int[countEvenElements(array)];

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[number] = array[i];
                number++;
            }
        }

        return arrayEven;
    }

    public static int[] arrayOddNumbers(int[] array) {

        int[] arrayOdd = new int[countOddElements(array)];

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayOdd[number] = array[i];
                number++;
            }
        }

        return arrayOdd;
    }

    public static int[] arrayEvenOrOdd(int[] array) {

        int countEven = countEvenElements(array);
        int countOdd = countOddElements(array);

        if (countEven == countOdd) {

            return new int[]{};
        } else if (countEven < countOdd) {

            return arrayOddNumbers(array);
        } else

            return arrayEvenNumbers(array);
    }

    public static int randomNumInclusive(int upper, int lower) {

        return (int) (Math.random() * (upper - lower + 1)) + lower;
    }

    public static int[] arrayRandomInclusive(int length, int upper, int lower) {

        int[] randomArr = new int[length];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = randomNumInclusive(upper, lower);
        }

        return randomArr;
    }

    public static void numMinMaxAverage(int[] array) {

        int min = minValue(array);

        int max = maxValue(array);

        double average = averageArray(array);

        System.out.println("min = " + min + ", max = " + max
                + ", average = " + average);
    }

    public static void numMinMaxAverage(double[] array) {

        double min = minValue(array);

        double max = maxValue(array);

        double average = averageArray(array);

        System.out.println("min = " + min + ", max = " + max
                + ", average = " + average);
    }
}
