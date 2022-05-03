import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    /**
     * 5. Напишите алгоритм IsPositiveNumber, который возвращает true,
     * если численный  параметр больше или равен нулю, и возвращает false,
     * если параметр меньше 0.
     * Проверьте работу метода на числах 555, 0 и -555.
     */

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathIntPositive() {

        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathIntNegative() {

        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathIntZero() {

        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(4)
    @Test
    public void testIsPositiveNumberHappyPathDoublePositive() {

        double number = 23.2;
        boolean expectedResult = true;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(5)
    @Test
    public void testIsPositiveNumberHappyPathDoubleNegative() {

        double number = -23.2;
        boolean expectedResult = false;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(6)
    @Test
    public void testIsPositiveNumberHappyPathDoubleZero() {

        double number = 0.0;
        boolean expectedResult = true;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(7)
    @Test
    public void testIsPositiveNumberHappyPathIntMaxValue() {

        int number = Integer.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(8)
    @Test
    public void testIsPositiveNumberHappyPathIntMinValue() {

        int number = Integer.MIN_VALUE;
        boolean expectedResult = false;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(9)
    @Test
    public void testIsPositiveNumberHappyPathDoubleMaxValue() {

        double number = Double.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(10)
    @Test
    public void testIsPositiveNumberHappyPathDoubleMinValue() {

        double number = Double.MIN_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(11)
    @Test
    public void testIsPositiveNumberNumMoreIntMaxValue() {

        int number = 2147483647 + 1;
        boolean expectedResult = true;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }

    @Order(12)
    @Test
    public void testIsPositiveNumberNumLessIntMinValue() {

        int number = -2147483648 - 1;
        boolean expectedResult = false;

        IsPositiveNumber posNum = new IsPositiveNumber();

        Assertions.assertEquals(expectedResult,
                posNum.isPositiveNumber(number)
        );
    }
}
