package Validate_Account;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (true){
           System.out.println("Nhap mot chuoi :"+"Không chứa các ký tự đặc biệt\n" +
                   "Ít nhất là 6 ký tự\n" +
                   "Không chứa các ký tự viết hoa\n" +
                   "Cho phép dấu gạch dưới (_)");
           String input = sc.nextLine();

           String regex = "^[_a-z0-9]{6,}$";
           Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(input);

           if(matcher.find()){
               System.out.println("Ok");
           }else {
               System.out.println("Vui long kiem tra lai !");
           }
       }
    }
}
