import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class SizeOfImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter image file path: ");
        String imagePath = sc.nextLine();
        sc.close();

        File file = new File(imagePath);
        if(!file.exists()) {
            System.out.println("File Not Found!");
            return;
        }

        try {
            BufferedImage image = ImageIO.read(file);
            if(image == null) {
                System.out.println("Invalid Image File!");
                return;
            }

            int width = image.getWidth();
            int height = image.getHeight();

            System.out.println("Image Resolution: "+ width + " x " + height);
        } catch (IOException e) {
            System.out.println("Error Reading Image: "+ e.getMessage());
        }
    }
}
