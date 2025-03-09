package phquartin.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("good.morning"));
        ResourceBundle bundlept = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundlept.getString("good.morning"));
        System.out.println(bundlept.getString("banana"));
    }
}
