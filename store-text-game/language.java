import java.util.Locale;
import java.util.ResourceBundle;


public class language {
    private static ResourceBundle text;

    public static void setLanguage(String lang) {
        if (lang.equalsIgnoreCase("pt")){
            text = ResourceBundle.getBundle("text", Locale.forLanguageTag("pt-BR"));
        }
        else{
            text = ResourceBundle.getBundle("text", Locale.forLanguageTag("en-US"));
        }
    }

    public static String get(String key) {
        return text.getString(key);
    }
}
