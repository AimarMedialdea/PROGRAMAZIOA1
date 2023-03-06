//8.2

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {

        String str;
        int vocal = 0;
        int digit = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("mete un string");
        str = in.next();
        in.close();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                vocal += 1;
            }else if(str.charAt(i) >= '0' & str.charAt(i) <= '9'){
                digit += 1;
            }
            
        }

        double voct = vocal * 100 / str.length();
        double digt = digit * 100 / str.length();

        System.out.printf("El numero de los vocales es: " + vocal + " %.2f\n",voct);
        System.out.printf("El numero de los digitos es: " + digit + " %.2f",digt);

            
        }
    }










