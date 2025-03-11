import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCreationAndFileModificationDate {
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

        try {
            Path path = file.toPath();
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

            FileTime creationTime = attr.creationTime();
            FileTime modifiedTime = attr.lastModifiedTime();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String createdDate = sdf.format(new Date(creationTime.toMillis()));
            String modifiedDate = sdf.format(new Date(modifiedTime.toMillis()));

            System.out.println("File: "+ filePath);
            System.out.println("Created On: "+ createdDate);
            System.out.println("Last Modified On: "+ modifiedDate);
        } catch (IOException e) {
            System.out.println("Error retrieving file attributes: "+e.getMessage());
        }
    }
}
