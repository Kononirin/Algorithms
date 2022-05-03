import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntegerMTest {

    /**
     * 7. Given an integer M perform the following conditional actions:
     * If M is multiple of 3 and 5 then return "Good Number".
     * If M is only multiple of 3 and not of 5 then return "Bad Number"
     * If M is only multiple of 5 and not of 3 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     */

    @Order(1)
    @Test
    public void testIntegerMHappyPathMultipleOf3And5() {
        Integer m = 15;

        String expectedResult = "Good Number";

        IntegerM intM = new IntegerM();

        Assertions.assertEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(2)
    @Test
    public void testIntegerMHappyPathMultipleOf3() {
        Integer m = 9;

        String expectedResult = "Bad Number";

        IntegerM intM = new IntegerM();

        Assertions.assertEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(3)
    @Test
    public void testIntegerMHappyPathMultipleOf5() {
        Integer m = 10;

        String expectedResult = "Poor Number";

        IntegerM intM = new IntegerM();

        Assertions.assertEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(4)
    @Test
    public void testIntegerMHappyPathNotMultipleOf3And5() {
        Integer m = 14;

        String expectedResult = "-1";

        IntegerM intM = new IntegerM();

        Assertions.assertEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(5)
    @Test
    public void testIntegerMHappyPathZero() {
        Integer m = 0;

        String expectedResult = "Good Number";

        IntegerM intM = new IntegerM();

        Assertions.assertEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(6)
    @Test
    public void testIntegerMHappyPathMaxValue() {
        Integer m = Integer.MAX_VALUE;

        String expectedResult = "-1";

        IntegerM intM = new IntegerM();

        Assertions.assertEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(7)
    @Test
    public void testIntegerMHappyPathMinValue() {
        Integer m = Integer.MIN_VALUE;

        String expectedResult = "-1";

        IntegerM intM = new IntegerM();

        Assertions.assertEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(8)
    @Test
    public void testIntegerMWrongCaseGoodNumber() {
        Integer m = 15;

        String expectedResult = "good number";

        IntegerM intM = new IntegerM();

        //Assertions.assertEquals(expectedResult, intM.IntegerM(m));
        Assertions.assertNotEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(9)
    @Test
    public void testIntegerMWrongCaseBadNumber() {
        Integer m = 9;

        String expectedResult = "bad number";

        IntegerM intM = new IntegerM();

        //Assertions.assertEquals(expectedResult, intM.IntegerM(m));
        Assertions.assertNotEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(10)
    @Test
    public void testIntegerMWrongCasePoorNumber() {
        Integer m = 10;

        String expectedResult = "poor number";

        IntegerM intM = new IntegerM();

        //Assertions.assertEquals(expectedResult, intM.IntegerM(m));
        Assertions.assertNotEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(11)
    @Test
    public void testIntegerMWrongNumberExpected() {
        Integer m = 14;

        String expectedResult = "-2";

        IntegerM intM = new IntegerM();

        //Assertions.assertEquals(expectedResult, intM.IntegerM(m));
        Assertions.assertNotEquals(expectedResult, intM.IntegerM(m));
    }

    @Order(12)
    @Test
    public void testIntegerMNumMoreMaxValue() {
        Integer m = 2147483647+1;

        String expectedResult = "-1";

        IntegerM intM = new IntegerM();

        Assertions.assertEquals(expectedResult, intM.IntegerM(m));
    }
}
