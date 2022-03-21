package mainFrame;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import panelsPackage.PanelAccountant;
import panelsPackage.PanelLogin;
import panelsPackage.PanelSalesManager;
import panelsPackage.PanelAdminstrator;
import panelsPackage.PanelSalesManager;

public class MainFrame {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        JFrame f = new JFrame("test");
        f.setSize(1000, 800);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        CardLayout layout = new CardLayout();
        JPanel mainPanel = new JPanel(layout);
        
        mainPanel.add(new PanelSalesManager());
        //mainPanel.add(new PanelAccountant());
        
        f.add(mainPanel);
        f.setVisible(true);
    }
    
}
