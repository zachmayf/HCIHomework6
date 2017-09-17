/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;

import javax.swing.JFrame;

/**
 *
 * @author zachmayfield
 */
public class Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame f = new JFrame("Homework 6");
        Interface p = new Interface();
        f.add(p);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    
}
