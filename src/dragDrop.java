import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class dragDrop extends Base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver = Capabilities();
        androidDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        androidDriver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
        //Drag and Drop
        WebElement source = androidDriver.findElementByXPath("//android.view.View[@index='1']");
        WebElement dest = androidDriver.findElementByXPath("//android.view.View[@index='2']");
        TouchAction touchAction = new TouchAction(androidDriver);
        touchAction.longPress(element(source)).moveTo(element(dest)).release().perform();
    }
}
