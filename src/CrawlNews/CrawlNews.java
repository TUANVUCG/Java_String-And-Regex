package CrawlNews;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CrawlNews {
    public static void main(String[] args) {


        try{
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));

            scanner.useDelimiter("\\Z");

            String content = scanner.next();




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
