import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Selenium\\Drivers\\FirefoxDriver\\Latest\\geckodriver.exe");
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        var waiter = new WebDriverWait(firefoxDriver, 20);

        firefoxDriver.get("https://site-qa.medable.com/language-selection");

        waiter.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[class='Button__StyledButton-sc-1dam8sj-0 kydCAm styled__StyledButton-atctz6-1 jPtrxb']")));

        firefoxDriver.findElement(By.cssSelector("button[class='Button__StyledButton-sc-1dam8sj-0 kydCAm styled__StyledButton-atctz6-1 jPtrxb'")).click();

        waiter.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul[class='Pane-f5qdl0-0 List-lcmqwp-0 styled__StyledOptions-atctz6-2 jaYBqb']")));

        var list = firefoxDriver.findElement(By.cssSelector("ul[class='Pane-f5qdl0-0 List-lcmqwp-0 styled__StyledOptions-atctz6-2 jaYBqb']"));

        // iterate list
        for (int i = 0; i < list.findElements(By.tagName("li")).size(); i++) {
            var lang = list.findElements(By.tagName("div")).get(i).getText();
            if (lang.contains("Polish")) {
                list.findElements(By.tagName("div")).get(i).click();
                break;
            }
        }

        Thread.sleep(1000);
        firefoxDriver.findElement(By.cssSelector("button[class='Button__StyledButton-sc-1dam8sj-0 iUdmgX LanguageSelection__StyledButton-dmt3po-0 feNNQw'")).click();

        waiter.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[class='Input__StyledInput-sc-1k4zbij-1 dNzQJr']")));
        firefoxDriver.findElement(By.cssSelector("input[class='Input__StyledInput-sc-1k4zbij-1 dNzQJr']")).sendKeys("may22_pii_lqe_org");
        firefoxDriver.findElement(By.cssSelector("button[class='Button__StyledButton-sc-1dam8sj-0 wFtP preAuthScreenStyles__StyledFormAction-l7rpwv-1 jeKgwu'")).click();

        System.out.println("Launching Firefox...");
        System.exit(0);
    }
}
