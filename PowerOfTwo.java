import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number=");
        int num = sc.nextInt();
        boolean ans = isPowerOfTwo(num);
        String res = (ans) ? (num+" is a power of two") : (num+" is not a power of two");
        System.out.println(res);
        sc.close();
    }    
    private static boolean isPowerOfTwo(int num) {
        if (num <= 0) return false;

        while(num > 1) {
            if (num % 2 != 0) return false;
            num /= 2;
        }
        return true;
    }
}
