import java.util.Scanner;

public class Izartxoak {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Esan zenbaki bat (1-10): ") ;
        int n = scanner.nextInt(); 
        scanner.close();
        

        for(int i = 1; i <= 50; i++){
            if(i % n == 0){
                System.out.print("*");
                if(i == 50){
                    System.out.print(" ");
                }else{
                    System.out.print(" - ");
                }

            }else{
                System.out.print(i);
                if(i == 50){
                    System.out.print(" ");
                }else{
                    System.out.print(" - ");
                }
            }

        }

    }
}
