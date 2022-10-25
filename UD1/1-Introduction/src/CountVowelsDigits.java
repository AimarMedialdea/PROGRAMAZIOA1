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
            }
            
        }
        System.out.println("El numero de los vocales es: " + vocal);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9' || str.charAt(i) == '0' ){
                digit += 1;
            }
            
        }
        System.out.println("El numero de los digitos es: " + digit);

            
        }
    }










