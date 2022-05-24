import java.util.Arrays;

public class StringToNumbers {

    /**
     * Написать алгоритм StringToNumbers, который принимает строку, и
     * возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * (Без форматирования)
     */


    public int[] stringToNumbers(String str) {

        if (str != null) {
            if (!str.isEmpty()) {
                String[] arrOfStrings = str.split(", ");
                int[] arrOfNumbers = new int[arrOfStrings.length];
                for (int i = 0; i < arrOfStrings.length; i++) {
                    arrOfNumbers[i] = Integer.parseInt(arrOfStrings[i]);
                }

                return arrOfNumbers;
            }

            return new int[]{};
        }

        return new int[]{};

    }
}
