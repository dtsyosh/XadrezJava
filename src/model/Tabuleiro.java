/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author yosh
 */
public class Tabuleiro {

    private Campo tabuleiro[][];
    private int x;
    private int y;
    private int tamanho;

    public Tabuleiro(JPanel painel, int x, int y, int tamanho) {
        this.tabuleiro = new Campo[9][9];
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        criarTabuleiro(painel, x, y, tamanho);
    }

    
    public int getTamanho() {
        return tamanho;
    }

    /* Cores:
    Selecionado - C2C045 ~ 194 192 69
    Branco - F1EEBD ~ 241 238 189
    Preto - AC865A ~ 172 134 90
     */
    public void setTamanho(int tamanho) {    
        this.tamanho = tamanho;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Campo[][] getTabuleiro() {
        return tabuleiro;
    }

    public void criarTabuleiro(JPanel painel, int x, int y, int tamanho) {
        int auxLinha, auxColuna;

        //Variáveis auxiliares que indicam a linha e a coluna do bloco
        auxLinha = auxColuna = 1;
        //Variaveis que indicam o ponto inicial de onde o tabuleiro deve ser criado

        for (int linha = 0; linha < tamanho * 8; linha += tamanho) {
            for (int coluna = 0; coluna < tamanho * 8; coluna += tamanho) {
                if (auxLinha % 2 == 0) {   //Se a linha for impar, primeiro campo é preto
                    this.tabuleiro[auxLinha][auxColuna] = new Campo("preto");
                    //Define tamanho dos blocos e sua localização
                    this.tabuleiro[auxLinha][auxColuna].setBounds(coluna + x, linha + y, tamanho, tamanho);

                    painel.add(this.tabuleiro[auxLinha][auxColuna]);
                } else {
                    this.tabuleiro[auxLinha][auxColuna] = new Campo("branco");
                    this.tabuleiro[auxLinha][auxColuna].setBounds(coluna + x, linha + y, tamanho, tamanho);

                    painel.add(this.tabuleiro[auxLinha][auxColuna]);
                }
                auxColuna++;
            }
            auxColuna = 1;
            auxLinha++;
        }
        painel.repaint();
    }
    
    public void repintar() {
        for(int i = 1; i <= 8; i++)
            for(int j = 1; j <= 8; j++)
                this.tabuleiro[i][j].repaint();
    }
}
