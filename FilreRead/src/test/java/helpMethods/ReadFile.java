package helpMethods;

import java.util.ArrayList;

public class ReadFile {

    private String wayToTheFile;
    private  ArrayList<String> listOFWebSites;

    ReadFile(){
        wayToTheFile = "SCR_Files/websites.txt";
    }
    ReadFile(String wayToTheFile){
        this.wayToTheFile = wayToTheFile;
    }

    public void setWayToTheFile(String wayToTheFile) {
        this.wayToTheFile = wayToTheFile;
    }

    public String getWayToTheFile() {
        return wayToTheFile;
    }

    public ArrayList<String> getListOFWebSites() {
        return listOFWebSites;
    }

    public void readFileAndWriteToList(){
        
    }
}
