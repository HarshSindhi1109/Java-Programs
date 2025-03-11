import java.util.Scanner;

public class TrimWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.trim();
        System.out.println(str);
        sc.close();
    }
}
