/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author edseeraan
 */
public class ErrorManager {
    
    public static void catchError(String errorMsg) {
    JOptionPane.showMessageDialog(new JFrame(), errorMsg, "Error",
        JOptionPane.ERROR_MESSAGE);
    }
    public static void catchSuccess(String successMsg) {
    JOptionPane.showMessageDialog(new JFrame(), successMsg, "Success",
        JOptionPane.INFORMATION_MESSAGE);
    }
}
