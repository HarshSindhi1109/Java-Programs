import java.util.Scanner;

public class ContiguousSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1, size2;
        System.out.print("Enter the size of main array=");
        size1 = sc.nextInt();
        System.out.print("Enter the size of sub array=");
        size2 = sc.nextInt();
        int[] mainArray = new int[size1];
        int[] subArray = new int[size2];

        System.out.println("Enter values for main array:-");
        for(int i = 0; i < mainArray.length; i++) {
            mainArray[i] = sc.nextInt();
        }

        System.out.println("Enter values for sub array:-");
        for(int i = 0; i < subArray.length; i++) {
            subArray[i] = sc.nextInt();
        }

        boolean check = logic(mainArray, subArray);
        String ans = (check) ? "It is contiguous sub array." : "It isn't contiguous sub array.";
        System.out.println(ans);
        
        sc.close();
    }
    private static boolean logic(int[] mainArray, int[] subArray) {
        if(subArray.length > mainArray.length) return false;

        for(int i = 0; i <= mainArray.length - subArray.length; i++) {
            int j;
            for(j = 0; j < subArray.length; j++) {
                if(mainArray[i+j] != subArray[j]) break;
            }
            if(j == subArray.length) return true;
        }
        return false;
    }
}
