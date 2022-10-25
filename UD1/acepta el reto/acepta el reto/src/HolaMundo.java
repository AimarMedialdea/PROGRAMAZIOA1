import java.util.Scanner;

public class HolaMundo {
  public static void main(String[] args) {

    int n;

    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    in.close();

    for (int x = 1; x <= n; x++) {
      System.out.println("Hola mundo.");
    }

  }
}