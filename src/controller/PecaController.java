/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Campo;
import model.Peca;

/**
 *
 * @author nadson.silva
 */
public class PecaController {
    
    
    
    public void movimento (Peca p,Campo[][] tabuleiro, int linha, int coluna) {
        p.movimento(p,tabuleiro,linha,coluna);
    }

    public void movimento(Peca peca, int linha, int coluna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
