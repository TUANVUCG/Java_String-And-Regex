package CrawlNews;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {

        try{
            URL url = new URL("https://dantri.com.vn/o-to-xe-may.htm");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));

            scanner.useDelimiter("\\Z");

            String content = scanner.next();
            System.out.println(content);

            scanner.close();

            content = content.replaceAll("\n","" );

            Pattern pattern =  Pattern.compile("title=\"(.*?)>");

            Matcher matcher = pattern.matcher(content);

            while(matcher.find()){
                System.out.println(matcher.group(1));
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
