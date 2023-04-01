
package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main
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
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Screenshot(screenShotPath);
//		scroll to informatyka stosowana
		javascriptSc-
				 roll(By.xpath("//*[@id=\"main\"]/section[2]/div/section/div/div[2]/div/div[1]/div/p[9]"));
		System.out.println("Scrolled to informatyka stosowana...");
		Screenshot(screenShotPath);
		Thread.sleep(1000);
//		scroll to wynik rekrutacji
		javascriptScroll(By.xpath("/html/body/main/div/div/h2"));
		System.out.println("Scrolled warunki rekrutacji...");
		Screenshot(screenShotPath);
		Thread.sleep(1000);
//		scroll to 2.Kontakt
		javascriptScroll(By.xpath("/html/body/footer/div/div[3]/div"));
		System.out.println("Scrolled to 2.Kontakt...");
		Screenshot(screenShotPath);
		Thread.sleep(1000);
// opłata dla studia
		javascriptScroll(By.xpath("/html/body/main/section[2]/div/section/div/div[2]/div/div[3]/div[1]/ul[1]/li[1]/a/span[1]"));
		waitandClick("#main > section.bg-square.subbanner > div > section > div > div.content.pos-shead > div > div.tb-11.aside-grey > div.bl-cont.bg-red > ul.multi-list-dark > li:nth-child(1) > a > span.h5");
		Screenshot(screenShotPath);
		Thread.sleep(1000);

//BGŻ
		javascriptScroll(By.xpath("/html/body/main/section[2]/div/div[3]"));
		System.out.println("BGŻ");
		Screenshot(screenShotPath);
		Thread.sleep(1000);
// terminy opłat
		javascriptScroll(By.xpath("/html/body/main/div/div/h2"));
		System.out.println("Terminy opłat");
		Screenshot(screenShotPath);
		Thread.sleep(1000);
		waitandClick("#main > section:nth-child(6) > div > div > div:nth-child(1) > div.fl-header > span");
		System.out.println("Rozwiń 2021");
		Screenshot(screenShotPath);
		Thread.sleep(1000);
		waitandClick("#main > section:nth-child(6) > div > div > div:nth-child(2) > div.fl-header > span");
		System.out.println("Rozwiń 2019");
		Screenshot(screenShotPath);
		Thread.sleep(1000);
//kandydat zniszki na studia
		javascriptScroll(By.xpath("/html/body/header/div/div[1]/nav/ul/li[3]/a"));
		waitandClick("#header > div > div.menu > nav > ul > li:nth-child(3) > a");
		javascriptScroll(By.xpath("/html/body/main/section[2]/div/section/div/div[2]/div/div[3]/div[1]/ul[1]/li[2]/a/span[1]"));
		waitandClick("#main > section.bg-square.subbanner > div > section > div > div.content.pos-shead > div > div.tb-11.aside-grey > div.bl-cont.bg-red > ul.multi-list-dark > li:nth-child(2) > a > span.h5");
		Screenshot(screenShotPath);
		Thread.sleep(1000);
//zniżki
		javascriptScroll(By.xpath("/html/body/main/section[2]/div/div[2]/h2"));
		waitandClick("#main > section:nth-child(3) > div > div > div:nth-child(1) > div.fl-header > span");
		System.out.println("Rozwiń Studia I stopnia");
		Screenshot(screenShotPath);
		Thread.sleep(1000);


		waitandClick("#main > section:nth-child(3) > div > div > div:nth-child(2) > div.fl-header > span");
		System.out.println("Rozwiń Studia II stopnia");
		Screenshot(screenShotPath);
		Thread.sleep(1000);


		waitandClick("#main > section:nth-child(3) > div > div > div:nth-child(3) > div.fl-header > span");
		System.out.println("Rozwiń Studiuj za 0zł");
		Screenshot(screenShotPath);
		Thread.sleep(1000);

		javascriptScroll(By.xpath("/html/body/main/section[3]/div/div/div[4]/div[1]/div"));
		waitandClick("#main > section:nth-child(3) > div > div > div:nth-child(4) > div.fl-header > span");
		System.out.println("Rozwiń Studiuj za 50% ceny");
		Screenshot(screenShotPath);
		Thread.sleep(1000);

		javascriptScroll(By.xpath("/html/body/header/div/div[1]/nav/ul/li[3]/div/div[2]/ul[1]/li[1]/a"));
		waitandClick("#header > div > div.menu > nav > ul > li:nth-child(3) > div > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a");
		Screenshot(screenShotPath);
		Thread.sleep(1000);

		javascriptScroll(By.xpath("/html/body/footer/div/div[3]/ul/li[1]/a"));
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