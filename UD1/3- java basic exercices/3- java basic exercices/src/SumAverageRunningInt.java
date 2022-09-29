/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 10;
      int count = 0;
      // Use a for-loop to sum from lowerbound to upperbound
     for(int number = LOWERBOUND; number <= UPPERBOUND; ++number){
        sum += number;

        ++count;
     }
        average = sum / UPPERBOUND - LOWERBOUND + 1; 
        System.out.println(sum);
        System.out.println(average);
        System.out.println(count);
   }
}
