import java.util.Scanner;

public class Bijele {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i=0; i<2; i++) {
      int x = sc.nextInt();
      if (x==1){
      x = x-x;
      }
      else{
      x = x - 1;
      x = -x;
      }
      System.out.print(x +" ");
    }
      for (int i=0; i<3; i++) {
        int x = sc.nextInt();
        if (x==2){
        x = x-x;
        }
        else{
        x = x - 2;
        x = -x;
        }
        System.out.print(x + " ");
      }
        for (int i=0; i<1; i++) {
          int x = sc.nextInt();
          if (x==8){
          x = x-x;
          }
          else{
          x = x - 8;
          x = -x;
          }
          System.out.print(x);
          }
    }
  }
