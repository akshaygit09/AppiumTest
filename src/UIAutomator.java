import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UIAutomator extends Base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver = Capabilities();
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        androidDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        System.out.println(androidDriver.findElementsByAndroidUIAutomator("clickable(false)").size());
        System.out.println(androidDriver.findElementsByAndroidUIAutomator("clickable(true)").size());

    }

}
