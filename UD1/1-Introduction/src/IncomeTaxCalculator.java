import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        final double TAX_RATE_UNDER_20K = 0.0;
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        int total;
        double rest;
        double pagar = 0;

        Scanner in = new Scanner(System.in);             //input

        System.out.println("Lo que cobras: ");
        total = in.nextInt();

        in.close();

        if(total > 60000){
            rest = total - 60000;
            pagar += rest * TAX_RATE_ABOVE_60K;
            total -= rest;
        }

        if(total > 40000){
            rest = total - 40000;
            pagar += rest * TAX_RATE_ABOVE_40K;
            total -= rest;
        }

        if(total > 20000){
            rest = total - 20000;
            pagar += rest * TAX_RATE_ABOVE_20K;
            total -= rest;
        }

        if(total <= 20000){
            rest = total;
            pagar += rest * TAX_RATE_ABOVE_60K;
            total -= rest;
        }

        

      }
}
