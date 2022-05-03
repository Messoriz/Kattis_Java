import java.util.*;
import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans{

  static void removeDuplicates(char[] S)
  {
      int n = S.length;
      if (n < 1)
      {
          return;
      }
      int j = 0;

      for (int i = 1; i < n; i++) {
          if (S[j] != S[i]) {
              j++;
              S[j] = S[i];
          }
      }
      System.out.print(Arrays.copyOfRange(S, 0, j + 1));
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

      char S1[] = str.toCharArray();
      removeDuplicates(S1);
  }
}
