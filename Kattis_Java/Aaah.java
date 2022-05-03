import java.util.Scanner;

public class Aaah{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String jon = sc.nextLine();
    String doctor = sc.nextLine();
    if (jon.length() >= doctor.length()){
      System.out.println("go"); 
    } else {
      System.out.println("no");
    }
  }
}
