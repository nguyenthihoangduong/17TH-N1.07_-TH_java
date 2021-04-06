
package lab3;
import javax.swing.JOptionPane;

public class bai6 extends javax.swing.JFrame {

   
    public bai6() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Chia = new javax.swing.JButton();
        Tru = new javax.swing.JButton();
        Cong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Nhan = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Result");

        Chia.setText("/");
        Chia.setName("btnDiv"); // NOI18N
        Chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiaActionPerformed(evt);
            }
        });

        Tru.setText("-");
        Tru.setName("btnSub"); // NOI18N
        Tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TruActionPerformed(evt);
            }
        });

        Cong.setText("+");
        Cong.setName("btnAdd"); // NOI18N
        Cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        Nhan.setText("x");
        Nhan.setName("btnMulti"); // NOI18N
        Nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhanActionPerformed(evt);
            }
        });

        jTextField1.setName("txtFirst"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setName("txtSecond"); // NOI18N

        jLabel2.setText("Second Number");

        jTextField3.setEnabled(false);
        jTextField3.setName("txtResult"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Chia)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nhan)
                    .addComponent(Chia)
                    .addComponent(Tru)
                    .addComponent(Cong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiaActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 1");
            return;
        }if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 2");
            return;
        }

        String fnum=jTextField1.getText();
        String snum=jTextField2.getText();
        float f=Float.parseFloat(fnum);
        float s=Float.parseFloat(snum);
        if(s==0){
            jTextField3.setText("Khong xac dinh");
            return;
        }
        float result=f/s;
        jTextField3.setText(Float.toString(result));

    }//GEN-LAST:event_ChiaActionPerformed

    private void TruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TruActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 1");
            return;
        }if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 2");
            return;
        }

        String fnum=jTextField1.getText();
        String snum=jTextField2.getText();
        float result=Float.parseFloat(fnum)-Float.parseFloat(snum);
        jTextField3.setText(Float.toString(result));
    }//GEN-LAST:event_TruActionPerformed

    private void CongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 1");
            return;
        }if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 2");
            return;
        }

        String fnum=jTextField1.getText();
        String snum=jTextField2.getText();
        float result=Float.parseFloat(fnum)+Float.parseFloat(snum);
        jTextField3.setText(Float.toString(result));
    }//GEN-LAST:event_CongActionPerformed

    private void NhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhanActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 1");
            return;
        }if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 2");
            return;
        }

        String fnum=jTextField1.getText();
        String snum=jTextField2.getText();
        float result=Float.parseFloat(fnum)*Float.parseFloat(snum);
        jTextField3.setText(Float.toString(result));
    }//GEN-LAST:event_NhanActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chia;
    private javax.swing.JButton Cong;
    private javax.swing.JButton Nhan;
    private javax.swing.JButton Tru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
