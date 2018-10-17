package Solutions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution796 {
    public boolean rotateString(String A, String B) {
        Pattern pattern = Pattern.compile(".*"+B+".*");
        String AA = A + A;
        Matcher matcher = pattern.matcher(AA);
        return (A.length() == B.length() && 
               matcher.matches());
    }
}