import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    /**
     * 4. Напишите алгоритм BiggerValue, который из двух параметров
     * типа int возвращает бОльшее значение.
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    @Order(1)
    @Test
    public void testBiggerValueHappyPathPositive() {

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegative() {

        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathEqualsNums() {

        int a = 3333;
        int b = 3333;
        int expectedResult = 3333;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathTwoZeros() {

        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(4)
    @Test
    public void testBiggerValueHappyPathZeroAndPositive() {

        int a = 98645;
        int b = 0;
        int expectedResult = 98645;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(5)
    @Test
    public void testBiggerValueHappyPathZeroAndNegative() {

        int a = 0;
        int b = -65894;
        int expectedResult = 0;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(6)
    @Test
    public void testBiggerValueHappyPathFirstNegativeSecondPositive() {

        int a = -65894;
        int b = 652;
        int expectedResult = 652;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(7)
    @Test
    public void testBiggerValueHappyPathFirstPositiveSecondNegative() {

        int a = 652;
        int b = -65894;
        int expectedResult = 652;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(8)
    @Test
    public void testBiggerValueFirstMoreMaxValueSecondPositive() {

        int a = 2147483647 + 1;
        int b = 652;
        int expectedResult = 2147483647;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(9)
    @Test
    public void testBiggerValueFirstMoreMaxValueSecondNegative() {

        int a = 2147483647 + 1;
        int b = -652;
        int expectedResult = 2147483647;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(10)
    @Test
    public void testBiggerValueFirstLessMinValueSecondPositive() {

        int a = -2147483647 - 1;
        int b = 652;
        int expectedResult = 2147483647;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }

    @Order(11)
    @Test
    public void testBiggerValueFirstLessMinValueSecondNegative() {

        int a = -2147483647 - 1;
        int b = -652;
        int expectedResult = 2147483647;

        BiggerValue bigVal = new BiggerValue();

        Assertions.assertEquals(expectedResult, bigVal.biggerValue(a, b));
    }



}
