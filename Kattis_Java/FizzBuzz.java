import java.util.Scanner;

public class FizzBuzz{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    int n = Integer.parseInt(sc.next());
    for (int i=0; i<n; i++) {
      if (((i+1) % x == 0) && ((i+1) % y == 0)) {
      System.out.println("FizzBuzz");
      }
      else if ((i+1) % y == 0 ) {
      System.out.println("Buzz");
      }
      else if((i+1) % x == 0){
      System.out.println("Fizz");
      }
      else {
      System.out.println(i+1);
      }      
    }
  }
}
