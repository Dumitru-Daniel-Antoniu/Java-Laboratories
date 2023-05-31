package language;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayLocales {
    public void localeMenu(Locale locale) {
        ResourceBundle line;
        line = ResourceBundle.getBundle("res.Messages", locale);
        System.out.println(line.getString("locales"));
        System.out.println("1.en, US");
        System.out.println("2.ro, RO");
    }
}
