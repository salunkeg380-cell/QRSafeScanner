import java.io.File;

public class Utils {

    
    public static void printHeader() {

        System.out.println("=========================================");
        System.out.println("      QR Shield - Phishing Detector");
        System.out.println("=========================================");
    }

    public static boolean fileExists(String path) {

        File file = new File(path);

        return file.exists();
    }

  
    public static boolean isValidImage(String path) {

        path = path.toLowerCase();

        return path.endsWith(".png")
                || path.endsWith(".jpg")
                || path.endsWith(".jpeg");
    }

}