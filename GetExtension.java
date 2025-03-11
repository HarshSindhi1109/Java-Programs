import java.util.Scanner;

public class GetExtension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name or path: ");
        String fileName = sc.nextLine();
        sc.close();

        String extension = getFileExtension(fileName);

        if(extension.isEmpty()) {
            System.out.println("No extensions found!");
        } else {
            System.out.println("File Extension: "+ extension);
        }
    }
    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');

        if(lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
            return fileName.substring(lastDotIndex);
        }
        return "";
    }
}
