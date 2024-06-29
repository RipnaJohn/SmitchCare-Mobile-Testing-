package HybridApp;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HybridApplication.HybridCapablities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

//Static import for long Press
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
//Static import for elemnet
import static io.appium.java_client.touch.offset.ElementOption.element;
//Static import for time
import static java.time.Duration.ofSeconds;

public class SmitchCare extends HybridCapablities{
	
	 AndroidDriver<AndroidElement> driver;
		
		@BeforeTest
		public void bt() throws MalformedURLException {
			driver = capabilities();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		}
		
		
		@Test (enabled = true)
		
		public void general() throws InterruptedException {
			
			driver.findElement(MobileBy.id("com.mysmitch.care:id/btnJoin")).click();
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView[2]/android.view.ViewGroup")).click();
			
			driver.findElement(MobileBy.className("android.widget.ProgressBar")).click();
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[1]/android.widget.TextView[3]")).click();
		
			driver.findElement(MobileBy.id("com.mysmitch.care:id/llBreakFast")).click();
		   
			driver.findElement(MobileBy.id("com.mysmitch.care:id/chipThree")).click();
			
			driver.findElement(MobileBy.className("androidx.cardview.widget.CardView")).click();
			
			driver.findElements(MobileBy.className("androidx.cardview.widget.CardView")).get(4).click();
			
			driver.findElement(MobileBy.xpath("//android.widget.SeekBar[@content-desc=\"Value, 13.04\"]")).click();
			
			//driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/androidx.cardview.widget.CardView")).click();
//			TouchAction touchAction = new TouchAction(driver);
//			touchAction.press(PointOption.point(0, 1000))
//			           .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//			           .moveTo(PointOption.point(0, 40))
//			           .release()
//			           .perform(); 
//			
//			driver.findElements(MobileBy.className("androidx.cardview.widget.CardView")).get(8).click();
//			
//			TouchAction touchAction2 = new TouchAction(driver);
//			touchAction.press(PointOption.point(0, 1000))
//			           .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//			           .moveTo(PointOption.point(0, 40))
//			           .release()
//			           .perform(); 
			
		}

		
			
	
	

}
