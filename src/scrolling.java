import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class scrolling extends Base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver = Capabilities();
        androidDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"))");
    }
}
