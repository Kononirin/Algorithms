import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    /**
     * 6. Напишите алгоритм AreNumbersEqual, который принимает на вход
     * 2 любых int числа, и возвращает:
     * 0, если числа равны
     * -1, если первое число меньше второго
     * 1, если первое число больше второго
     *
     * Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     * Expected result: 1
     */

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathEquals() {

        int one = 89;
        int two = 89;

        int expectedResult = 0;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(2)
    @Test
    public void testAreNumbersHappyPathFirstMore() {

        int one = 89;
        int two = -89;

        int expectedResult = 1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(2)
    @Test
    public void testAreNumbersHappyPathSecondMore() {

        int one = -89;
        int two = 89;

        int expectedResult = -1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(3)
    @Test
    public void testAreNumbersHappyPathTwoZero() {

        int one = 0;
        int two = 0;

        int expectedResult = 0;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(4)
    @Test
    public void testAreNumbersHappyPathFirstZeroSecondPositive() {

        int one = 0;
        int two = 89;

        int expectedResult = -1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(5)
    @Test
    public void testAreNumbersHappyPathFirstZeroSecondNegative() {

        int one = 0;
        int two = -89;

        int expectedResult = 1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(6)
    @Test
    public void testAreNumbersHappyPathFirstPositiveSecondZero() {

        int one = 89;
        int two = 0;

        int expectedResult = 1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(7)
    @Test
    public void testAreNumbersHappyPathFirstNegativeSecondZero() {

        int one = -89;
        int two = 0;

        int expectedResult = -1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(8)
    @Test
    public void testAreNumbersHappyPathFirstMinValueSecondMaxValue() {

        int one = Integer.MIN_VALUE;
        int two = Integer.MAX_VALUE;

        int expectedResult = -1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(9)
    @Test
    public void testAreNumbersHappyPathFirstMaxValueSecondMinValue() {

        int one = Integer.MAX_VALUE;
        int two = Integer.MIN_VALUE;

        int expectedResult = 1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(10)
    @Test
    public void testAreNumbersHappyPathFirstMinValueSecondMinValue() {

        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;

        int expectedResult = 0;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(11)
    @Test
    public void testAreNumbersHappyPathFirstMaxValueSecondMaxValue() {

        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;

        int expectedResult = 0;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }

    @Order(12)
    @Test
    public void testAreNumbersHappyPathFirstMoreMaxValueSecondMaxValue() {

        int one = Integer.MAX_VALUE + 1;
        int two = Integer.MAX_VALUE;

        int expectedResult = 1;

        AreNumbersEqual areNumEquals = new AreNumbersEqual();

        Assertions.assertEquals(expectedResult,
                areNumEquals.AreNumbersEqual(one,two)
        );
    }
}
