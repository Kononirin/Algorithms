public class OddEven {

    /**
     * 1. Создать алгоритм OddEven, который принимает на вход целое число,
     * возвращает “Odd”, если число нечетное, и “Even”, если число четное.
     * Во всех остальных случаях результат будет “Undefined”.
     *
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     * 2147483647 + 1 →  “Undefined”
     */

//    public String OddEven(long number) {
//
//        if (number > -2147483648 && number < 2147483647) {
//            if (number % 2 != 0) {
//
//                return "Odd";
//            } else if (number % 2 == 0){
//
//                return "Even";
//            }
//        }
//
//        return "Undefined";
//    }

    public String OddEven(long number) {

        if (number > Integer.MIN_VALUE && number < Integer.MAX_VALUE) {
            if (number % 2 != 0) {

                return "Odd";
            } else if (number % 2 == 0){

                return "Even";
            }
        }

        return "Undefined";
    }
}
