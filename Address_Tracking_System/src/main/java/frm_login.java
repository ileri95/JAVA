
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author mustafasamil.ileri
 */
public class frm_login extends javax.swing.JFrame {

    

    /**
     * Creates new form Login
     */
    public frm_login() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jp_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        chkbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş Sayfası");
        setMinimumSize(new java.awt.Dimension(464, 352));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Username :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 127, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Password   :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 109, 40));
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 135, 30));
        jPanel2.add(jp_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 135, 40));

        btn_login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon("C:\\Users\\mustafasamil.ileri\\Documents\\NetBeansProjects\\AdresTakipSistemi\\icons\\icons8-ok-36.png")); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 150, 50));

        btn_register.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 51, 51));
        btn_register.setIcon(new javax.swing.ImageIcon("C:\\Users\\mustafasamil.ileri\\Documents\\NetBeansProjects\\AdresTakipSistemi\\icons\\icons8-registration-36.png")); // NOI18N
        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Address Tracking System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 40));

        chkbox.setBackground(new java.awt.Color(0, 153, 204));
        chkbox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkbox.setText("show password");
        chkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxActionPerformed(evt);
            }
        });
        jPanel2.add(chkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 120, 30));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:

        //TextField alanından gelen kullancı adı ve şifreyi iki farklı değişkene atıyoruz
        String userNAme = txt_username.getText();
        String Passw = jp_password.getText();
        
        
        if (userNAme == "" || Passw == "") { // Burada TextFiled alanın girilen değerlerin boş olup olmadığını kontrol ediyoruz

            JOptionPane.showMessageDialog(rootPane, " Field can not be empty !", "Login", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        boolean ok = DataManage.LoginUser(userNAme, Passw);//DataManage sınıfına Admin ArrayListesine kullancı ekliyoruz

        if (ok) {//eğer kullancı datamızda var ise yeni bir sayfa açıyoruz

            frm_main mainPanel = new frm_main();

            mainPanel.setVisible(true);

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, " Wrong username or password !", "Login", JOptionPane.ERROR_MESSAGE);// kullancı adı veya şifrenin yanlış olduğu bellirtiyorz 
        }


    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        
        frm_register register = new frm_register(); //Kullanıcının sisteme kayıt olmasını
        register.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_registerActionPerformed

    private void chkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxActionPerformed
        // TODO add your handling code here:
    //burada kullanıcının şifreyi yaarken hata 
        if (chkbox.isSelected()) {
            jp_password.setEchoChar((char) 0);//seçildiğinde ise karakterleri göstermesini sağlıyoruz
        } else {
            jp_password.setEchoChar('*');//secili değilse karakterler yerine yıldız yazdırıyoruz
        }
    }//GEN-LAST:event_chkboxActionPerformed

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
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        DataManage test1 = new DataManage();//DataManage sınıfından test için bir nesne oluşturuyoruz
        test1.LoadTestDatas();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JCheckBox chkbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jp_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
