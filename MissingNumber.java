import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array=");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values for array:-");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int missingNum = checkMissingNum(arr);
        String ans = (missingNum == 0) ? ("There is no missing number.") : ("Missing number is "+missingNum);
        System.out.println(ans);

        sc.close();
    }
    private static int checkMissingNum(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] != arr[i] + 1) return arr[i] + 1;
        }
        return 0;
    }
}
