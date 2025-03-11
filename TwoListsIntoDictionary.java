import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class TwoListsIntoDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements=");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();

        System.out.println("Enter keys:-");
        for(int i = 0; i < n; i++) {
            keys.add(sc.nextLine());
        }

        System.out.println("Enter values:-");
        for(int i =0; i < n; i++) {
            values.add(sc.nextLine());
        }

        sc.close();

        Map<String, String> dictionary = new HashMap<>();
        for(int i = 0; i < n; i++) {
            dictionary.put(keys.get(i), values.get(i));
        }
        System.out.println("Dictionary: "+ dictionary);
    }
}
