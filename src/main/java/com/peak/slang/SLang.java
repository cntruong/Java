/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.peak.slang;
import Libs.*;

import java.util.ArrayList;
import java.util.HashMap;


import Libs.FuncSupport;

import java.util.ArrayList;

import java.util.HashMap;


/**
 *
 * @author TRUONG
 */
public class SLang  {

    public static void main(String[] args) {
        // TODO code application logic here
        CardLayout cl = new CardLayout();
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
               FuncSupport slangFunction = new FuncSupport();
               HashMap<String, ArrayList<String>> SlangWordList = slangFunction.getSlangWordList();
               cl.createAndShowGUI(SlangWordList);
            }
        });
    }
}
