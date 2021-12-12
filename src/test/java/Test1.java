import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.ITest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

public class Test1 {


    public static void main(String[] args) throws MalformedURLException {
        System.out.println("Hello World!");
        test1();
    }

    public static void test1() throws MalformedURLException {
        DesiredCapabilities caps =  new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.APPLICATION_NAME,"IntegrationAPP");
        caps.setCapability(MobileCapabilityType.APP,"Users//saketsingh//Desktop//iOS_Apps_AUT//IntegrationApp.app");
        //caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Test1");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 13");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"15.0");
        //caps.setCapability(MobileCapabilityType.BROWSER_NAME,"safari");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        IOSDriver iosDriver = new IOSDriver(url,caps);

        //iosDriver.get("https://facebook.com");
        iosDriver.findElementByIosClassChain("**/XCUIElementTypeStaticText[`label == \"Scrolling\"`]").click();
        iosDriver.findElementByIosClassChain("**/XCUIElementTypeStaticText[`label == \"ScrollView\"`]").click();
        List<WebElement> lstEle = iosDriver.findElementsByIosClassChain("**/XCUIElementTypeStaticText");
        System.out.println("Elements Count: " + lstEle.size());
        /*for(WebElement ele: lstEle){
        }
        */
        //Scrolling up and down within Element
       // RemoteWebElement element = (RemoteWebElement)iosDriver.findElementByIosClassChain("**/XCUIElementTypeScrollView[`name == \"scrollView\"`]");
        /*String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID); // Only for ‘scroll in element’
        scrollObject.put("direction", "down");
        iosDriver.executeScript("mobile:scroll", scrollObject);
        iosDriver.executeScript("mobile:scroll", scrollObject);
        iosDriver.executeScript("mobile:scroll", scrollObject);
        iosDriver.executeScript("mobile:scroll", scrollObject);
        iosDriver.executeScript("mobile:scroll", scrollObject);
        scrollObject.put("direction", "up");
        iosDriver.executeScript("mobile:scroll", scrollObject);
        iosDriver.executeScript("mobile:scroll", scrollObject);
        iosDriver.executeScript("mobile:scroll", scrollObject);
        iosDriver.executeScript("mobile:scroll", scrollObject);
        iosDriver.executeScript("mobile:scroll", scrollObject);*/

        //Scrolling up and down by Screen

        HashMap<String, String> scrollObjectByScreen = new HashMap<String, String>();
        scrollObjectByScreen.put("direction","down");
        iosDriver.executeScript("mobile:scroll", scrollObjectByScreen);
        scrollObjectByScreen.put("direction", "up");
        iosDriver.executeScript("mobile:scroll", scrollObjectByScreen);


    }

}
