import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MergeTwoDictionaries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> map1 = new HashMap<>();
        System.out.print("Enter number of elments in dictionary-1=");
        int n1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter key-value pairs for dictionary-1:-");
        for(int i = 0; i < n1; i++) {
            System.out.print("Key: ");
            int key = sc.nextInt();
            sc.nextLine();
            System.out.print("Value:");
            String value = sc.nextLine();
            map1.put(key, value);
        }

        Map<Integer, String> map2 = new HashMap<>();
        System.out.print("Enter number of elments in dictionary-2=");
        int n2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter key-value pairs for dictionary-2:-");
        for(int i = 0; i < n2; i++) {
            System.out.print("Key: ");
            int key = sc.nextInt();
            sc.nextLine();
            System.out.print("Value:");
            String value = sc.nextLine();
            map2.put(key, value);
        }
        sc.close();

        Map<Integer, String> mergeDict = new HashMap<>(map1);
        mergeDict.putAll(map2);

        System.out.println(mergeDict);
    }
}
