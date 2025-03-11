import java.util.Scanner;

public class ExtractZeroToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String ans = extractChar(str);
        System.out.println(ans);

        sc.close();
    }
    private static String extractChar(String str) {
        String ans = "";

        for(char c : str.toCharArray()) {
            if(c >= '0' && c <= '9') ans += c;
        }
        return (ans.equals("")) ? "0" : ans;
    }
}
