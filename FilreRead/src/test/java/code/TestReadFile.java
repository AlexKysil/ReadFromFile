package code;


import helpMethods.StartFinishFixture;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestReadFile extends StartFinishFixture {

    @Test
    public void checkListLinks(){
        for(String sUrl : webSitesList){
            if(!sUrl.contains(".")){
                webSitesList.remove(sUrl);
            }else {
                System.out.println(sUrl);
            }
        }
        System.out.println();
    }

    @Test
    public void checkSitesForXpath() {
        HashMap<String, String> Xpathmap = new HashMap<String, String>();

        for(String sUrl : webSitesList){
            driver.navigate().to(sUrl);
            ArrayList<WebElement> inputElements = new ArrayList<WebElement> (driver.findElements(By.xpath("//input")));

            for(WebElement element : inputElements){
                if(!element.isDisplayed()){
                    continue;
                }else{
                    if(!element.isEnabled()){
                        continue;
                    }else{
                        String xPath = "//input[@type='" + element.getAttribute("type") + "']";
                        Xpathmap.put(xPath, sUrl);
                    }
                }
            }
        }

        for(Map.Entry<String, String> entry : Xpathmap.entrySet()){
            driver.navigate().to(entry.getValue());
            driver.findElement(By.xpath(entry.getKey()));
        }
    }
}
