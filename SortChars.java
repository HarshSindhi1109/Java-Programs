import java.util.Scanner;

public class SortChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        char[] charArray = str.toCharArray();

        for(int i = 0; i < charArray.length - 1; i++) {
            for(int j = 0; j < charArray.length - 1; j++) {
                if(charArray[j] > charArray[j+1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted words: "+ new String(charArray));
    }
}
