import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Gestures extends Base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver = Capabilities();
        androidDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        WebElement expandList = androidDriver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        TouchAction touchAction = new TouchAction(androidDriver);
        touchAction.tap(tapOptions().withElement(element( expandList))).perform();
        androidDriver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
        WebElement peopleNames = androidDriver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        touchAction.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(Duration.ofSeconds(2))).release().perform();
        System.out.println(androidDriver.findElementById("android:id/title").isDisplayed());

    }
}
