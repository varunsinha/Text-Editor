/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditorr;

import javax.swing.JFrame;

/**
 *
 * @author varun
 */
public class TextEditorr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TextEditorFrame frame = new TextEditorFrame();
    frame.setTitle("NOTEPAD");
    //frame.setUndecorated(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
    frame.setLocationRelativeTo(null);
    frame.setVisible(true); // TODO code application logic here
    }
    
}
