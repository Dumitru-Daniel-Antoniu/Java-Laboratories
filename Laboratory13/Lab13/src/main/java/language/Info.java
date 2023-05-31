package language;

import java.text.DateFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import java.util.ResourceBundle;

public class Info {
    public void information(Locale locale) {
        ResourceBundle line = ResourceBundle.getBundle("Messages", locale);
        System.out.println(line.getString("info"));
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Language: " + locale.getLanguage());
        Currency currency = Currency.getInstance(locale);
        System.out.println("Currency: " + currency.getDisplayName(locale));
        DateFormatSymbols dates = new DateFormatSymbols(locale);
        System.out.println("Week Days: " + dates.getWeekdays());
        System.out.println("Months: " + dates.getMonths());
        System.out.println("Today: " + dates.getZoneStrings());
    }
}
