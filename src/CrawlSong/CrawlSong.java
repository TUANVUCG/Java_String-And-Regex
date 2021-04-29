package CrawlSong;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSong {

    public static void main(String[] args) {

        try{
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");


            // Mo stream va day no vao BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content =  scanner.next();

            // Dong scanner
            scanner.close();

            // xoa tat ca cac dong trong content lay duoc
            content = content.replaceAll("\\n+","");

            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
