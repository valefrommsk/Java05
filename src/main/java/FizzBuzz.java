public class FizzBuzz {


    public String[] fizzBuzz(int start, int end) {


        if (start <= end) {
            String[] array = new String[end - start + 1];

            int number = start; // но это не обюязательная переменная, можно просто старт

            for (int i = 0; i < array.length && number <= end; i++) {
                if (number % 15 == 0) {
                    array[i] = "FizzBuzz";
                } else if (number % 3 == 0) {
                    array[i] = "Fizz";
                } else if (number % 5 == 0) {
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(number);
                }
                number++;
            }

            return array;

        }

        return new String[0];
    }


}
