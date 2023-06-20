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
//    public SLang()
//    {
//        setLayout(new BorderLayout());
//        JButton btnSearch =new JButton("Tìm");
//        btnSearch.setPreferredSize(new Dimension(120,25));
//        add(btnSearch,BorderLayout.CENTER);
//        JPanel pTop =new JPanel();
//        pTop.setLayout(new BoxLayout(pTop,BoxLayout.LINE_AXIS));
//        JButton btnTest =new JButton("Test");
//        pTop.add(btnTest);
//        add(pTop,BorderLayout.PAGE_START);
//    }
//    private static void createAndShowGUI(){
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        JFrame frm=new JFrame("Tra từ điển");
//        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        SLang newContentPane =new SLang();
//        newContentPane.setOpaque(true);
//        frm.setContentPane(newContentPane);
//        frm.pack();
//        frm.setVisible(true);
//    }
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
