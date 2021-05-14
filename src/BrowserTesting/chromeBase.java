package BrowserTesting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class chromeBase {
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("chromedriverExecutable","C:/Users/akshay.bhatia/Downloads/Appium/chromedriver.exe");
       // cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PixelA");
        //adb devices- Unauthorized
        //adb kill-server
        //adb start-server
        //adb devices
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        AndroidDriver<AndroidElement> androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver;

    }

}
