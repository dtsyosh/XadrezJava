/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JPanel;
import model.Tabuleiro;

/**
 *
 * @author yosh
 */
public class TabuleiroController {
    private Tabuleiro tabuleiro;
    
    public TabuleiroController(JPanel painel, int x, int y, int tamanho) {
        this.tabuleiro = new Tabuleiro(painel, x, y, tamanho);
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
   
    
}
