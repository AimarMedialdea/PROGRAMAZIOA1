public class SumAverageRunningIntwhile {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average = 0;       // average in double
      double media;
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
      int number = LOWERBOUND;
      // Use a for-loop to sum from lowerbound to upperbound
      while (number <= UPPERBOUND){
        sum += number;
        ++number;
        ++average;
      }

      media = sum/average;
     System.out.println(sum);
     System.out.println(media);
   }
}