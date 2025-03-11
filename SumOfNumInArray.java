import java.util.Scanner;

public class SumOfNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        int sum = sumOfNum(arr);
        System.out.println(sum);
        sc.close();
    }
    private static int sumOfNum(int[] arr) {
        int last = 0, num;
        for(int i=0; i < arr.length; i++) {
            num = arr[i];
            while(num != 0) {
                last += num % 10;
                num /= 10;
            }
        }
        return last;
    }
}
