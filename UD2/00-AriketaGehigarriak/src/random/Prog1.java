package random;

import java.util.Random;

public class Prog1 {

    public static void main (String[] args){

        double[] zenbakia = new double[20];
        int bitarra;
        String txanpona;
        Random random = new Random();
        int dado;

        System.out.printf("%2s \n", "   ");
        System.out.println("           Math.random()    "+ "Bitarra   " + "Txanpona      " + "Dadoa");
        System.out.println("===============================================================");

        for(int i = 1; i < 20; i++){
            System.out.printf("%2d) ", i);

            zenbakia [i] = Math.random();
            dado = random.nextInt(7 - 1) + 1;

            if(zenbakia[i] <= 0.50){

                bitarra = 0;
                txanpona = "Aurpegia";

            }else{

                bitarra = 1;
                txanpona = "Gurutzea";
    
            }

            System.out.println(zenbakia[i] + "          " + bitarra + "   " + txanpona + "          " + dado);

        }
    }
}
