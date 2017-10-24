/*
 * creates error or success alert forms
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
