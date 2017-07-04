package Assignment5;

/**
 * Created by zemoso on 4/7/17.
 */
public class Main {

    public static void main(String args[]) {
        Sentence s = new Sentence();

        String str1 = "Hello World.",
                str2 = "hello World.",
                str3 = "Hello World",
                str4 = "hello World.",
                str5 = "hello world",
                str6 = "Hello world .";

        System.out.println(str1 + " is a sentence == " + s.isSentence(str1));
        System.out.println(str2 + " is a sentence == " + s.isSentence(str2));
        System.out.println(str3 + " is a sentence == " + s.isSentence(str3));
        System.out.println(str4 + " is a sentence == " + s.isSentence(str4));
        System.out.println(str5 + " is a sentence == " + s.isSentence(str5));
        System.out.println(str6 + " is a sentence == " + s.isSentence(str6));
    }
}
