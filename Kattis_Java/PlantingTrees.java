import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PlantingTrees{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Integer myArray[] = new Integer[size];
    int day = 0;

    for(int i=0;i<size;i++){
      myArray[i] = sc.nextInt();
    }

    Arrays.sort(myArray, Collections.reverseOrder());

    for(int i=0;i<size;i++){
      int k = myArray[i]+(2+i);
      if (k>day) {
        day = k;
      }
    }

    System.out.print(day);
}
}
