import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountItemInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of list=");
        int size = sc.nextInt();
        sc.nextLine();

        List<Integer> lst = new ArrayList<>();
        System.out.println("Enter numeric values in the list:-");
        for(int i = 0; i < size; i++) {
            lst.add(sc.nextInt());
        }
        sc.close();

        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for(int item : lst) {
            hashMap.put(item, hashMap.getOrDefault(item, 0) + 1);
        }
        System.out.println("Item counts in the list:");
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
