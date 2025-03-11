import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        permutationOfString(str, "");
        sc.close();
    }
    private static void permutationOfString(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans); //abc //bac
            return;
        }
        for(int i = 0; i < str.length(); i++) { //abc  bc  c  //ac c
            char c = str.charAt(i); //a b c //b a c
            String rest = str.substring(0, i) + str.substring(i + 1); //"" + bc = bc, "" + c = c, "" + "" = "" //a + c = ac, "" + c = c
            permutationOfString(rest, ans + c); //bc, a //c, ab //"", abc //ac, b //c, ba //"", bac
        }
    }
}
