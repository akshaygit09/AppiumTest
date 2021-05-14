package BrowserTesting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class browse extends chromeBase{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> androidDriver = Capabilities();
        androidDriver.get("https://www.google.co.in");
        Thread.sleep(5000);
        androidDriver.findElementByName("q").sendKeys("My First Appium Mobile Browser Test");

    }
}
