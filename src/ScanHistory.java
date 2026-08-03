import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ScanHistory {

    public static void save(String url, boolean result) {

        try {

            FileWriter writer = new FileWriter("history/scan_history.txt", true);

            writer.write("-----------------------------------------\n");

            writer.write("Date : " + LocalDate.now() + "\n");

            writer.write("Time : " + LocalTime.now() + "\n");

            writer.write("URL  : " + url + "\n");

            if(result)
                writer.write("Result : PHISHING\n");
            else
                writer.write("Result : SAFE\n");

            writer.write("-----------------------------------------\n\n");

            writer.close();

            System.out.println("History Saved Successfully.");

        }
        catch(IOException e) {

            System.out.println("Error Saving History.");

        }

    }

}