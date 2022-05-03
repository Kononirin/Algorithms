public class BiggerValue {

    /**
     * 4. Напишите алгоритм BiggerValue, который из двух параметров типа int
     * возвращает бОльшее значение.
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     * мое предположение - если числа верны возвращаем одно из чисел
     */

    public int biggerValue(int a, int b) {

        if (a < Integer.MAX_VALUE && a > Integer.MIN_VALUE) {
            if (b < Integer.MAX_VALUE && b > Integer.MIN_VALUE) {
                if (a > b) {

                    return a;
                } else {

                    return b;
                }
            }

            return Integer.MAX_VALUE;

        }

        return Integer.MAX_VALUE;
    }


//    public int BiggerValue(int a, int b) {
//
//        if (a > b) {
//
//            return a;
//        } else {
//
//            return b;
//        }
//    }


}
