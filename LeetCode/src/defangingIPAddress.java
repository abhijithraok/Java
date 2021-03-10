public class defangingIPAddress {
    public static String defangIPaddr(String address) {
        StringBuilder ip = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (Character.isDigit(address.charAt(i)) || address.charAt(i) == '.' || address.charAt(i) == '"') {
                //ip.append(address.charAt(i));
                if (address.charAt(i) == '.') {
                    ip.append("[.]");
                } else ip.append(address.charAt(i));
            }

        }
        return ip.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("\"1.1.1.1\""));
    }
}
