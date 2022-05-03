public class IsPositiveNumber {

    /**
     * 5. Напишите алгоритм IsPositiveNumber, который возвращает true,
     * если численный  параметр больше или равен нулю, и возвращает false,
     * если параметр меньше 0.
     * Проверьте работу метода на числах 555, 0 и -555.
     */

    public boolean isPositiveNumber(int number) {

        if (number < 0) {

            return false;
        } else {

            return true;
        }
    }

    public boolean isPositiveNumber(double number) {

        if (number < 0) {

            return false;
        } else {

            return true;
        }
    }

    public boolean isPositiveNumTernatnyiOperator(int number) {

        return number >= 0 ? true : false;
    }

    public boolean isPositiveNumSuper(int number) {

        return number >= 0;
    }

    //тернарный оператор
    // num1>=num2 ? num1 : num2;
}
