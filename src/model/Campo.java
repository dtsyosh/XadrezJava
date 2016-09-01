package model;

import java.awt.BorderLayout;
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
        setLayout(new BorderLayout());
        setSize(60,60);
        setBackground(new Color(0,0,0,0));
    }

    public Campo() {
        
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    @Override
    protected void paintComponent(Graphics g) {
        try{
            g.drawImage(this.peca.getImagem(), 0, 0, null);
        } catch(NullPointerException e){}
    }
    
    
}
