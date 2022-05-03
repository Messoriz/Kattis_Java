import java.util.Scanner;

public class IsItHalloween{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String a = "OCT 31";
        String b = "DEC 25";
        if (word.contains(a)) {
          System.out.println("yup");
        } else if (word.contains(b)){
          System.out.println("yup");
        } else {
          System.out.println("nope");
        }

    }
}
