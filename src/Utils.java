import java.io.File;

public class Utils {

    // Display application title
    public static void printHeader() {

        System.out.println("=========================================");
        System.out.println("      QR Shield - Phishing Detector");
        System.out.println("=========================================");
    }

    // Check whether file exists
    public static boolean fileExists(String path) {

        File file = new File(path);

        return file.exists();
    }

    // Check image format
    public static boolean isValidImage(String path) {

        path = path.toLowerCase();

        return path.endsWith(".png")
                || path.endsWith(".jpg")
                || path.endsWith(".jpeg");
    }

}