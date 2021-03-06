
package congruenciales_mixtos;

import javax.swing.JOptionPane;
/**
 *
 * @author Andres Loria
 */
public class Congruencial_Mixto extends javax.swing.JFrame {

    public Congruencial_Mixto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaSerie = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSeeb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRun = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaPair = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textFieldResut = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        lblFe = new javax.swing.JLabel();
        lblFo1 = new javax.swing.JLabel();
        lblSerieChii = new javax.swing.JLabel();
        lblChi = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaCorridas = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txtZo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtR = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtXr = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtSr = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtH = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAreaSerie.setEditable(false);
        textAreaSerie.setColumns(20);
        textAreaSerie.setRows(5);
        jScrollPane1.setViewportView(textAreaSerie);

        jLabel1.setText("CONGRUENCIALES MIXTOS");

        jLabel2.setText("Serie");

        jLabel3.setText("Constante Multiplicativa a=");

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        jLabel4.setText("Semilla");

        txtSeeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeebActionPerformed(evt);
            }
        });

        jLabel5.setText("Xo=");

        txtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcActionPerformed(evt);
            }
        });

        jLabel6.setText("Constante aditiva");

        jLabel7.setText("c =");

        txtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmActionPerformed(evt);
            }
        });

        jLabel8.setText("Modulo");

        jLabel9.setText("m =");

        jLabel10.setText("Xn-1 = (aXo + c)mod m");

        btnRun.setText("Run");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        jLabel12.setText("n =");

        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });

        textAreaPair.setColumns(20);
        textAreaPair.setRows(5);
        jScrollPane2.setViewportView(textAreaPair);

        textFieldResut.setColumns(20);
        textFieldResut.setRows(5);
        jScrollPane3.setViewportView(textFieldResut);

        textAreaCorridas.setColumns(20);
        textAreaCorridas.setRows(5);
        jScrollPane4.setViewportView(textAreaCorridas);

        txtZo.setEnabled(false);

        jLabel22.setText("n1=");

        txtR.setEnabled(false);

        jLabel23.setText("n2=");

        txtXr.setEnabled(false);
        txtXr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXrActionPerformed(evt);
            }
        });

        jLabel24.setText("R=");

        txtSr.setEnabled(false);

        jLabel25.setText("Xr=");

        txtH.setEnabled(false);

        jLabel26.setText("Sr=");

        jLabel27.setText("H = ");

        jLabel28.setText("Zo = ");

        txtN1.setEnabled(false);
        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });

        txtN2.setEnabled(false);
        txtN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN2ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSeeb, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtXr, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSr, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtH, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtZo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFo1)
                            .addComponent(lblFe)
                            .addComponent(lblSerieChii)
                            .addComponent(lblChi)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12)
                                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addGap(18, 18, 18)
                                .addComponent(lblFo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSerieChii)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblChi)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jTextField1)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSeeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(56, 56, 56)
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtXr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtSr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtZo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(133, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void txtSeebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeebActionPerformed

    private void txtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcActionPerformed

    private void txtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        //Tomamos el control 
        int n = Integer.parseInt(txtn.getText().toString());
        int a = Integer.parseInt(txtA.getText().toString());
        int Xn = Integer.parseInt(txtSeeb.getText().toString());
        int c = Integer.parseInt(txtc.getText().toString());
        int modulo = Integer.parseInt(txtm.getText().toString());
        //Varibles para ejecucion de la formula 
        int count1 = 0, i = 0;//Controla el numero de interacciones del programa
        int residue = 0, limit = 0;
        

        //vectores para presentar los resultados
        int[] vecN = new int[n + 1];//psrs presentar los el numero de casos
        double[] vecXn = new double[n + 1];
        double[] vecXnTotal = new double[n + 1];
        double[] runArray= new double[n+1];//venctor donde se almacenan los resultados

        String print = ""; //concatena los resiltados paa imprimirlos en consola
        boolean estado = false;
        int cont = 0;
        ///matrices
        Double[] matriz;
        Double[] matriza;
        Double[] matrizb;
        int seed = Xn;
 
        while (count1 < n) {//condicional
            limit = Xn;//limit toma el ultimo valor de la semilla
            residue = ((Xn * a) + c) % modulo;
            //System.out.println("re"+residue);
            Xn = residue;//La semilla toma el resultado del la seria para continuar calculado
            vecN[i] = count1;
            vecXn[i] = limit;
           vecXnTotal[i] = Xn;
           runArray[i]=Xn;
            if (vecXnTotal[i] == seed) {
                break;
            }
            count1++;
            i++;
        }
       runTest(runArray);
        //Concatenacion de resultados
        for (int k = 0; k < count1; k++) {
            if (k < 1) {
                print = "n\t" + "Xn\t" + "(aXo +c)/m\t" +"\t"+ "Xn+1\t" + "Numeros Uniformes\n";
                print += vecN[k] + "\t" + vecXn[k] + "\t" + vecXn[k] + " + " + vecXnTotal[k] + "/" + modulo + "\t" + "\t" + vecXnTotal[k] + "\t" + vecXnTotal[k] + "/" + modulo + "\n";
            } else {
                print += vecN[k] + "\t" + vecXn[k] + "\t" + vecXn[k] + " + " + vecXnTotal[k] + "/" + modulo + "\t" + "\t" + vecXnTotal[k] + "\t" + vecXnTotal[k] + "/" + modulo + "\n";
            }
            textAreaSerie.setText(print);
        }

        //Creamos dos vectores y generamos pares por su posicion de la
        matriza = new Double[n - 1];
        matrizb = new Double[n - 1];
        for (int k = 0; k < count1; k++) {
            if (k < count1 - 1) {
                matriza[k] = vecXnTotal[k]/10000;
                matrizb[k] = vecXnTotal[k + 1] / 10000;
            }
           
        }
        String parejas = " ";
        for (int k = 0; k < count1 - 1; k++) {
            parejas += "["+matriza[k]+"]" + "["+ matrizb[k] +"]"+ "\n";
        }
        textAreaPair.setText(parejas);
        //Creamos la matriz la cual se va a calcular el numero de repeticiones 
        //por ahora lo llenamos de ceros
        int[] matrizZ = new int[n-1];
        for (int k = 0; k < 25; k++) {
            matrizZ[k] = 0;
        }

        //Ahora llenamos el numero de repeticiones se ha considerado una matriz
        //de 5*
        
        for (int k = 0; k < n - 1; k++) {
            //nos devuelve la posicion en X
            int x1 = returnPosition(matriza[k]);
            //nos devuelve la posicion en Y
            int y1 = returnPosition(matrizb[k]);
            //nos devuelve la posicion enumerados de 0 a 24 cuadros
            int pos = x1 + y1 * (5);
            //aumentamos un valor de acuerdo a la posicion que se calculo
            matrizZ[pos] += 1;
        }
        String printSerie = "";
        int cont2 = 1;
        for (int k = 0; k < 25; k++) {
            //System.out.println(matrizZ[k]);
            printSerie += cont2 + "[" + matrizZ[k] + "]";
            cont++;
        }
     
        lblFe.setText(printSerie); 
        //System.out.println("seruiii "+ printSerie); 
        

//                    for (int n=0; n<25; n++){
//                        System.out.println(matrizZ[n]); 
//                    }
        //Calculamos el valor de la frecuencia esperada
        double freEsperada = ((double) n - 1) / 25;
        //Calculamos el valor de la frecuencia esperada
        lblFe.setText("Frecuencia Esperada: " + freEsperada);

        //Creamos un vector el cual va a tomar los valores correspondientes
        //al chi cuadrada
        Double[] chiCuadrado = new Double[25];
        String serieChi = "";
        int count3 = 1;
        for (int k = 0; k < 25; k++) {
            chiCuadrado[k] = ((freEsperada - matrizZ[k]) * (freEsperada - matrizZ[k])) / freEsperada;
            serieChi += "" + count3 + " " + chiCuadrado[k] + "\n";
            count3++;
        }
                textFieldResut.setText(serieChi);

//                    for (int n=0; n<25; n++){
//                        chiCuadrado[n]=((freEsperada-matrizZ[n])*(freEsperada-matrizZ[n]))/freEsperada;
//                    }
        //Realizamos la suma del del vector el cual tiene los valores del chi-cudrada
        double sumaChiCuadrado = 0;
        for (int k = 0; k < 25; k++) {
            //System.out.println(matrizZ[n]); 
            sumaChiCuadrado += chiCuadrado[k];

        }
        //Realizamos la verificacion con respecto al valor de la tabla de chi-cuadrada
        lblChi.setText("Suma chi-cuadrada: " + sumaChiCuadrado);
        if (sumaChiCuadrado <= 36.415) {
            lblChi.setText("Se acepta la dependencia: " + sumaChiCuadrado + " es menor a: " + 36.415);
        } else {
            lblChi.setText("Se rechaza la dependencia: " + sumaChiCuadrado + " es mayor a: " + 36.415);
        }
 
        
       

    }//GEN-LAST:event_btnRunActionPerformed
    //Methods
    
    public int returnPosition (Double value){
        
      if(value<=0.2){
            return 0;
        }else if(value<=0.4){
            return 1;
        }else if(value<=0.6){
            return 2;
        }else if(value<=0.8){
            return 3;
        }else{
            return 4;
        }
    }
    
    public void runTest(double[] serie){
        String values = "";//Sirve para almacenoar los valores convertidos de D a S
        //recorre la serie 
        for (int i = 0; i < serie.length; i++) {
            values += serie[i] + "\n";
        }
        String binaries = "";
        int[] binary = new int[100];
        for (int i = 0; i < serie.length; i++) {
            if (serie[i] > 0.5) {
                binary[i] = 1;
                binaries += binary[i] + "\n";
                //System.out.println("  t2   " + binaries + "\6");
            } else {
                binary[i] = 0;
                binaries += binary[i] + "\n";
            }
        }
         textAreaCorridas.setText(binaries);//presenta la lista, resultad de la comprobacion de la serie
        //calculate n1, n2 and R
        int n1 = 0;
        int n2 = 0;
        int comparison = 2;
        int runing = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] != comparison) {
                runing++;
                comparison = binary[i];
            }
        }
        txtR.setText("numero de corrida R: " + runing);
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                n1++;
            } else {
                n2++;
            }
        }
 
        txtN1.setText("n1: " + n1);
        txtN2.setText("n2: " + n2);
        //End calculate n1 and n2
        //Xr
        double num1 = (double) n1;
        double num2 = (double) n2;
        double promedio = ((2 * num1 * num2) / (num1 + num2)) + 1;
        txtXr.setText(" " + promedio);
        //End Xr
        //Sr
        double desviacion = Math.sqrt(((2 * num1 * num2) * ((2 * num1 * num2) - num1 - num2)) / ((Math.pow((num1 + num2), 2)) * (num1 + num2 - 1)));
        txtSr.setText("" + desviacion);
        //End Sr
        //H
        double H = 0;

        if (runing < promedio) {
            H = +0.5;
        } else {
            H = -0.5;
        }
        txtH.setText("" + H);
        //End H
        //Z
        double z = 0;
        z = (runing + H - promedio) / (desviacion);
        txtZo.setText("" + z);
        //End Z
        //varlidadcion de l auniformidad  de la serie
        if (z > -2.58 && z < 2.58) {
            jTextField1.setText("EL valor de Z se encuentra bajo el nivel " +"\n" +"de aceptacion, equivalente a 2.58: " + z);
        } else {
            jTextField1.setText("El valor Z se encuentra sobre el nivel"+ "\n" +" de aceptacion, equivalente a 2.58:" + z);

        }
    
    }
    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnActionPerformed

    private void txtXrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXrActionPerformed

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN1ActionPerformed

    private void txtN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN2ActionPerformed

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
            java.util.logging.Logger.getLogger(Congruencial_Mixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Congruencial_Mixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Congruencial_Mixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Congruencial_Mixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Congruencial_Mixto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblChi;
    private javax.swing.JLabel lblFe;
    private javax.swing.JLabel lblFo1;
    private javax.swing.JLabel lblSerieChii;
    private javax.swing.JTextArea textAreaCorridas;
    private javax.swing.JTextArea textAreaPair;
    private javax.swing.JTextArea textAreaSerie;
    private javax.swing.JTextArea textFieldResut;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtH;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtR;
    private javax.swing.JTextField txtSeeb;
    private javax.swing.JTextField txtSr;
    private javax.swing.JTextField txtXr;
    private javax.swing.JTextField txtZo;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtm;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
}
