public class SumAverageRunningIntwhilesquare {
    
    public static void main (String[] args) {
        // Define variables
        int sum = 0;          // The accumulated sum, init to 0
        double average = 0;       // average in double
        double media;
        int square = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
  
        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
             
              
           ++average;
           square += number * number;
           sum += number;  
        }
        media = sum/average;
       System.out.println(sum);
       System.out.println(media);
       System.out.println(square);
     }
  }