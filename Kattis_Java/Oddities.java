import java.util.Scanner;


public class Oddities{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i=0;i<times;i++) {
      int num = sc.nextInt();
      if (num % 2 == 0) {
        System.out.println(num + " is even");
      }
      else{
        System.out.println(num + " is odd");
      }
    }
  }
}
