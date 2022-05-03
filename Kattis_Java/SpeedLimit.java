import java.util.Scanner;

public class SpeedLimit{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nextInput = sc.nextInt();
    int stop = -1;
    int lastTime = 0;
    while (nextInput != stop) {
      int milesTotal = 0;
      for (int i =0; i<nextInput; i++) {
        int miles = sc.nextInt();
        int time = sc.nextInt();
        milesTotal = milesTotal + ((time - lastTime) * miles);
        lastTime = time;
      }
      System.out.println(milesTotal + " " + "miles");
      lastTime = 0;
      nextInput = sc.nextInt();
    }
  }
}
