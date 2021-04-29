package ValidateClassName;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {

    public static void main(String[] args) {
        System.out.println("Nhập tên lớp học \n"+
                "Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P\n" +
                "Không chứa các ký tự đặc biệt\n" +
                "Theo sau ký tự bắt đầu là 4 ký tự số \n" +
                "Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M");
        String regex = "^(C|A|P)\\d{4}(G|H|I|K|L|M)$";
        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                System.out.println("OK");
            }else {
                System.out.println("Vui long kiem tra lai !!!");
            }
        }
    }
}
