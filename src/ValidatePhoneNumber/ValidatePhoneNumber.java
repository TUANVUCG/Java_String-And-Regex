package ValidatePhoneNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập một số điện thoại : "+
                    "\nSố điện thoại CHỈ bao gồm 10 hoặc 11 chữ số ");
            String phoneNumber = scanner.nextLine();
            String regex = "^0[0-9]{9,10}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phoneNumber);
            if(matcher.matches()){
                System.out.println("ok");
            }else{
                System.out.println("Vui lòng kiểm tra lại !!!");
            }
        }
    }
}
