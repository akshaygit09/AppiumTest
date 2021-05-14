import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Basics extends Base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver = Capabilities();
        androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        androidDriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        androidDriver.findElementByClassName("android.widget.CheckBox").click();
        androidDriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        androidDriver.findElementById("android:id/edit").sendKeys("My First Appium TestCase");
        androidDriver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
