import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string-1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string-2: ");
        String s2 = sc.nextLine();

        boolean check = checkAnagram(s1, s2);
        String ans = (check) ? "Two strings are anagram." : "Two strings are not anagram.";
        System.out.println(ans);

        sc.close();
    }
    private static boolean checkAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
