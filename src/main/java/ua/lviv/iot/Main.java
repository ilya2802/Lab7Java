package ua.lviv.iot;

public class Main {
    public static void main(String[] args) {
        Regex regex = new Regex();
        String s = regex.scanner();
        System.out.println(regex.deleteCard(s, "4444"));
    }
}
