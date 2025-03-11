import java.util.Scanner;

public class CoutdownTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown time in seconds: ");
        int time = sc.nextInt();
        sc.close();

        for(int i = time; i >=0; i--) {
            System.out.println("Time left: "+i+" seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }
        }
        System.out.println("Time is up!");
    }
}
