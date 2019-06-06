package ua.lviv.iot;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public String scanner () {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public String deleteCard(String string, String num) {
        String result = string;
        char a = num.charAt(0);
        char b = num.charAt(1);
        char c = num.charAt(2);
        char d = num.charAt(3);
        Pattern p = Pattern.compile("([" + a + "][" + b + "][" + c + "][" + d + "]\\d{12})" +
                "|([" + a + "][" + b + "][" + c + "][" + d + "]\\s\\d{4}\\s\\d{4}\\s\\d{4})");
        Matcher m = p.matcher(string);
        while (m.find()) {
            result = m.replaceAll("");
        }
        return result;
    }

}
