import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by xt-user1 on 8/5/17.
 */
public class Login {
    public static WebDriver driver;

    public  static  void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "/Users/xt-user1/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http:10.136.124.50:3000");
        driver.findElement(By.id("link-to-login")).click();
        System.out.println("site is up running");
        driver.findElement(By.id("spree_user_email")).sendKeys("xt@xt1.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("123456789");
        driver.findElement(By.name("commit")).click();

        driver.quit();


    }

}
