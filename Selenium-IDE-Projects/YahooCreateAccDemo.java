// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class YahooCreateAccTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void yahooCreateAcc() {
    driver.get("https://login.yahoo.com/account/create");
    driver.manage().window().setSize(new Dimension(1440, 790));
    driver.findElement(By.id("usernamereg-firstName")).click();
    driver.findElement(By.id("usernamereg-firstName")).sendKeys("Akshay");
    driver.findElement(By.id("usernamereg-lastName")).click();
    driver.findElement(By.id("usernamereg-lastName")).sendKeys("Rajput");
    driver.findElement(By.id("usernamereg-userId")).click();
    driver.findElement(By.id("usernamereg-userId")).sendKeys("akshaythegreat77");
    driver.findElement(By.id("usernamereg-password")).click();
    driver.findElement(By.id("usernamereg-password")).sendKeys("123490");
    {
      WebElement element = driver.findElement(By.id("usernamereg-birthYear"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("regform"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("regform")).click();
    driver.findElement(By.id("usernamereg-password")).click();
    driver.findElement(By.id("usernamereg-password")).sendKeys("123490rt");
    driver.findElement(By.id("usernamereg-birthYear")).click();
    driver.findElement(By.id("usernamereg-birthYear")).sendKeys("2001");
    driver.findElement(By.id("reg-submit-button")).click();
    driver.findElement(By.id("usernamereg-phone")).click();
    driver.findElement(By.id("usernamereg-phone")).click();
    driver.findElement(By.cssSelector(".login-bg-outer")).click();
    driver.findElement(By.id("usernamereg-phone")).click();
    driver.findElement(By.id("usernamereg-phone")).sendKeys("78893003030");
  }
}