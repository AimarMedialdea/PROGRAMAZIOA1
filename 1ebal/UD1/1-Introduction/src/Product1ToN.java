public class Product1ToN {
    
    public static void main (String[] args) {
     
        long product = 1;
        long product1 = 1;
        long result = 0;
        final int LOWERBOUNT = 1;
        final int UPPERBOUND = 13;
        final int UPPERBOUND1 = 14;

        for(int i=LOWERBOUNT;i <= UPPERBOUND; ++i){
              product *= i;

        }
        System.out.println(product);

        for(int i=LOWERBOUNT;i <= UPPERBOUND1; ++i){
            product1 *= i ;

      }
      System.out.println(product1);
      
      if(product > product1){
        result = product - product1;
      }else{
        result = product1 - product;
      }
      System.out.println(result);
     }
    } 