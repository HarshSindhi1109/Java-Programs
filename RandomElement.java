import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of list=");
        int size = sc.nextInt();

        List<Integer> lst = new ArrayList<>();
        System.out.println("Enter numeric values in the list:-");
        for(int i = 0; i < size; i++) {
            lst.add(sc.nextInt());
        }
        sc.close();

        Random rand = new Random();
        System.out.println("Random element is "+ lst.get(rand.nextInt(size)));
    }
}
