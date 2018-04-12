package helpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class StartFinishFixture {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeTest
    public void startFixture() {

    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 15);
    }

    @AfterTest
    public void finishFixture(){
        driver.quit();
    }
}
