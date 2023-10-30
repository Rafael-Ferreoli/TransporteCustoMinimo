/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class FrHome extends javax.swing.JFrame {

    private int numeroSelecionadoDemandas;
    private int numeroSelecionadoOfertas;
    private int[] oferta;
    private int[] demanda;
    private int[][] matrizCustos;

    /**
     * Creates new form FrHome
     */
    public FrHome() {
        initComponents();
        btnDemandas.setEnabled(false);
        btnValoresOfertas.setEnabled(false);
        btnValoresDemandas.setEnabled(false);
        btnPreencherCustos.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnOfertas = new javax.swing.JButton();
        btnDemandas = new javax.swing.JButton();
        labelQtdOfertas = new javax.swing.JLabel();
        labelQtdDemandas = new javax.swing.JLabel();
        btnValoresOfertas = new javax.swing.JButton();
        btnValoresDemandas = new javax.swing.JButton();
        labelValoresOfertas = new javax.swing.JLabel();
        labelValoresDemandas = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaResultados = new javax.swing.JTextArea();
        btnPreencherCustos = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÉTODO DO CANTO NOROESTE");

        btnOfertas.setText("Nº OFERTAS");
        btnOfertas.setMaximumSize(new java.awt.Dimension(111, 23));
        btnOfertas.setMinimumSize(new java.awt.Dimension(111, 23));
        btnOfertas.setPreferredSize(new java.awt.Dimension(111, 23));
        btnOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasActionPerformed(evt);
            }
        });

        btnDemandas.setText("Nº DEMANDAS");
        btnDemandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemandasActionPerformed(evt);
            }
        });

        labelQtdOfertas.setBackground(new java.awt.Color(0, 0, 0));
        labelQtdOfertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdOfertas.setText("0");
        labelQtdOfertas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelQtdDemandas.setBackground(new java.awt.Color(0, 0, 0));
        labelQtdDemandas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdDemandas.setText("0");
        labelQtdDemandas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnValoresOfertas.setText("VALORES OFERTAS");
        btnValoresOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValoresOfertasActionPerformed(evt);
            }
        });

        btnValoresDemandas.setText("VALORES DEMANDAS");
        btnValoresDemandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValoresDemandasActionPerformed(evt);
            }
        });

        labelValoresOfertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValoresOfertas.setText("0");
        labelValoresOfertas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelValoresDemandas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValoresDemandas.setText("0");
        labelValoresDemandas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextAreaResultados.setColumns(20);
        jTextAreaResultados.setRows(5);
        jScrollPane2.setViewportView(jTextAreaResultados);

        btnPreencherCustos.setText("PREENCHER CUSTOS");
        btnPreencherCustos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherCustosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDemandas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelQtdDemandas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelQtdOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnValoresOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnValoresDemandas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelValoresDemandas, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(labelValoresOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPreencherCustos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQtdOfertas)
                    .addComponent(btnValoresOfertas)
                    .addComponent(labelValoresOfertas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdDemandas)
                    .addComponent(btnDemandas)
                    .addComponent(btnValoresDemandas)
                    .addComponent(labelValoresDemandas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPreencherCustos)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executarAlocacao() {
        int somaOfertas = 0, somaDemandas = 0;
        for (int i = 0; i < numeroSelecionadoOfertas; i++) {
            somaOfertas += oferta[i];
        }
        for (int i = 0; i < numeroSelecionadoDemandas; i++) {
            somaDemandas += demanda[i];
        }

        if (somaOfertas == somaDemandas) {
            int[][] matrizAlocacao = new int[numeroSelecionadoOfertas][numeroSelecionadoDemandas];
            int i = 0; // Índice da oferta
            int j = 0; // Índice da demanda

            jTextAreaResultados.setText(""); // Limpa o JTextArea
            jTextAreaResultados.append("PROBLEMA BALANCEADO " + somaOfertas + " = " + somaDemandas + "\n\n");

            jTextAreaResultados.append("MATRIZ DE CUSTOS:\n\n");
            for (int z = 0; z < numeroSelecionadoOfertas; z++) {
                for (int x = 0; x < numeroSelecionadoDemandas; x++) {
                    jTextAreaResultados.append(" | " + matrizCustos[z][x]);
                }
                jTextAreaResultados.append(" |");
                jTextAreaResultados.append("\n"); // Pule para a próxima linha após cada linha da matriz
            }
            jTextAreaResultados.append("\n");
            // Loop para alocar ofertas às demandas
            while (i < numeroSelecionadoOfertas && j < numeroSelecionadoDemandas) {
                // Determine a quantidade alocada com base nas ofertas e demandas disponíveis
                int quantidadeAlocada = Math.min(oferta[i], demanda[j]);

                // Atualize as matrizes de oferta e demanda
                oferta[i] -= quantidadeAlocada;
                demanda[j] -= quantidadeAlocada;

                // Atualize a matriz de alocação com a quantidade alocada
                matrizAlocacao[i][j] = quantidadeAlocada;

                // Adicione as informações ao JTextArea
                String resultado = "ALOCANDO " + quantidadeAlocada + " DA OFERTA ÍNDICE " + i + " ATÉ A DEMANDA " + j;
                jTextAreaResultados.append(resultado + "\n");

                // Verifique se todas as ofertas da posição atual foram alocadas
                if (oferta[i] == 0) {
                    i++; // Mova-se para a próxima oferta
                }

                // Verifique se todas as demandas da posição atual foram atendidas
                if (demanda[j] == 0) {
                    j++; // Mova-se para a próxima demanda
                }
            }

            List<Integer> resultadoMultiplicacao = new ArrayList<>(); // Faz a multiplicação de todos custos pela matriz alocada
            for (int z = 0; z < numeroSelecionadoOfertas; z++) {
                for (int x = 0; x < numeroSelecionadoDemandas; x++) {
                    int valorA = matrizAlocacao[z][x];
                    int valorB = matrizCustos[z][x];
                    int resultado = valorA * valorB;
                    resultadoMultiplicacao.add(resultado);
                }
            }

            // Imprima a matriz de alocação no JTextArea
            jTextAreaResultados.append("\nMATRIZ DE ALOCAÇÃO FINAL:\n\n");
            for (i = 0; i < numeroSelecionadoOfertas; i++) {
                for (j = 0; j < numeroSelecionadoDemandas; j++) {
                    jTextAreaResultados.append(" | " + matrizAlocacao[i][j]);
                }
                jTextAreaResultados.append(" |");
                jTextAreaResultados.append("\n"); // Pule para a próxima linha após cada linha da matriz
            }
            jTextAreaResultados.append("\n");
            int somaLista = 0;
            jTextAreaResultados.append("SOMA DO CUSTO TOTAL: \n\n");
            for (int resultado : resultadoMultiplicacao) {
                jTextAreaResultados.append("" + resultado + " + ");
                somaLista += resultado;
            }
            jTextAreaResultados.append(" = " + somaLista);
        } else {
            jTextAreaResultados.append("O PROBLEMA NÃO ESTÁ BALANCEADO " + somaOfertas + " != " + somaDemandas);
        }
    }


    private void btnOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasActionPerformed
        // Crie um array de strings com números de 1 a 100
        String[] opcoes = new String[100];
        for (int i = 1; i <= 100; i++) {
            opcoes[i - 1] = Integer.toString(i);
        }

        // Crie o JComboBox com base no array de opções
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        // Exiba um diálogo de opção que contém o JComboBox e um botão "OK"
        int resultado = JOptionPane.showOptionDialog(
                this, // Componente pai (ou null)
                comboBox, // O JComboBox
                "ESCOLHA A QUANTIDADE DE OFERTAS", // Título do diálogo
                JOptionPane.OK_CANCEL_OPTION, // Tipo de opção (botão OK)
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensagem
                null, // Ícone personalizado (ou null)
                null, // Opções personalizadas (ou null)
                null // Opção padrão (ou null)
        );

        // Verifique se o usuário escolheu "OK" e obtenha o valor selecionado
        if (resultado == JOptionPane.OK_OPTION) {
            String opcaoSelecionada = (String) comboBox.getSelectedItem();
            numeroSelecionadoOfertas = Integer.parseInt(opcaoSelecionada);
            btnOfertas.setEnabled(false);
            String numeroComoString = Integer.toString(numeroSelecionadoOfertas);
            labelQtdOfertas.setText(numeroComoString);
            btnValoresOfertas.setEnabled(true);
        }
    }//GEN-LAST:event_btnOfertasActionPerformed

    private void btnDemandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemandasActionPerformed
        // Crie um array de strings com números de 1 a 100
        String[] opcoes = new String[100];
        for (int i = 1; i <= 100; i++) {
            opcoes[i - 1] = Integer.toString(i);
        }

        // Crie o JComboBox com base no array de opções
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        // Exiba um diálogo de opção que contém o JComboBox e um botão "OK"
        int resultado = JOptionPane.showOptionDialog(
                this, // Componente pai (ou null)
                comboBox, // O JComboBox
                "ESCOLHA A QUANTIDADE DE DEMANDAS", // Título do diálogo
                JOptionPane.OK_CANCEL_OPTION, // Tipo de opção (botão OK)
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensagem
                null, // Ícone personalizado (ou null)
                null, // Opções personalizadas (ou null)
                null // Opção padrão (ou null)
        );

        // Verifique se o usuário escolheu "OK" e obtenha o valor selecionado
        if (resultado == JOptionPane.OK_OPTION) {
            String opcaoSelecionada = (String) comboBox.getSelectedItem();
            numeroSelecionadoDemandas = Integer.parseInt(opcaoSelecionada);
            btnDemandas.setEnabled(false);
            String numeroComoString = Integer.toString(numeroSelecionadoDemandas);
            labelQtdDemandas.setText(numeroComoString);
            btnValoresDemandas.setEnabled(true);
            btnDemandas.setEnabled(false);
        }
    }//GEN-LAST:event_btnDemandasActionPerformed

    private void btnValoresOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValoresOfertasActionPerformed
        int numOfertas = numeroSelecionadoOfertas;

        oferta = new int[numeroSelecionadoOfertas];

        for (int i = 0; i < numOfertas; i++) {
            String numeroOferta = JOptionPane.showInputDialog("DIGITE A OFERTA " + (i + 1) + ":");
            oferta[i] = Integer.parseInt(numeroOferta);
        }

        btnValoresOfertas.setEnabled(false);
        btnDemandas.setEnabled(true);
        // Crie uma string com os valores do array separados por vírgula
        StringBuilder ofertaText = new StringBuilder();
        for (int i = 0; i < numeroSelecionadoOfertas; i++) {
            ofertaText.append(oferta[i]);
            if (i < numeroSelecionadoOfertas - 1) {
                ofertaText.append(", "); // Adicione uma vírgula e um espaço, exceto para o último valor
            }
        }

        // Defina a string como o texto do JLabel
        labelValoresOfertas.setText(ofertaText.toString());
    }//GEN-LAST:event_btnValoresOfertasActionPerformed

    private void btnValoresDemandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValoresDemandasActionPerformed
        int numOfertas = numeroSelecionadoDemandas;

        demanda = new int[numeroSelecionadoDemandas];

        for (int i = 0; i < numOfertas; i++) {
            String numeroOferta = JOptionPane.showInputDialog("DIGITE A DEMANDA " + (i + 1) + ":");
            demanda[i] = Integer.parseInt(numeroOferta);
        }

        btnValoresDemandas.setEnabled(false);
        // Crie uma string com os valores do array separados por vírgula
        StringBuilder demandaText = new StringBuilder();
        for (int i = 0; i < numeroSelecionadoDemandas; i++) {
            demandaText.append(demanda[i]);
            if (i < numeroSelecionadoDemandas - 1) {
                demandaText.append(", "); // Adicione uma vírgula e um espaço, exceto para o último valor
            }
        }

        // Defina a string como o texto do JLabel
        labelValoresDemandas.setText(demandaText.toString());
        btnPreencherCustos.setEnabled(true);
    }//GEN-LAST:event_btnValoresDemandasActionPerformed

    private void btnPreencherCustosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherCustosActionPerformed
        matrizCustos = new int[numeroSelecionadoOfertas][numeroSelecionadoDemandas];
        for (int i = 0; i < numeroSelecionadoOfertas; i++) {
            for (int j = 0; j < numeroSelecionadoDemandas; j++) {
                String numeroOferta = JOptionPane.showInputDialog("DIGITE O CUSTO: " + i + " , " + j);
                matrizCustos[i][j] = Integer.parseInt(numeroOferta);
            }
        }
        executarAlocacao();
    }//GEN-LAST:event_btnPreencherCustosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDemandas;
    private javax.swing.JButton btnOfertas;
    private javax.swing.JButton btnPreencherCustos;
    private javax.swing.JButton btnValoresDemandas;
    private javax.swing.JButton btnValoresOfertas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaResultados;
    private javax.swing.JLabel labelQtdDemandas;
    private javax.swing.JLabel labelQtdOfertas;
    private javax.swing.JLabel labelValoresDemandas;
    private javax.swing.JLabel labelValoresOfertas;
    // End of variables declaration//GEN-END:variables
}
