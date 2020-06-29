
package AmazonWeb;
import org.openqa.selenium.remote.DesiredCapabilities;

import AmazonWeb.Constant;


public class AndroidSetupUtility {

	public static DesiredCapabilities getDesiredCapabilities(){
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(Constant.DEVICE_NAME,Constant.MY_PHONE );
		caps.setCapability(Constant.UD_ID, Constant.PHONE_ID); //Give Device ID of your mobile phone
		caps.setCapability(Constant.PLATFORM_NAME, Constant.ANDROID);
		caps.setCapability(Constant.PLATFORM_VERSION,Constant.VERSION);
		caps.setCapability(Constant.APP_PACKAGE, Constant.APP_PACKAGE_PATH);
		caps.setCapability(Constant.APP_ACTIVITY, Constant.APP_ACTIVITY_PATH);
		caps.setCapability(Constant.NO_RESET, Constant.TRUE);
		caps.setCapability(Constant.AUTO_ACCEPT_ALERTS,Constant.TRUE);
		return caps;

	}


}
