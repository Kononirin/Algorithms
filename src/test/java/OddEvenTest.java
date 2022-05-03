import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

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

    @Order(1)
    @Test
    public void testOddEvenHappyPathNegativeOdd(){

        long number = -345;

        OddEven odEv = new OddEven();

        String expectedResult = "Odd";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult,actualResult );
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathPositiveOdd(){

        long number = 297;

        OddEven odEv = new OddEven();

        String expectedResult = "Odd";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult,actualResult );
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathNegativeEven(){

        long number = -1057896;

        OddEven odEv = new OddEven();

        String expectedResult = "Even";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult,actualResult );
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathPositiveEven(){

        long number = 222222;

        OddEven odEv = new OddEven();

        String expectedResult = "Even";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult,actualResult );
    }

    @Order(5)
    @Test
    public void testOddEvenHappyPathZero(){

        long number = 0;

        OddEven odEv = new OddEven();

        String expectedResult = "Even";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult,actualResult );
    }

    @Order(6)
    @Test
    public void testOddEvenNumMoreThenInt(){

        long number = 2147483647 + 1;

        OddEven odEv = new OddEven();

        String expectedResult = "Undefined";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testOddEvenNumMoreThenIntForFive(){

        long number = 2147483647 + 5;

        OddEven odEv = new OddEven();

        String expectedResult = "Undefined";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testOddEvenNumLessThenInt(){

        long number = -2147483648 - 1;

        OddEven odEv = new OddEven();

        String expectedResult = "Undefined";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testOddEvenNumLessThenIntForFive(){

        long number = -2147483648 - 5;

        OddEven odEv = new OddEven();

        String expectedResult = "Undefined";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(10)
    @Test
    public void testOddEvenIntMaxValue(){

        long number = Integer.MAX_VALUE;

        OddEven odEv = new OddEven();

        String expectedResult = "Odd";
        String actualResult = odEv.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }








}
