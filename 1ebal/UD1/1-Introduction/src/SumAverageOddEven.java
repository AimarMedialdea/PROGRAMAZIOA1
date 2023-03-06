public class SumAverageOddEven {

    public static void main(String[] args) {

        int sumOdd = 0; // Accumulating sum of odd numbers
        int sumEven = 0; // Accumulating sum of even numbers
        int absDiff; // Absolute difference between the two sums

        final int LOWERBOUND = 1;
        final int UPPERBOUND = 105;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            if (number % 2 == 0) {
                sumEven += number;

            } else {
                sumOdd += number;
            }
        }

        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println(absDiff);

    }
}