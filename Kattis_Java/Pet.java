import java.util.Scanner;

public class Pet{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int winnerNumber = 0;
    int winnerScore = 0;
   for(int i=0; i<5;i++){
      int score = 0;
      for(int j=0; j<4;j++){
      int number = Integer.parseInt(sc.next());;
      score = score + number;
      }
      if (score>winnerScore) {
        winnerScore = score;
        winnerNumber = i+1;
      } else {

      }
    }
    System.out.println(winnerNumber + " " +winnerScore);
  }
}
