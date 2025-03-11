import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total amount of data: ");
        int limit = sc.nextInt();

        for (int i = 0; i < limit; i++) {
            System.out.print("Enter numeric data[" + (i + 1) + "]: ");
            int data = sc.nextInt();
            list.add(data);
        }

        removeDuplicatesInPlace(list);
        System.out.println("List after removing duplicates: " + list);
        
        sc.close();
    }

    private static void removeDuplicatesInPlace(List<Integer> list) {
        if (list.size() <= 1) return;

        Collections.sort(list);
        int i = 0;
        for (int j = 1; j < list.size(); j++) {
            if(!list.get(i).equals(list.get(j))) {
                i++;
                list.set(i, list.get(j));
            }
        }
        while(list.size() > i + 1) {
            list.remove(list.size() - 1);
        }
    }
}
