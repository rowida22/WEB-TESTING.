/* Passing Invalid email & password TC_02_LOGIN  */
package TestLogin;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02_LOGIN {
  public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to("https://www.facebook.com/");

    driver.findElement(By.id("email")).sendKeys("lila@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("blahblah234");
    driver.findElement(By.name("login")).click();

    File Simg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(Simg, new File("I:\\Test2\\Test2\\ScreenShots\\img2.png"));

    driver.quit();

  }

}
