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
    private Peca peca;
    
    public Campo(String cor) {
        this.cor = cor;
        this.peca = null;
    }

}
