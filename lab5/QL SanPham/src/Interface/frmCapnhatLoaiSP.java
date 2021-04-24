/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import Proccess.LoaiSP;//Lớp LoaiSP trong Proccess đã thực hiện 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel; 
/**
 *
 * @author Administrator
 */
public class frmCapnhatLoaiSP extends javax.swing.JFrame {

    private final LoaiSP lsp = new LoaiSP();  
    private boolean cothem=true; 
    private final DefaultTableModel tableModel = new DefaultTableModel();
//Ham do du lieu vao tableModel
public void ShowData() throws SQLException{
ResultSet result= lsp.ShowLoaiSP();
try {
while(result.next()){ // nếu còn đọc tiếp được một dòng dữ liệu
String rows[] = new String[2];
rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng
tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel
//mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
}
}
catch (SQLException e) {
}
}
//Ham xoa du lieu trong tableModel
public void ClearData() throws SQLException{
//Lay chi so dong cuoi cung
int n=tableModel.getRowCount()-1;
for(int i=n;i>=0;i--)
tableModel.removeRow(i);//Remove tung dong
}
//Ham xoa cac TextField
private void setNull()
{
//Xoa trang cac JtextField
this.txtMaLoai.setText(null);
this.txtTenLoai.setText(null);
this.txtMaLoai.requestFocus();
}
//Ham khoa cac TextField
private void setKhoa(boolean a)
{
//Khoa hoac mo khoa cho Cac JTextField
this.txtMaLoai. setEnabled (!a);
this.txtTenLoai. setEnabled (!a);
}
//Ham khoa cac Button
private void setButton(boolean a)
{
//Vo hieu hoac co hieu luc cho cac JButton
this.btThem. setEnabled (a);
this.btXoa. setEnabled (a);
this.btSua. setEnabled (a);
this.btLuu. setEnabled (!a);
this.btKLuu. setEnabled (!a);
this.btThoat. setEnabled (a);
}
    /**
     * Creates new form frmCapnhatLoaiSP
     */
    public frmCapnhatLoaiSP()throws SQLException{
       initComponents(); // Khởi tạo các components trên JFrame
        String []colsName = {"Mã Loai", "Tên loai"};
        // đặt tiêu đề cột cho tableModel
        tableModel.setColumnIdentifiers(colsName);
        // kết nối jtable với tableModel
        jTableLoaiSP.setModel(tableModel);
        //gọi hàm ShowData để đưa dữ liệu vào tableModel
        ShowData();
        //goi Ham xoa trang cac TextField
        setNull();
        //Goi ham Khoa cac TextField
        setKhoa(true);
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao
        setButton(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btKLuu = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLoaiSP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        txtTenLoai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btThem.setText("Them");
        btThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThemMouseClicked(evt);
            }
        });

        btXoa.setText("Xoa");
        btXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoaMouseClicked(evt);
            }
        });
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btSua.setText("Sua");
        btSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSuaMouseClicked(evt);
            }
        });
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btLuu.setText("Luu");
        btLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLuuMouseClicked(evt);
            }
        });

        btKLuu.setText("K.Luu");

        btThoat.setText("Thoat");
        btThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThoatMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("DANH MUC LOAI SAN PHAM ");

        jTableLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ma Loai", "Ten Loai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLoaiSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLoaiSP);

        jLabel2.setText("Ma loai:");

        jLabel3.setText("Ten Loai:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btThem)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btSua)
                        .addGap(18, 18, 18)
                        .addComponent(btLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btKLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btLuu)
                    .addComponent(btKLuu)
                    .addComponent(btThoat))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLoaiSPMouseClicked
        // TODO add your handling code here:
         //Hien thi du lieu len cac JTextField khi Click chuot vao JTable 
        try{ 
            //Lay chi so dong dang chon 
            int row =this.jTableLoaiSP.getSelectedRow(); 
            String ml=(this.jTableLoaiSP.getModel().getValueAt(row,0)).toString(); 
            ResultSet rs= lsp.ShowLoaiSP(ml);//Goi ham lay du lieu theo ma loai 
            if(rs.next())//Neu co du lieu 
            { 
             this.txtMaLoai.setText(rs.getString("Maloai")); 
             this.txtTenLoai.setText(rs.getString("Tenloai")); 
            } 
        } 
     catch (SQLException e) { 
        }      
    }//GEN-LAST:event_jTableLoaiSPMouseClicked

    private void btThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThoatMouseClicked
        // TODO add your handling code here:
         this.dispose(); 
    }//GEN-LAST:event_btThoatMouseClicked

    private void btXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoaMouseClicked
        // TODO add your handling code here:
         String ml=txtMaLoai.getText(); 
        try { 
            if(ml.length()==0)              
                JOptionPane.showMessageDialog(null,"Chon 1 loai SP de xoa","Thong bao",1); 
            else 
            { 
                if(JOptionPane.showConfirmDialog(null, "Ban muon xoa loai " + ml + "nay hay khong?","Thong bao",2)==0) 
                {     
                    lsp.DeleteData(ml);//goi ham xoa du lieu theo ma loai 
                    ClearData();//Xoa du lieu trong tableModel 
                    ShowData();//Do du lieu vao table Model 
                    setNull();//Xoa trang Textfield 
                } 
             } 
        }  
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Xóa thất bại","Thong bao",1); 
        }
    }//GEN-LAST:event_btXoaMouseClicked

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThemMouseClicked
        // TODO add your handling code here:
        setNull();//Xoa trang TextField 
        setKhoa(false);//Mo khoa TextField 
        setButton(false);//Goi ham khoa cac Button 
        cothem=true;//Gan cothem = true de ghi nhan trang thai them moi 
    }//GEN-LAST:event_btThemMouseClicked

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSuaActionPerformed

    private void btSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuaMouseClicked
        // TODO add your handling code here:
         String ml=txtMaLoai.getText(); 
        if(ml.length()==0) //Chua chon Ma loai              
                JOptionPane.showMessageDialog(null,"Vui long chon loi can sua", "Thong bao",1);
         else 
        { 
            setKhoa(false);//Mo khoa cac TextField 
            this.txtMaLoai.enable(false); 
            setButton(false); //Khoa cac Button 
            cothem=false; //Gan cothem=false de ghi nhan trang thai la sua 
        } 
    }//GEN-LAST:event_btSuaMouseClicked

    private void btLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLuuMouseClicked
        // TODO add your handling code here:
          String ml=txtMaLoai.getText(); 
        String tl=txtTenLoai.getText(); 
         if(ml.length()==0 || tl.length()==0)              
                JOptionPane.showMessageDialog(null,"Vui long nhap Ma loai va ten loai","Thong bao",1); 
         else 
            if(ml.length()>2 || tl.length()>30)              
                JOptionPane.showMessageDialog(null, "Ma loai chi 2 ky tu, ten loai la 20","Thong bao",1); 
            else    
            { 
              try { 
                if(cothem==true)    //Luu cho tthem moi            
                    lsp.InsertData(ml, tl); 
                else                //Luu cho sua 
                    lsp.EditData(ml, tl); 
                ClearData(); //goi ham xoa du lieu tron tableModel 
                ShowData(); //Do lai du lieu vao Table Model 
              } 
              catch (SQLException ex) { 
                   JOptionPane.showMessageDialog(null,"Cap nhat that bai","Thong bao",1); 
              }             
             setKhoa(false); 
             setButton(true); 
         } 
    }                                   
    private void btKLuuMouseClicked(java.awt.event.MouseEvent evt) {                                     
        setNull(); 
        setKhoa(true); 
        setButton(true); 
    }//GEN-LAST:event_btLuuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    frmCapnhatLoaiSP f = new frmCapnhatLoaiSP(); 
        f.setVisible(true); 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btKLuu;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLoaiSP;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}