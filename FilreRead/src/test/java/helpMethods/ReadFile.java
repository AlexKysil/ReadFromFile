package helpMethods;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {

    private String wayToTheFile;
    private static ArrayList<String> listOFWebSites;

    public ReadFile(){
        String path = new File("").getAbsolutePath();
        wayToTheFile = path + "\\FilreRead\\src\\test\\java\\SCR_Files\\websites.txt";
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

    public void readFileAndWriteToList() {
    FileInputStream fis = null;
    try{
        fis = new FileInputStream(wayToTheFile);
    }catch(FileNotFoundException e) {
        e.printStackTrace();
    }

    byte[] content = new byte[0];
    try{
        content = new byte[fis.available()];
    }catch(IOException e){
        e.printStackTrace();
    }
    try{
        fis.read(content);
    }catch(IOException e){
        e.printStackTrace();
    }

    try{
        fis.close();
    }catch(IOException e){
        e.printStackTrace();
    }

    String[] lines = new String[0];
    try{
        lines = new String(content,"Cp1251").split("\n");
    }catch (UnsupportedEncodingException e){
        e.printStackTrace();
    }
        
    }
}
