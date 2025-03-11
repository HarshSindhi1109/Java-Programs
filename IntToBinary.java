import java.util.Scanner;

public class IntToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number=");
        int num = sc.nextInt();
        String ans = convertToBinary(num);
        System.out.println("Binary: "+ans);
        sc.close();
    }
    private static String convertToBinary(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        
        if(isNegative) num = -num;

        while (num > 0) {
            sb.append(num%2);
            num /= 2;
        }

        if(isNegative) sb.append('-');
        
        return sb.reverse().toString();
    }
}
