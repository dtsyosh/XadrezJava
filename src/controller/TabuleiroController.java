/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import model.Tabuleiro;

/**
 *
 * @author yosh
 */
public class TabuleiroController {
    private Tabuleiro tabuleiro;
    
    public TabuleiroController(JFrame frame, int x, int y, int tamanho) {
        this.tabuleiro = new Tabuleiro(frame, x, y, tamanho);
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
   
    
}