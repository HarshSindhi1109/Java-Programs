import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GetLastItemOfList {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list=");
        int size = sc.nextInt();
        sc.nextLine();

        if (size <= 0) {
            System.out.println("List is empty!");
            return;
        }

        List<String> lst = new ArrayList<>();

        System.out.println("Enter string values in list:-");
        for(int i = 0; i < size; i++) {
            lst.add(sc.nextLine());
        }
        sc.close();

        System.out.println("Last element in the list is "+ lst.get(size-1));
    }
}
