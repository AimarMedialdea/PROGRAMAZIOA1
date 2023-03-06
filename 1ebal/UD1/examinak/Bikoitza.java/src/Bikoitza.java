import java.util.Arrays;
import java.util.Scanner;

public class Bikoitza {
    public static void main(String[] args) {4

        final int tamaina = 5;
        int[] arr, arr1;

        Scanner in = new Scanner(System.in);

        arr = new int[tamaina];
        arr1 = new int[tamaina];

        System.out.print("Sartu itzazu 5 zenbaki espazioz bananduta: ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {

            arr1[i] = arr[i] * 2;

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        in.close();

    }
} 
