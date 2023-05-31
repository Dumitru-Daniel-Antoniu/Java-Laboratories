package app;

import language.*;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleExplore {
    public static void main(String[] args) {
        DisplayLocales display = new DisplayLocales();
        SetLocale set = new SetLocale();
        Info info = new Info();
        Scanner scanner = new Scanner(System.in);
        String command;
        ResourceBundle line = ResourceBundle.getBundle("res.Messages");
        Locale locale = new Locale("en", "US");
        System.out.println(line.getString("prompt"));
        command = scanner.nextLine();
        while(!command.equals("exit")) {
            if(command.equals("display")) display.localeMenu(locale);
            else if(command.equals("set")) locale = set.setLanguage();
            else if(command.equals("info")) info.information(locale);
            else System.out.println(line.getString("invalid"));
            System.out.println(line.getString("prompt"));
            command = scanner.nextLine();
        }
    }
}
