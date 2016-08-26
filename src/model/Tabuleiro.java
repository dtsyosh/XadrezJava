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

    private JPanel tabuleiro[][];

    public Tabuleiro() {
        this.tabuleiro = new JPanel[9][9];
    }

    /* Cores:
        Selecionado - C2C045 ~ 194 192 69
        Branco - F1EEBD ~ 241 238 189
        Preto - AC865A ~ 172 134 90
     */
    public void criarTabuleiro(JFrame frame, int x, int y, int tamanho) {
        int auxLinha, auxColuna;

        //Variáveis auxiliares que indicam a linha e a coluna do bloco
        auxLinha = auxColuna = 1;
        //Variaveis que indicam o ponto inicial de onde o tabuleiro deve ser criado
        x = y = 50;
        for (int linha = 0; linha < tamanho * 8; linha += tamanho) {
            for (int coluna = 0; coluna < tamanho * 8; coluna += tamanho) {
                if (auxLinha % 2 == 0) {   //Se a linha for impar, primeiro campo é preto
                    tabuleiro[auxLinha][auxColuna] = new Campo("preto");
                    //Define tamanho dos blocos e sua localização
                    tabuleiro[auxLinha][auxColuna].setBounds(linha + x, coluna + y, tamanho, tamanho);
                    if (auxColuna % 2 == 0) {
                        tabuleiro[auxLinha][auxColuna].setBackground(new Color(241, 238, 189));
                    } else {
                        tabuleiro[auxLinha][auxColuna].setBackground(new Color(172, 134, 90));
                    }
                    frame.add(tabuleiro[auxLinha][auxColuna]);
                } else {
                    tabuleiro[auxLinha][auxColuna] = new Campo("branco");
                    tabuleiro[auxLinha][auxColuna].setBounds(linha + x, coluna + y, tamanho, tamanho);
                    if (auxColuna % 2 == 0) {
                        tabuleiro[auxLinha][auxColuna].setBackground(new Color(172, 134, 90));
                    } else {
                        tabuleiro[auxLinha][auxColuna].setBackground(new Color(241, 238, 189));
                    }
                    frame.add(tabuleiro[auxLinha][auxColuna]);
                }
                auxColuna++;
            }
            auxColuna = 1;
            auxLinha++;
        }
        frame.repaint();
    }
}
