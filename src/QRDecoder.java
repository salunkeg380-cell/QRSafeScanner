import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.NotFoundException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRDecoder {

    public String decodeQRCode(String imagePath) {

        try {

            File file = new File(imagePath);

            BufferedImage image = ImageIO.read(file);

            BinaryBitmap bitmap = new BinaryBitmap(
                    new HybridBinarizer(
                            new BufferedImageLuminanceSource(image)));

            Result result = new MultiFormatReader().decode(bitmap);

            return result.getText();

        }
        catch (NotFoundException e) {

            System.out.println(" QR Code not found in image.");
        }
        catch (Exception e) {

            System.out.println("Error : " + e.getMessage());
        }

        return null;
    }

}