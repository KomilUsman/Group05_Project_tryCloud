package java.com.Trycloud.utilities;

public class BrowserUtil {

    public static void waitFor(int seconds){

        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
