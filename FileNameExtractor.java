import java.io.File;
import java.util.Scanner;

public class FileNameExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();
        sc.close();

        File file = new File(filePath);

        if(!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        String fileName = file.getName();
        System.out.println("File Name: "+ fileName);
    }
}
