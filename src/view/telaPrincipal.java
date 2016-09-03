/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PecaController;
import controller.TabuleiroController;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author yosh
 */
public class telaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Tabuleiro
     */
    TabuleiroController tabuleiroController;
    JPanel [][] tabuleiroFundo;
    PecaController pecaController;
    
    public telaPrincipal() {
        initComponents();
        getContentPane().setBackground(Color.gray);

        tabuleiroFundo = new JPanel[9][9];

        painelDirSup.setBackground(new Color(241, 238, 189));
        painelEsqInf.setBackground(new Color(241, 238, 189));
        painelDirInf.setBackground(new Color(172, 134, 90));
        painelEsqSup.setBackground(new Color(172, 134, 90));
        listHistorico.setBackground(new Color(241, 238, 189));

        tabuleiroController = new TabuleiroController(painelTabuleiro, 1, 1, 60);
        painelTabuleiro.setBackground(new Color(0, 0, 0, 0));
        pintarTabuleiroFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEsqInf = new javax.swing.JPanel();
        lblPecasCapBranco = new javax.swing.JLabel();
        lblJogador1 = new javax.swing.JLabel();
        btnDesistirJ1 = new javax.swing.JButton();
        lblBispoPreto = new javax.swing.JLabel();
        lblPeaoPreto = new javax.swing.JLabel();
        lblTorrePreto = new javax.swing.JLabel();
        lblRainhaPreto = new javax.swing.JLabel();
        lblCavaloPreto = new javax.swing.JLabel();
        lblNPeaoPreto = new javax.swing.JLabel();
        lblNCavaloPreto = new javax.swing.JLabel();
        lblNBispoPreto = new javax.swing.JLabel();
        lblNRainhaPreto = new javax.swing.JLabel();
        lblNTorrePreto = new javax.swing.JLabel();
        painelDirSup = new javax.swing.JPanel();
        lblPecasCapPreto = new javax.swing.JLabel();
        lblJogador2 = new javax.swing.JLabel();
        btnDesistirJ2 = new javax.swing.JButton();
        lblNRainhaBranco = new javax.swing.JLabel();
        lblNTorreBranco = new javax.swing.JLabel();
        lblTorreBranco = new javax.swing.JLabel();
        lblRainhaBranco = new javax.swing.JLabel();
        lblPeaoBranco = new javax.swing.JLabel();
        lblNPeaoBranco = new javax.swing.JLabel();
        lblCavaloBranco = new javax.swing.JLabel();
        lblNCavaloBranco = new javax.swing.JLabel();
        lblNBispoBranco = new javax.swing.JLabel();
        lblBispoBranco = new javax.swing.JLabel();
        painelTabuleiro = new javax.swing.JPanel();
        painelEsqSup = new javax.swing.JPanel();
        btnNovoJogo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        painelDirInf = new javax.swing.JPanel();
        lblHistorico = new javax.swing.JLabel();
        spHistorico = new javax.swing.JScrollPane();
        listHistorico = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xadrez");
        setResizable(false);
        setSize(new java.awt.Dimension(970, 520));

        painelEsqInf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelEsqInf.setForeground(new java.awt.Color(238, 238, 238));
        painelEsqInf.setPreferredSize(new java.awt.Dimension(226, 573));

        lblPecasCapBranco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPecasCapBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPecasCapBranco.setText("Peças Capturadas");

        lblJogador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador1.setText("Jogador 1");

        btnDesistirJ1.setText("Desistir");

        lblBispoPreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bispopreto.png"))); // NOI18N
        lblBispoPreto.setText("p");

        lblPeaoPreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peaopreto.png"))); // NOI18N
        lblPeaoPreto.setText("p");

        lblTorrePreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/torrepreto.png"))); // NOI18N

        lblRainhaPreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rainhapreto.png"))); // NOI18N

        lblCavaloPreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cavalopreto.png"))); // NOI18N
        lblCavaloPreto.setText("p");

        lblNPeaoPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNPeaoPreto.setText("0");

        lblNCavaloPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNCavaloPreto.setText("0");

        lblNBispoPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNBispoPreto.setText("0");

        lblNRainhaPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNRainhaPreto.setText("0");

        lblNTorrePreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNTorrePreto.setText("0");

        javax.swing.GroupLayout painelEsqInfLayout = new javax.swing.GroupLayout(painelEsqInf);
        painelEsqInf.setLayout(painelEsqInfLayout);
        painelEsqInfLayout.setHorizontalGroup(
            painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJogador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelEsqInfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDesistirJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(lblPecasCapBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEsqInfLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEsqInfLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNTorrePreto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNRainhaPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEsqInfLayout.createSequentialGroup()
                        .addGroup(painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTorrePreto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblPeaoPreto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelEsqInfLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNPeaoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEsqInfLayout.createSequentialGroup()
                                .addComponent(lblCavaloPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBispoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRainhaPreto)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEsqInfLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNCavaloPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNBispoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        painelEsqInfLayout.setVerticalGroup(
            painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEsqInfLayout.createSequentialGroup()
                .addComponent(lblJogador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDesistirJ1)
                .addGap(18, 18, 18)
                .addComponent(lblPecasCapBranco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBispoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCavaloPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeaoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNPeaoPreto)
                    .addComponent(lblNCavaloPreto)
                    .addComponent(lblNBispoPreto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRainhaPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTorrePreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(painelEsqInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNTorrePreto)
                    .addComponent(lblNRainhaPreto))
                .addGap(12, 12, 12))
        );

        painelDirSup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelDirSup.setPreferredSize(new java.awt.Dimension(226, 226));

        lblPecasCapPreto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPecasCapPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPecasCapPreto.setText("Peças Capturadas");

        lblJogador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador2.setText("Jogador 2");

        btnDesistirJ2.setText("Desistir");

        lblNRainhaBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNRainhaBranco.setText("0");

        lblNTorreBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNTorreBranco.setText("0");

        lblTorreBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/torrebranco.png"))); // NOI18N

        lblRainhaBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rainhabranco.png"))); // NOI18N

        lblPeaoBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peaobranco.png"))); // NOI18N

        lblNPeaoBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNPeaoBranco.setText("0");

        lblCavaloBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cavalobranco.png"))); // NOI18N
        lblCavaloBranco.setText("p");

        lblNCavaloBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNCavaloBranco.setText("0");

        lblNBispoBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNBispoBranco.setText("0");

        lblBispoBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bispobranco.png"))); // NOI18N
        lblBispoBranco.setText("p");

        javax.swing.GroupLayout painelDirSupLayout = new javax.swing.GroupLayout(painelDirSup);
        painelDirSup.setLayout(painelDirSupLayout);
        painelDirSupLayout.setHorizontalGroup(
            painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJogador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDirSupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDirSupLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNTorreBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNRainhaBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDirSupLayout.createSequentialGroup()
                        .addGroup(painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTorreBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblPeaoBranco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDirSupLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNPeaoBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDirSupLayout.createSequentialGroup()
                                .addComponent(lblCavaloBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBispoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRainhaBranco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDirSupLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNCavaloBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNBispoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
            .addGroup(painelDirSupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPecasCapPreto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDesistirJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDirSupLayout.setVerticalGroup(
            painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDirSupLayout.createSequentialGroup()
                .addComponent(lblJogador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDesistirJ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPecasCapPreto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBispoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCavaloBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeaoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNPeaoBranco)
                    .addComponent(lblNCavaloBranco)
                    .addComponent(lblNBispoBranco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRainhaBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTorreBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(painelDirSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNTorreBranco)
                    .addComponent(lblNRainhaBranco))
                .addGap(17, 17, 17))
        );

        painelTabuleiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelTabuleiro.setPreferredSize(new java.awt.Dimension(482, 482));
        painelTabuleiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelTabuleiroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelTabuleiroLayout = new javax.swing.GroupLayout(painelTabuleiro);
        painelTabuleiro.setLayout(painelTabuleiroLayout);
        painelTabuleiroLayout.setHorizontalGroup(
            painelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        painelTabuleiroLayout.setVerticalGroup(
            painelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        painelEsqSup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNovoJogo.setText("Novo Jogo");

        jButton1.setText("Sair");

        jButton2.setText("Sobre");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemLogo.png"))); // NOI18N

        javax.swing.GroupLayout painelEsqSupLayout = new javax.swing.GroupLayout(painelEsqSup);
        painelEsqSup.setLayout(painelEsqSupLayout);
        painelEsqSupLayout.setHorizontalGroup(
            painelEsqSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelEsqSupLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelEsqSupLayout.setVerticalGroup(
            painelEsqSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsqSupLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovoJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        painelDirInf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHistorico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorico.setText("Histórico de Jogadas");

        listHistorico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        spHistorico.setViewportView(listHistorico);

        javax.swing.GroupLayout painelDirInfLayout = new javax.swing.GroupLayout(painelDirInf);
        painelDirInf.setLayout(painelDirInfLayout);
        painelDirInfLayout.setHorizontalGroup(
            painelDirInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDirInfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDirInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spHistorico))
                .addContainerGap())
        );
        painelDirInfLayout.setVerticalGroup(
            painelDirInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDirInfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spHistorico)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelEsqInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEsqSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(painelTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelDirSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDirInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelEsqSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEsqInf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(painelDirSup, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDirInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painelTabuleiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void painelTabuleiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelTabuleiroMouseClicked
        int tabX = tabuleiroController.getTabuleiroInfo().getX();   //Coordenada de criação do tabuleiro
        int tabY = tabuleiroController.getTabuleiroInfo().getY();   //Coordenada de criação do tabuleiro
        int x = evt.getX();
        int y = evt.getY();
        int tamanho = tabuleiroController.getTabuleiroInfo().getTamanho();

        int coluna = ((x - tabX) / tamanho) + 1;    //Pega a coluna clicada
        int linha = ((y - tabY) / tamanho) + 1;     //Pega a linha clicada
        
        pecaController.movimento(tabuleiroController.getTabuleiro()[linha][coluna].getPeca(),linha,coluna);
        
        System.out.printf("matriz[%d][%d]\n", linha, coluna);
    }//GEN-LAST:event_painelTabuleiroMouseClicked

    private void pintarTabuleiroFrame() {
        int auxLinha, auxColuna;
        int tamanho = 60;
        int x, y;

        //Variáveis auxiliares que indicam a linha e a coluna do bloco
        auxLinha = auxColuna = 1;
        //Variaveis que indicam o ponto inicial de onde o tabuleiro deve ser criado
        x = 239;
        y = 6;
        for (int linha = 0; linha < tamanho * 8; linha += tamanho) {
            for (int coluna = 0; coluna < tamanho * 8; coluna += tamanho) {
                tabuleiroFundo[auxLinha][auxColuna] = new JPanel();
                if (auxLinha % 2 == 0) {   //Se a linha for impar, primeiro campo é preto
                    //Define tamanho dos blocos e sua localização
                    tabuleiroFundo[auxLinha][auxColuna].setBounds(linha + x, coluna + y, tamanho, tamanho);
                    if (auxColuna % 2 == 0) {
                        tabuleiroFundo[auxLinha][auxColuna].setBackground(new Color(241, 238, 189));
                    } else {
                        tabuleiroFundo[auxLinha][auxColuna].setBackground(new Color(172, 134, 90));
                    }

                    add(tabuleiroFundo[auxLinha][auxColuna]);
                } else {
                    tabuleiroFundo[auxLinha][auxColuna].setBounds(linha + x, coluna + y, tamanho, tamanho);
                    if (auxColuna % 2 == 0) {
                        tabuleiroFundo[auxLinha][auxColuna].setBackground(new Color(172, 134, 90));
                    } else {
                        tabuleiroFundo[auxLinha][auxColuna].setBackground(new Color(241, 238, 189));
                    }
                    
                    add(tabuleiroFundo[auxLinha][auxColuna]);
                }
                auxColuna++;
            }
            auxColuna = 1;
            auxLinha++;
        }
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesistirJ1;
    private javax.swing.JButton btnDesistirJ2;
    private javax.swing.JButton btnNovoJogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBispoBranco;
    private javax.swing.JLabel lblBispoPreto;
    private javax.swing.JLabel lblCavaloBranco;
    private javax.swing.JLabel lblCavaloPreto;
    private javax.swing.JLabel lblHistorico;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblNBispoBranco;
    private javax.swing.JLabel lblNBispoPreto;
    private javax.swing.JLabel lblNCavaloBranco;
    private javax.swing.JLabel lblNCavaloPreto;
    private javax.swing.JLabel lblNPeaoBranco;
    private javax.swing.JLabel lblNPeaoPreto;
    private javax.swing.JLabel lblNRainhaBranco;
    private javax.swing.JLabel lblNRainhaPreto;
    private javax.swing.JLabel lblNTorreBranco;
    private javax.swing.JLabel lblNTorrePreto;
    private javax.swing.JLabel lblPeaoBranco;
    private javax.swing.JLabel lblPeaoPreto;
    private javax.swing.JLabel lblPecasCapBranco;
    private javax.swing.JLabel lblPecasCapPreto;
    private javax.swing.JLabel lblRainhaBranco;
    private javax.swing.JLabel lblRainhaPreto;
    private javax.swing.JLabel lblTorreBranco;
    private javax.swing.JLabel lblTorrePreto;
    private javax.swing.JList<String> listHistorico;
    private javax.swing.JPanel painelDirInf;
    private javax.swing.JPanel painelDirSup;
    private javax.swing.JPanel painelEsqInf;
    private javax.swing.JPanel painelEsqSup;
    private javax.swing.JPanel painelTabuleiro;
    private javax.swing.JScrollPane spHistorico;
    // End of variables declaration//GEN-END:variables
}
