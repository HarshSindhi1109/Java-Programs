import java.util.Arrays;
import java.util.Scanner;

public class ArrayBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter breakpoint=");
        int brpoint = sc.nextInt();

        int[][] ans = breakArray(arr, brpoint);
        
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }
    private static int[][] breakArray(int[] arr, int n) {
        int size = (arr.length + n - 1) / n;
        int[][] res = new int[size][n];
        int count = 0;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < n; j++) {
                res[i][j] = (count >= arr.length) ? 0 : arr[count];
                count++;
            }
        }
        return res;
    }
}
