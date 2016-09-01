/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author yosh
 */
public abstract class Peca {
    private String cor; // preto ou branco
    private int posicao;
    private boolean ativo;
    private boolean movimentada;
    private String figura; // tudo minusculo
    private BufferedImage imagem;

    public Peca(String figura, String cor) {
        this.cor = cor;
        this.figura = figura;
        try {
            this.imagem = ImageIO.read(getClass().getResource("/imagens/" + this.figura + this.cor + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(Peca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    Peca capturarPeça(Peca p, int M[][]) {
        
        return p;
    }
    
    public boolean validarMovimento(JPanel tabuleiro[][], int linha, int coluna){
        
        if (tabuleiro[linha][coluna].getBackground() == new Color (194,192,69,100)) {
            return true;
        }
        else {
            return false;
        }
        
    }

    public BufferedImage getImagem() {
        return imagem;
    }

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }
    
    
    
}
