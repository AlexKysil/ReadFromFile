package helpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.ArrayList;

public class StartFinishFixture {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static ReadFile FileList;
    public static ArrayList<String> webSitesList;

    @BeforeTest
    public void startFixture() {

    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 15);
    FileList = new ReadFile();
    FileList.readFileAndWriteToList();
    webSitesList = new ArrayList<String>(FileList.getListOFWebSites());

    }

    @AfterTest
    public void finishFixture(){
        driver.quit();
    }
}
