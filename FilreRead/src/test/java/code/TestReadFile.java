package code;


import helpMethods.StartFinishFixture;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestReadFile extends StartFinishFixture {

    // This method checks the list of link if they have dot, and if they don`t it delete it from the list
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

    // This method checks available links, openes them on browser, and find all inputs
    // then check if inputs visible and enable and display them
    @Test
    public void checkSitesForXpath() {
        HashMap<String, String> Xpathmap = new HashMap<String, String>();


        // finds all inputs,
        for(String sUrl : webSitesList){
            driver.navigate().to(sUrl);
            ArrayList<WebElement> inputElements = new ArrayList<WebElement> (driver.findElements(By.xpath("//input")));

            // checks if input is visibble and enable
            for(WebElement element : inputElements){
                if(!element.isDisplayed()){
                    continue;
                }else{
                    if(!element.isEnabled()){
                        continue;
                    }else{
                        String xPath = "//input[@type='" + element.getAttribute("type") + "']"; //creates the xpath for correct input
                        Xpathmap.put(xPath, sUrl);                                                 // puts the xpath for correct input and site to hashmap
                    }
                }
            }
        }
                // this method displays the list of correct xpathes and site where they located
        for(Map.Entry<String, String> entry : Xpathmap.entrySet()){
            System.out.println("Website: " + entry.getValue() + "\n" + "has next input: " + entry.getKey());
        }
        System.out.println();
    }


    // this is test for parcing website`s title
    @Test
    public void checkWebSiteTitle() throws IOException {
        HashMap<String, String> titlesMap = new HashMap<String, String>();

            for(String sUrl : webSitesList){
                Document doc = Jsoup.connect(sUrl).get();
                titlesMap.put(doc.title(), sUrl);
            }

            for(Map.Entry<String, String> entry : titlesMap.entrySet()){
                System.out.println("Website: " + entry.getValue() + "\n" + "Has next title: " + entry.getKey());
            }
            System.out.println();
    }
}
