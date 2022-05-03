import java.util.Scanner;
import java.util.Arrays;

public class ABC{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int array[] = new int[3];
    String input;
    for (int i = 0; i<array.length; i++) {
      array[i] = sc.nextInt();
    }
    String lol = sc.nextLine();
    Arrays.sort(array);
    String order = sc.nextLine();
    //String order = sc.nextLine();
    switch (order){
      case "ABC":
        System.out.println(Integer.toString(array[0]) + " " + Integer.toString(array[1]) + " " + Integer.toString(array[2]));
        break;
      case "ACB":
        System.out.println(Integer.toString(array[0]) + " " + Integer.toString(array[2]) + " " + Integer.toString(array[1]));
        break;
      case "BAC":
        System.out.println(Integer.toString(array[1]) + " " + Integer.toString(array[0]) + " " + Integer.toString(array[2]));
        break;
      case "BCA":
        System.out.println(Integer.toString(array[1]) + " " + Integer.toString(array[2]) + " " + Integer.toString(array[0]));
        break;
      case "CAB":
        System.out.println(Integer.toString(array[2]) + " " + Integer.toString(array[0]) + " " + Integer.toString(array[1]));
        break;
      case "CBA":
        System.out.println(Integer.toString(array[2]) + " " + Integer.toString(array[1]) + " " + Integer.toString(array[0]));
        break;
    }
  }
}
