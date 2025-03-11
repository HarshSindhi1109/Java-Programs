import java.util.Scanner;

public class CapitalFirstChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        char[] arr = str.toCharArray();
        boolean capitalize = true;  // To track if we should capitalize next letter

        for (int i = 0; i < arr.length; i++) {
            if (capitalize && Character.isLetter(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
                capitalize = false;  // Reset flag
            }
            if (arr[i] == '?' || arr[i] == '.' || arr[i] == '!') {
                capitalize = true;  // Set flag to capitalize the next letter
            }
        }

        System.out.println(new String(arr));  // Convert back to string and print
    }
}
