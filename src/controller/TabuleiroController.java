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
            this.tabuleiro.getTabuleiro()[2][i].setPeca(new Peao("peao", "preto"));
            this.tabuleiro.getTabuleiro()[7][i].setPeca(new Peao("peao", "branco"));
        }

        //cavalos
        this.tabuleiro.getTabuleiro()[1][2].setPeca(new Cavalo("cavalo", "preto"));
        this.tabuleiro.getTabuleiro()[1][7].setPeca(new Cavalo("cavalo", "preto"));

        this.tabuleiro.getTabuleiro()[8][2].setPeca(new Cavalo("cavalo", "branco"));
        this.tabuleiro.getTabuleiro()[8][7].setPeca(new Cavalo("cavalo", "branco"));

        //torres
        this.tabuleiro.getTabuleiro()[1][8].setPeca(new Torre("torre", "preto"));
        this.tabuleiro.getTabuleiro()[1][1].setPeca(new Torre("torre", "preto"));

        this.tabuleiro.getTabuleiro()[8][1].setPeca(new Torre("torre", "branco"));
        this.tabuleiro.getTabuleiro()[8][8].setPeca(new Torre("torre", "branco"));

        //bispos
        this.tabuleiro.getTabuleiro()[1][3].setPeca(new Bispo("bispo", "preto"));
        this.tabuleiro.getTabuleiro()[1][6].setPeca(new Bispo("bispo", "preto"));

        this.tabuleiro.getTabuleiro()[8][3].setPeca(new Bispo("bispo", "branco"));
        this.tabuleiro.getTabuleiro()[8][6].setPeca(new Bispo("bispo", "branco"));
        
        //rei
        this.tabuleiro.getTabuleiro()[1][5].setPeca(new Rei("rei", "preto"));
        this.tabuleiro.getTabuleiro()[8][5].setPeca(new Rei("rei", "branco"));
        
        //raina
        this.tabuleiro.getTabuleiro()[1][4].setPeca(new Rainha("rainha", "preto"));
        this.tabuleiro.getTabuleiro()[8][4].setPeca(new Rainha("rainha", "branco"));

        this.getTabuleiroInfo().repintar();
    }

}
