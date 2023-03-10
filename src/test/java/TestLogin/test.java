package TestLogin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.apache.commons.io.FileUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

    public static void main(String[] args) throws InterruptedException, IOException {
        /*
         * Simple openning & close a site with implicit time
         * 
         */

        WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://google.com/");
        // String firstTab = driver.getWindowHandle(); // Switching
        // driver.navigate().to("https://facebook.com/");

        /*
         * Add Some Action and print it in terminal
         * getURL , print title and other navigation
         */

        // System.out.println(driver.getCurrentUrl());
        // System.out.println(driver.getTitle());

        // driver.navigate().back();
        // Thread.sleep(2000);

        // driver.navigate().forward();
        // Thread.sleep(2000);
        // driver.navigate().refresh();

        /*
         * Swithing to the original tabs
         * open it in new tab or window
         */

        // driver.switchTo().newWindow(WindowType.WINDOW);
        // driver.switchTo().newWindow(WindowType.TAB);
        // driver.switchTo().window(firstTab);

        // driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        // driver.switchTo().frame("packageFrame");
        // driver.findElement(By.linkText("ActiveSession")).click();
        // driver.switchTo().defaultContent();

        // driver.manage().window().getSize().getWidth();
        // driver.manage().window().getSize().getHeight();

        // Dimension size = driver.manage().window().getSize();
        // System.out.println(size.getHeight());
        // System.out.println(size.getWidth());

        // driver.manage().window().setSize(new Dimension(800, 600)); // set new
        // dimension
        // Dimension screen = new Dimension(112, 567);
        // driver.manage().window().setSize(screen);

        /* Get the page source */
        // String PageSource = driver.getPageSource();
        // System.out.println("The Page Source is " + PageSource);

        // driver.manage().window().getPosition().getX();
        // driver.manage().window().getPosition().getY();

        // Point position = driver.manage().window().getPosition();
        // System.out.println(position.getX());
        // System.out.println(position.getY());

        // driver.manage().window().setPosition(new Point(100, 100));
        // driver.manage().window().fullscreen();

        /* Get screenshot for the whole testing */

        // File ScreenShot = ((TakesScreenshot)
        // driver).getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(ScreenShot, new File("./image.png"));

        /* Taking a screenshot for Particular element lnXdpd */

        // WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
        // File ScreenShot2 = element.getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(ScreenShot2, new File("./img2.png"));

        /*
         * finding element using Xpath
         * it also can be find by using console in the inspect => $x("//h1")
         * =>Relative xpath //* or tagName[Add the most specified attribute = 'value of
         * attribute'] => findelement(By.xpath("//h1[@id = 'welcome']"))
         * or //*[contains(@class, 'value')] or //*[text() = 'text Value']
         * =>Absolute xpath //html/body/h1 , //html/body/ul[2]/li[2]
         */

        /*
         * finding element using cssSelector
         * if it id using #id if it className using .classNamein console $( ) and also
         * can use [attribute = value] , if it class inside class
         * By.cssSelector(".Pclass .Childclass")
         * (".classname li:nth-of-type(1)")
         */

        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // WebElement button = driver.findElement(By.name("btnI"));
        // js.executeScript("arguments[0].click();", button);
        // js.executeScript("console.log(' HELLO ')"); // Inspect

        // Thread.sleep(3000);
        // driver.close(); // Close only the last openned tab
        driver.quit(); // Close the entire browser

    }

}
