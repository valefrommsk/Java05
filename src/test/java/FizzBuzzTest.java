import org.testng.Assert;
import org.testng.annotations.Test;


public class FizzBuzzTest {

    // 1. Positive testing Happy path
    // if (start <= end)
    // return array;

    // start < end
    @Test

    public void testStartLessThan_End_HappyPath() {
        // AAA
        // Arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };

        // Act
        // FizzBuzz fizzBuzz = new FizzBuzz(); // создание объекта класса через конструктор по умолчанию

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // создание объекта класса и вызов от него метода

        // Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


    // start == end
    @Test

    public void testStartEqualsEnd_HappyPath() {
        // AAA
        // Arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        // Act

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // создание объекта класса и вызов от него метода

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Negative testing
    // if (start > end)
    // return new String[0];
    @Test

    public void testStartGreaterEnd_Negative() {
        // AAA
        // Arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        // Act

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // создание объекта класса и вызов от него метода

        // Assert
        Assert.assertEquals(actualResult, expectedResult);


        //Utils.random2DArray(); использование методов из класса
    }
}
