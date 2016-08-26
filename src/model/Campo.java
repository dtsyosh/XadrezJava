package model;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author yosh
 */
public class Campo extends JPanel {
    private String cor;
    
    public Campo(String cor) {
        this.cor = cor;
        this.setBounds(0, 0, 70, 70);
        this.setBackground(Color.black);
    }

}
