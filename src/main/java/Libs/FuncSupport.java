/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author TRUONG
 */
public class FuncSupport {
    private HashMap<String, ArrayList<String>> slangWords;
    private FuncRAED FuncRAED; 
    
    public FuncSupport(){
        FuncRAED = new FuncRAED();
        slangWords = FuncRAED.read();
        System.out.println("Đây");
        Set<String> keySet = slangWords.keySet();
        System.out.println("Gọi danh sách các từ" );
        for (String key : keySet) {
            System.out.println(key + " " + slangWords.get(key));
        }
        System.out.println("Đã gọi xong");
    }
    
    public HashMap<String, ArrayList<String>> getSlangWordList(){
        return slangWords;
    }
    
    public void CreateNewSlang(HashMap<String, ArrayList<String>> sl){
        FuncRAED.createNewSlang(sl);
    }
    public void save(HashMap<String, ArrayList<String>> sl){
        FuncRAED.save(sl);
    }
    
    public void reset(){
        FuncRAED.copyFile();
        FuncRAED.read();
    }
}
