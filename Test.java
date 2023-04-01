
package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test
{
    public static WebDriver driver;
    public static File scrFile;
    public static int screenNumber = 1;

    public static void main(String[] args) throws IOException, Exception
    {
        String screenShotPath = System.getProperty("user.dir") + File.separator + "Screenshots";
        System.out.println("screenShotPath: " + screenShotPath);
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Student\\Desktop\\zajecia JS\\chrome\\Latest\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Launching Chrome...");
        driver.manage().window().maximize();
        driver.get("https://www.wse.edu.pl/");

        driver.get("https://www.wse.edu.pl/");
//		Close the popup
        waitandClick("#rolnictwo > span");
        System.out.println("Closed the popup...");
//		O dla kandydata
        waitandClick("#header > div > div.menu > nav > ul > li:nth-child(3)");
        System.out.println("Clicked on WSE...");
//		Close cookies alert
        waitandClick("#cookies > div > div");
        System.out.println("Closed cookies alert...");



    }

    public static void waitandClick(String css)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
        driver.findElement(By.cssSelector(css)).click();
    }

    public static void waitandClickBy(By by)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public static void javascriptScroll(By by) {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement element = driver.findElement(by);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void Screenshot(String screenShotPath) throws IOException
    {
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(screenShotPath + File.separator + "Image" + screenNumber + ".png"));
        System.out.println("Screenshotted: " + new File(screenShotPath + File.separator + "Image" + screenNumber + ".png"));
        screenNumber = screenNumber + 1;
    }
}