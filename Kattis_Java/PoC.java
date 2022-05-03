import java.util.Scanner;

public class PoC{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int cl = sc.nextInt();
    int ch = sc.nextInt();
    int chr;
    int cv = sc.nextInt();
    int cvr;
    int ct = 4;
    int bpoc;

    if ((cl-ch)>(cl/2)) {
      chr=cl-ch;
    } else {
      chr = ch;
    }
    if ((cl-cv)>(cl/2)){
      cvr = cl-cv;
    } else {
      cvr = cv;
    }

    bpoc = chr*cvr*ct;

    System.out.println(bpoc);
  }
}
