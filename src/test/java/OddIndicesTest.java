import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    /**
     * 2. Написать алгоритм OddIndices, который принимает массив чисел,
     * и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    @Order(1)
    @Test
    public void testOddIndicesHappyPathArrayWith6Elements() {

        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesHappyPathArrayPositive() {

        int[] input = {45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddIndicesHappyPathArrayNegative() {

        int[] input = {-45, -590, -234, -985, -12, -68};
        int[] expectedResult = {-590, -985, -68};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddIndicesHappyPathArrayPositiveAndNegative() {

        int[] input = {45, 590, 234, -985, -12, -68};
        int[] expectedResult = {590, -985, -68};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddIndicesHappyPathOneElement() {

        int[] input = {45};
        int[] expectedResult = {};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testOddIndicesHappyPathAllNumEqualsPositive() {

        int[] input = {45, 45, 45, 45, 45, 45, 45, 45};
        int[] expectedResult = {45, 45, 45, 45};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testOddIndicesHappyPathAllNumEqualsNegative() {

        int[] input = {-45, -45, -45, -45, -45, -45, -45, -45};
        int[] expectedResult = {-45, -45, -45, -45};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testOddIndicesHappyPathAllNumEqualsPositiveAndNegative() {

        int[] input = {45, 45, 45, 45, -45, -45, -45, -45};
        int[] expectedResult = {45, 45, -45, -45};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testOddIndicesHappyPathOneNumIntMaxValue() {

        int[] input = {45, 45, 45, 2147483647, -45, -45, -45, -45};
        int[] expectedResult = {45, 2147483647, -45, -45};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(10)
    @Test
    public void testOddIndicesHappyPathOneNumIntMinValue() {

        int[] input = {45, 45, 45, -2147483648, -45, -45, -45, -45};
        int[] expectedResult = {45, -2147483648, -45, -45};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(11)
    @Test
    public void testOddIndicesOneNumMoreIntMaxValue() {

        int[] input = {45, 45, 45, 2147483647 + 1, -45, -45, -45, -45};
        int[] expectedResult = {45, 2147483647 + 1, -45, -45};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(12)
    @Test
    public void testOddIndicesOneNumLessIntMinValue() {

        int[] input = {45, 45, 45, -2147483648 - 1, -45, -45, -45, -45};
        int[] expectedResult = {45, -2147483648 - 1, -45, -45};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(13)
    @Test
    public void testOddIndicesEmptyArray() {

        int[] input = {};
        int[] expectedResult = {};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(14)
    @Test
    public void testOddIndicesOneElement() {

        int[] input = {45};
        int[] expectedResult = {};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(15)
    @Test
    public void testOddIndicesTwoElements() {

        int[] input = {45, 65};
        int[] expectedResult = {65};

        OddIndices oddInd = new OddIndices();

        int[] actualResult = oddInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
