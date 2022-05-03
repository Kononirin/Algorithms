import java.util.Arrays;

public class PeakElement {

    /**
     * 10.	Написать алгоритм PeakElement,  который принимает на вход
     * массив целых чисел и возвращает значения пиковых элементов
     * (элементы, которые больше своих соседей).
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    public static int[] peakElement3(int[] arr) {

        int[] result = new int[]{};

        if (arr.length != 0 && arr.length != 1) {

            int countArray = 0;

            //считаем есть ли пик у первого элемента, если есть,
            //то увеличиваем каунт
            if (arr[0] > arr[1]) {
                countArray++;
            }
            //считаем есть ли пик у последнего элемента, если есть,
            //то увеличиваем каунт
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                countArray++;
            }
            //начинаем цикл со второго элемента и идем по циклу
            //до предпоследнего элемента, если у элемента есть соседи
            //больше него, то тоже увеличиваем каунт
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    countArray++;
                }
            }
            //System.out.println(countArray);

            //создаем новый массив с длиной счетчика, который
            //вычислили ранее
            result = new int[countArray];
            //обнуляем счетчик
            countArray = 0;
            //если первый элемент больше второго, то записываем его
            //в первый элемент нового массива и увеличиваем счетчик
            if (arr[0] > arr[1]) {
                result[0] = arr[0];
                countArray++;
            }
            //если последний элемент больше предпоследнего элемента
            //то записываем его значение в последний элемент нового массива
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                result[result.length - 1] = arr[arr.length - 1];
            }
            //начинаем цикл со второго элемента до предпоследнего
            //элемента и проверяем
            for (int i = 1; i < arr.length - 1; i++) {
                //если у элемента соседние элементы оба больше него,
                //то записываем его вначение в элемент с номером счетчика
                //и увеличиваем счетчик
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    result[countArray] = arr[i];
                    countArray++;
                }
            }

            return result;

        }

        return result;
    }


    //вариант Геннадия
    public int[] peakElement1(int[] arr) {

        int[] result = new int[]{};

        if (arr.length != 0 || arr != null) {

            int countArray = 0;

            if (arr[0] > arr[1]) {
                countArray++;
            }
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                countArray++;
            }

            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    countArray++;
                }
            }
            System.out.println(countArray);

            result = new int[countArray];
            countArray = 0;
            if (arr[0] > arr[1]) {
                result[0] = arr[0];
                countArray++;
            }
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                result[result.length - 1] = arr[arr.length - 1];
            }

            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    result[countArray] = arr[i];
                    countArray++;
                }
            }

        }
        return result;
    }

    //вариант Сергея
    public int[] peakElement2(int[] a) {
        int[] temp = new int[a.length];
        int newArrCounter = 0, counter;
        for (counter = 0; counter < a.length; counter++) {
            if (counter == 0) {
                if (a[counter] > a[counter + 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            } else if (counter == a.length - 1) {
                if (a[counter] > a[counter - 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            } else {
                if (a[counter] > a[counter + 1] && a[counter] > a[counter - 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            }
        }
        int[] result = new int[newArrCounter];
        for (counter = 0; counter < newArrCounter; counter++) {
            result[counter] = temp[counter];
        }
        return result;
    }


    public static void main(String[] args) {

        //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] array1 = {-3, -2, -7, -5, -1, -9, -23, -1};
        int[] array2 = {-3, 2, -7, 5, -1, 9, 23, -1};
        int[] array3 = {65, 85};
        int[] array4 = {65, 85, 74};
        int[] array5 = {65};

        System.out.println(Arrays.toString(peakElement3(array)));
        System.out.println(Arrays.toString(peakElement3(array1)));
        System.out.println(Arrays.toString(peakElement3(array2)));
        System.out.println(Arrays.toString(peakElement3(array3)));
        System.out.println(Arrays.toString(peakElement3(array4)));
        System.out.println(Arrays.toString(peakElement3(array5)));


    }
}
