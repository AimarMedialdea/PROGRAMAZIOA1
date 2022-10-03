public class SumAverageRunningIntmodified {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average = 0;       // average in double
      double media;
      int count = 0;
      final int LOWERBOUND = 111;
      final int UPPERBOUND = 8899;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number, ++average, ++count) {
           
         sum += number;     
      }
      media = sum/average;
     System.out.println(sum);
     System.out.println(media);
     System.out.println(count);

   }
} 