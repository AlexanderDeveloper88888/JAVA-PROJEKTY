import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester {
    public static void main(String[] args) {
        System.out.println("siema");

        System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Selenium\\Drivers\\FirefoxDriver\\Latest\\geckodriver.exe");
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        System.out.println("Launching Firefox...");
        System.exit(0);

    }
}
