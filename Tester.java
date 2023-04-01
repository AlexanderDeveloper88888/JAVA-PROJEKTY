import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;
import java.io.IOException;


public class Tester {
    public static WebDriver driver;
    public static File srcFile;
    public static int screenNumber = 1;
    private static Object FirefoxDriver;

    public static void main(String[] args) throws IOException, Exception {

        System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Selenium\\Drivers\\FirefoxDriver\\Latest\\geckodriver.exe");
        FirefoxDriver = new FireforDriver();
        driver = new FirefoxDriver();
        driver.get("https://www.wse.edu.pl");

        System.out.println("Launching Firefox...");
        Screenshot("C:\\Testowanie1\\src\\screenshots");

        Thread.sleep(5000);
        driver.quit();
        System.exit(0);

    }




    private static void Screenshot(String screenShotPath) {
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(screenShotPath + File.separator + "Image" + screenNumber + ".png"));
        System.out.println("Screenshotted: " + new File(screenShotPath + File.separator + "Image" + screenNumber + ".png"));
        screenNumber = screenNumber + 1;

        }





}
