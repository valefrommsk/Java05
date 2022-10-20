import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {


    // позитивная проверка
    // array != null && array.length != 0 && number != Integer.MAX_VALUE
    // return true

    @Test
    public void testValidArrayValidNumber_HappyPath() {
        int[] array = {6, 7, 8, 9, 10};
        int number = 5;
        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // позитивный при негативном сценарии return false
    // array [i] <= number
    @Test
    public void testValidArrayContainsValidNumber_HappyPath() {
        int[] array = {6, 7, 8, 9, 10, 3};
        int number = 3;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testValidArrayLessThanValidNumber_HappyPath() {
        int[] array = {6, 7, 8, 9, 10};
        int number = 11;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIsValidNumberIsMaxValuePlusOne_Negative() {
        int[] array = {6, 7, 8, 9, 10};
        int number = Integer.MAX_VALUE + 1;
        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // негативная проверка return false
    // array = null && array.length = 0 && number = Integer.MAX_VALUE

    @Test
    public void testArrayIsNullNumberIsValid_Negative() {
        int[] array = null;
        int number = 11;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIsEmptyNumberIsValid_Negative() {
        int[] array = {};
        int number = 11;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIsValidNumberIsMaxValue_Negative() {
        int[] array = {6, 7, 8, 9, 10};
        int number = Integer.MAX_VALUE;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIsValidNumberIsMinValueMinusOne_Negative() {
        int[] array = {6, 7, 8, 9, 10};
        int number = Integer.MIN_VALUE - 1;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
