/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Tabuleiro;

/**
 *
 * @author yosh
 */
public class TabuleiroController {
    private Tabuleiro tabuleiro;
    
    public TabuleiroController() {
        this.tabuleiro = new Tabuleiro();
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
   
    
}
