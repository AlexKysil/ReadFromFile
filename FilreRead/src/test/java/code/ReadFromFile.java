package code;

import helpMethods.ReadFile;

import java.io.File;
import java.util.ArrayList;

public class ReadFromFile {
public static void main(String[] args){
    ReadFile firstLook = new ReadFile();

    String[] list = firstLook.readFileAndWriteToList();
    for(String s : list){
        System.out.println(s);
    }



}
}
