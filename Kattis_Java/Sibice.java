import java.util.Scanner;
import java.lang.Math;

public class Sibice{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matches = Integer.parseInt(sc.next());
    double w = Double.parseDouble(sc.next());
    double h = Double.parseDouble(sc.next());
    for (int i=0; i<matches; i++) {
      double ran = Double.parseDouble(sc.next());
      if(ran <= Math.sqrt((w*w)+(h*h))) {
        System.out.println("DA");
        } else {
        System.out.println("NE");
        }
      }
    }
}
