package Assignment5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zemoso on 4/7/17.
 */
public class Sentence {

    private Pattern sentence;
    private Matcher matcher;

    public Sentence() {
        sentence = Pattern.compile("^[A-Z].*[.]$");
    }

    public boolean isSentence(String str) {
        matcher = sentence.matcher(str);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
