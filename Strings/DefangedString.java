
public class DefangedString {

    static String defangIPaddr(String address) {
        String defangedStr = address.replace(".", "[.]");
        return defangedStr;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
