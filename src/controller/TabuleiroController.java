/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JPanel;
import model.Bispo;
import model.Campo;
import model.Cavalo;
import model.Peao;
import model.Rainha;
import model.Rei;
import model.Tabuleiro;
import model.Torre;

/**
 *
 * @author yosh
 */
public class TabuleiroController {

    private Tabuleiro tabuleiro;

    public TabuleiroController(JPanel painel, int x, int y, int tamanho) {
        this.tabuleiro = new Tabuleiro(painel, x, y, tamanho);
        organizarPecas();
    }

    public Campo[][] getTabuleiro() {
        return this.tabuleiro.getTabuleiro();
    }

    public Tabuleiro getTabuleiroInfo() {
        return this.tabuleiro;
    }

    protected void organizarPecas() {

        //Peoes
        for (int i = 1; i <= 8; i++) {
            this.tabuleiro.getTabuleiro()[i][2].setPeca(new Peao("peao", "preto"));
            this.tabuleiro.getTabuleiro()[i][7].setPeca(new Peao("peao", "branco"));
        }

        //cavalos
        this.tabuleiro.getTabuleiro()[2][1].setPeca(new Cavalo("cavalo", "preto"));
        this.tabuleiro.getTabuleiro()[7][1].setPeca(new Cavalo("cavalo", "preto"));

        this.tabuleiro.getTabuleiro()[2][8].setPeca(new Cavalo("cavalo", "branco"));
        this.tabuleiro.getTabuleiro()[7][8].setPeca(new Cavalo("cavalo", "branco"));

        //torres
        this.tabuleiro.getTabuleiro()[8][1].setPeca(new Torre("torre", "preto"));
        this.tabuleiro.getTabuleiro()[1][1].setPeca(new Torre("torre", "preto"));

        this.tabuleiro.getTabuleiro()[1][8].setPeca(new Torre("torre", "branco"));
        this.tabuleiro.getTabuleiro()[8][8].setPeca(new Torre("torre", "branco"));

        //bispos
        this.tabuleiro.getTabuleiro()[3][1].setPeca(new Bispo("bispo", "preto"));
        this.tabuleiro.getTabuleiro()[6][1].setPeca(new Bispo("bispo", "preto"));

        this.tabuleiro.getTabuleiro()[3][8].setPeca(new Bispo("bispo", "branco"));
        this.tabuleiro.getTabuleiro()[6][8].setPeca(new Bispo("bispo", "branco"));
        
        //rei
        this.tabuleiro.getTabuleiro()[5][1].setPeca(new Rei("rei", "preto"));
        this.tabuleiro.getTabuleiro()[5][8].setPeca(new Rei("rei", "branco"));
        
        //raina
        this.tabuleiro.getTabuleiro()[4][1].setPeca(new Rainha("rainha", "preto"));
        this.tabuleiro.getTabuleiro()[4][8].setPeca(new Rainha("rainha", "branco"));

        this.getTabuleiroInfo().repintar();
    }

}
