import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class SortOfSorting{

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int numbers = Integer.parseInt(sc.next());
  String lol = sc.nextLine();
    while (numbers > 0){
      String names[]= new String[numbers];
      for (int i =0; i<numbers ;i++ ) {
        names[i] = sc.nextLine();
      }
      Arrays.sort(names, Comparator.comparing(o -> o.substring(0, 2)));
      for (int i =0 ; i<names.length ;i++) {
        System.out.println(names[i]);
      }
      System.out.println();
      numbers = Integer.parseInt(sc.next());
      String lol2 = sc.nextLine();
    }
    System.out.println();
  }
}


