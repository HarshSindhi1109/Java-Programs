import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number=");
        int num = sc.nextInt(), temp = num;
        int sum = 0;

        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits in number "+temp+" is "+sum);
        sc.close();
    }
}
