public class GetCurrentDir {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current Working Directory: "+currentDir);
    }    
}
