package helpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.ArrayList;

public class StartFinishFixture {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static ReadFile fl;
    public static ArrayList<String> webSitesList;

    @BeforeClass
    public void startFixture() {

    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 15);
    fl = new ReadFile();
    webSitesList = new ArrayList<String>(fl.getListOFWebSites());

    }

    @AfterClass
    public void finishFixture(){
        driver.quit();
    }
}
