import java.util.*;
public class goalInterpretation {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                sb.append("G");
            else if (i < command.length() - 1) {
                if (command.charAt(i + 1) == 'a') {
                    sb.append("al");
                    i += 3;
                } else {
                    sb.append("o");
                    i++;
                }
            }
        }
        return sb.toString();
    }
}