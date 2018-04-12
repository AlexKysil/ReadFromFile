package code;


import helpMethods.StartFinishFixture;
import org.testng.annotations.Test;

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
    }
}
