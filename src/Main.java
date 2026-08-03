import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      QR Shield - Phishing Detector");
        System.out.println("======================================");

        System.out.print("Enter QR Code Image Path : ");

        String imagePath = sc.nextLine();

        QRDecoder decoder = new QRDecoder();

        String url = decoder.decodeQRCode(imagePath);

        if(url == null)
        {
            System.out.println("QR Code could not be decoded.");
            return;
        }

        System.out.println("\nDecoded URL : " + url);

        URLAnalyzer analyzer = new URLAnalyzer();

        boolean result = analyzer.isPhishing(url);

        if(result)
        {
            System.out.println("\nResult : PHISHING WEBSITE");
        }
        else
        {
            System.out.println("\nResult : SAFE WEBSITE");
        }

        ScanHistory.save(url,result);

        sc.close();
    }

}