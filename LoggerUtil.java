package name.here;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerUtil {

	static SimpleDateFormat formatter = new SimpleDateFormat("[HH:mm:ss]");
	static Date date = new Date();
  
    public static void info(Object message) {
        System.out.println(formatter.format(date) + " [Main/INFO]: " + message);
    }

    public static void warning(Object message) {
        System.out.println(formatter.format(date) + " [Main/WARNING]: " + message);
    }

    public static void error(Object message) {
        System.err.println(formatter.format(date) + " [Main/ERROR]: " + message);
    }
  
}
