package HybridApplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridCapablities {
	
	 public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
			
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "RMX1851");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mysmitch.care");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mysmitch.care.ui.main.home.modules.explore.invite.InvitationActivity");
			dc.setCapability(MobileCapabilityType.NO_RESET, true);		
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			return driver;

	}

}
