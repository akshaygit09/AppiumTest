import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

public class swipeAction extends Base{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver = Capabilities();
        androidDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        androidDriver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        androidDriver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        androidDriver.findElementByXPath("//*[@content-desc='9']").click();
        //swipe Gesture
        WebElement first = androidDriver.findElementByXPath("//*[@content-desc='15']");
        WebElement second = androidDriver.findElementByXPath("//*[@content-desc='45']");
        TouchAction touchAction = new TouchAction(androidDriver);
        touchAction.longPress(longPressOptions().withElement(element(first)).
                withDuration(Duration.ofSeconds(2))).moveTo(element(second)).release().perform();





    }
}
