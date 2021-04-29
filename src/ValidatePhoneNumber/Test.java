package ValidatePhoneNumber;

public class Test {
    public static void main(String[] args) {
        String x = "    CodeGym_Viet_Nam   ";
        x = x.trim();
        System.out.println(x);
        System.out.println(x.indexOf("_"));
        System.out.println(x.substring(0,x.indexOf("_")));
    }
}
