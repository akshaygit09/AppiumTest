import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

    File f = new File("src");
    File fPath = new File(f,"ApiDemos-debug.apk");

    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PixelA");
    //cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
    cap.setCapability(MobileCapabilityType.APP,fPath.getAbsolutePath());
    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
    AndroidDriver<AndroidElement> androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return androidDriver;

    }

}
