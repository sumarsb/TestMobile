package AmazonWeb;

public class Constant {
	
    public static final String URL = "http://0.0.0.0:4723/wd/hub";
    public static final String USER_DIR = "user.dir";
    public static final String USER_SCROLL = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "continue" + "\").instance(0))";
    public static final String USER_CARE = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "Talk to us at:" + "\").instance(0))";

    // TODO Conflict
    public static final String SCROLL_CONTINUE = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "Continue" + "\").instance(0))";
    public static final String TWPR99CYMFQKOVYL = "TWPR99CYMFQKOVYL";
    public static final String ADB_DEVICES = "adb devices";
    public static final String SCROLL_TALK_TO_US_AT = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "Talk to us at:" + "\").instance(0))";


    public static final String SCROLL_PHYSICS_CHAPTER = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "VIDEO_TITLE" + "\").instance(0))";
    public static final String SCROLL_MATH_CHAPTER = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "The p-Block Elements" + "\").instance(0))";
    public static final String VIDEO_IMAGE = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "videimage"+ "\").instance(0))";
    public static final String DEVICE_NAME = "deviceName";
    public static final String MY_PHONE = "My Phone";
    public static final String UD_ID = "udid";
    public static final String PHONE_ID = "V8YPHEJZQGGY45SS";
    public static final String PLATFORM_NAME = "platformName";
    public static final String ANDROID = "Android";
    public static final String PLATFORM_VERSION = "platformVersion";
    public static final String VERSION = "7.0";
    public static final String APP_PACKAGE = "appPackage";
    public static final String APP_PACKAGE_PATH = "com.pnn.ionic.scholarswing";
    public static final String APP_ACTIVITY = "appActivity";
    public static final String APP_ACTIVITY_PATH = "com.pnn.ionic.scholarswing.authmodule.SplashActivity";
    public static final String NO_RESET = "noReset";
    public static final String TRUE = "true";
    public static final String AUTO_ACCEPT_ALERTS = "autoAcceptAlerts";
	
	public static final String GECK_DRIVER = "webdriver.gecko.driver";
	public static final String GECK_PATH = "C:\\All_Extract_File\\geckodriver.exe";
	public static final String BASE_URL = "https://www.amazon.in/";
	public static final String CONFIG_PROPERTY = "src\\AmazonWeb\\Config.properties";
	public static final String SIGNIN_ARROW = "Signin_arrow";
	public static final String MOBILE_NUMBER = "Mobile_number";
	public static final String CONTINUE ="Continue";
	public static final String PASSWORD ="Password";
	public static final String OTP ="Send_Otp";
	public static final String LOGIN = "Login";
	public static final String OTP_CONTINUE ="Otp_Continue";
	public static final String FIRST_CART ="First_cart";
	public static final String SEARCH_BOX = "sSearchBox";
	public static final String CART_ITEM_01 = "Cart_item1";
	public static final String ADD_CART_BUTTON = "Add_cart_button";
	public static final String CART_ITEM_02 = "Cart_itam2";
	public static final String SEARCH_RESULT = "sSearchResult";
	public static final String SEARCH_BRANDNAME="sShirtBrandName";
	public static final String ADD_TO_CART= "sAddToCart";
	public static final String VIEW_CART_PATH = "sViewCartXPath";
	public static final String SUBMIT_AFTER_CART = "submit";
}
