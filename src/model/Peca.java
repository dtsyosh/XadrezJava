/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
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

    public Peca(String cor, String figura) throws IOException {
        this.cor = cor;
        this.figura = figura;
        this.imagem = ImageIO.read(getClass().getResource("/imagens/" + this.figura + this.cor + ".png"));
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
    
    
}
