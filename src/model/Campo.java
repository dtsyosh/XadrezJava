package model;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author yosh
 */
public class Campo extends JPanel {
    private String cor;
    private Peca peca;
    
    public Campo(String cor) {
        this.cor = cor;
        this.peca = null;
        setSize(60,60);
        setBackground(new Color(0,0,0,0));
    }

}
