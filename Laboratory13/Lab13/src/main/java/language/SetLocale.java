package language;

import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Locale;

public class SetLocale {
    public Locale setLanguage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the country: ");
        String country = scanner.nextLine();
        System.out.println("Select the language: ");
        String language = scanner.nextLine();
        Locale locale = new Locale(country, language);
        ResourceBundle line = ResourceBundle.getBundle("Messages", locale);
        System.out.println(line.getString("locale.set"));
        return locale;
    }
}
