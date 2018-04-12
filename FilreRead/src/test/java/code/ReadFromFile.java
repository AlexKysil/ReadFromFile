package code;

import helpMethods.ReadFile;
import helpMethods.StartFinishFixture;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import java.io.File;
import java.util.ArrayList;

public class ReadFromFile extends StartFinishFixture{

    @Test
    public void checkWebSitesList() throws InterruptedException {
        for (String s : webSitesList) {
            System.out.println(s);
            Thread.sleep(1000);
            driver.navigate().to(s);
            Thread.sleep(3000);
        }
    }

}
