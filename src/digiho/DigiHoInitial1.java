/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digiho;

import java.io.File;
import javax.swing.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import digiho.First;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import login.DigiHoInitial;


/**
 *
 * @author Hp
 */



public class DigiHoInitial1 extends javax.swing.JFrame {

    String name, father, address, date ;
    
    
    public DigiHoInitial1() {
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

        jPanel1 = new javax.swing.JPanel();
        jName = new javax.swing.JLabel();
        jName1 = new javax.swing.JTextField();
        jName2 = new javax.swing.JTextField();
        jName3 = new javax.swing.JTextField();
        jFatherName = new javax.swing.JLabel();
        jFatherName1 = new javax.swing.JTextField();
        jAddress = new javax.swing.JLabel();
        jAddress1 = new javax.swing.JTextField();
        jBlock = new javax.swing.JLabel();
        jCity = new javax.swing.JLabel();
        jDistrict = new javax.swing.JLabel();
        jMobile = new javax.swing.JLabel();
        jMobile1 = new javax.swing.JTextField();
        jDistrict1 = new javax.swing.JTextField();
        jCity1 = new javax.swing.JTextField();
        jBlock1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCustomer = new javax.swing.JLabel();
        jCustomer1 = new javax.swing.JTextField();
        jDate = new javax.swing.JLabel();
        jDate1 = new javax.swing.JTextField();
        text = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        dfg = new javax.swing.JLabel();
        jcomplain1 = new javax.swing.JTextField();
        jcomplain3 = new javax.swing.JTextField();
        jcomplain4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel01 = new javax.swing.JLabel();
        jLabel02 = new javax.swing.JLabel();
        jLabel04 = new javax.swing.JLabel();
        jLabel03 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("Mr Mrs");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jName.setForeground(new java.awt.Color(0, 255, 255));
        jName.setText("Name:");
        jPanel1.add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 20));

        jName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jName1.setToolTipText("Mr Mrs");
        jName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jName1ActionPerformed(evt);
            }
        });
        jName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jName1KeyTyped(evt);
            }
        });
        jPanel1.add(jName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 47, -1));

        jName2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jName2.setToolTipText("First Name");
        jName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jName2MousePressed(evt);
            }
        });
        jName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jName2ActionPerformed(evt);
            }
        });
        jPanel1.add(jName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 142, -1));

        jName3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jName3.setToolTipText("Last Name");
        jName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jName3ActionPerformed(evt);
            }
        });
        jPanel1.add(jName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 108, -1));

        jFatherName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jFatherName.setForeground(new java.awt.Color(0, 255, 255));
        jFatherName.setText("Father's name:");
        jPanel1.add(jFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jFatherName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFatherName1.setToolTipText("Enter Fathers Name");
        jPanel1.add(jFatherName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 350, -1));

        jAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAddress.setForeground(new java.awt.Color(0, 255, 255));
        jAddress.setText("Address:");
        jPanel1.add(jAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jAddress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 420, -1));

        jBlock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBlock.setForeground(new java.awt.Color(0, 255, 255));
        jBlock.setText("Block:");
        jPanel1.add(jBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 50));

        jCity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCity.setForeground(new java.awt.Color(0, 255, 255));
        jCity.setText("City:");
        jPanel1.add(jCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 40, 40));

        jDistrict.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDistrict.setForeground(new java.awt.Color(0, 255, 255));
        jDistrict.setText("District:");
        jPanel1.add(jDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMobile.setForeground(new java.awt.Color(0, 255, 255));
        jMobile.setText("Mobile:");
        jPanel1.add(jMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 40));

        jMobile1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jMobile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 160, -1));

        jDistrict1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDistrict1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDistrict1ActionPerformed(evt);
            }
        });
        jPanel1.add(jDistrict1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 160, -1));

        jCity1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 160, -1));

        jBlock1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jBlock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 160, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit Complaint");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 160, -1));

        jCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCustomer.setForeground(new java.awt.Color(0, 255, 255));
        jCustomer.setText("Customer ID.:");
        jPanel1.add(jCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jCustomer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustomer1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCustomer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 210, -1));

        jDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDate.setForeground(new java.awt.Color(0, 255, 255));
        jDate.setText("Date:");
        jPanel1.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 40, 40));
        jPanel1.add(jDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 77, -1));

        text.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        text.setForeground(new java.awt.Color(0, 255, 0));
        text.setText("COMPLAINT FORM");
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 260, -1));

        jBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        jPanel1.add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, -1, -1));

        dfg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dfg.setForeground(new java.awt.Color(0, 255, 255));
        dfg.setText("Complaint Description :-");
        jPanel1.add(dfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 670, 20));

        jcomplain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomplain1ActionPerformed(evt);
            }
        });
        jPanel1.add(jcomplain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 580, 30));

        jcomplain3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomplain3ActionPerformed(evt);
            }
        });
        jPanel1.add(jcomplain3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 580, 30));

        jcomplain4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomplain4ActionPerformed(evt);
            }
        });
        jPanel1.add(jcomplain4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 580, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 580, 30));

        jLabel01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel01.setForeground(new java.awt.Color(0, 255, 255));
        jLabel01.setText("2.");
        jPanel1.add(jLabel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 20, 20));

        jLabel02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel02.setForeground(new java.awt.Color(0, 255, 255));
        jLabel02.setText("3.");
        jPanel1.add(jLabel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 20, 20));

        jLabel04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel04.setForeground(new java.awt.Color(0, 255, 255));
        jLabel04.setText("4.");
        jPanel1.add(jLabel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 20, 20));

        jLabel03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel03.setForeground(new java.awt.Color(0, 255, 255));
        jLabel03.setText("1.");
        jPanel1.add(jLabel03, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 20, 20));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 690, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/LOGO.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 110, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digiho/cool_abstract_cube_wallpaper_hd_Y51Jqhj.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jName2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jName2MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jName2MousePressed

    private void jName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jName2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jDate1.setText("");
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyy");
        jDate1.setText(Tdate.format(timer.getTime()));
        Document doc = new Document();   
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("f:\\DiGiho\\Complaint From\\"+jCustomer1.getText()+".pdf"));
            doc.open();
            doc.add(new Paragraph("\n", FontFactory.getFont(FontFactory.TIMES_BOLD, 20,Font.BOLD, BaseColor.DARK_GRAY )));
            doc.add(new Paragraph("\n\n\n\n\n\n\n\n\n\n"));
            doc.add(new Phrase("Customer ID.:         "));
            doc.add(new Phrase(jCustomer1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12,Font.BOLD, BaseColor.BLACK )));
            doc.add(new Phrase("                                                    Date:          "+jDate1.getText()+"   \n\n"));
            doc.add(new Phrase("Name:                   "));
            doc.add(new Phrase(jName1.getText()+". "+jName2.getText()+" "+jName3.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12,Font.BOLD, BaseColor.BLACK )));
            doc.add(new Phrase("\nFather's Name:     " ));
            doc.add(new Phrase(jFatherName1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12,Font.BOLD, BaseColor.BLACK )));
            doc.add(new Phrase("\nAddress:                "));
            doc.add(new Phrase(jAddress1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12,Font.BOLD, BaseColor.BLACK )));
            doc.add(new Phrase("\nBlock:                    "));
            doc.add(new Phrase(jBlock1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12,Font.BOLD, BaseColor.BLACK )));
            
            doc.add(new Phrase("\nCity:                       "));
            doc.add(new Phrase(jCity1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12,Font.BOLD, BaseColor.BLACK )));
            doc.add(new Phrase("\nDistrict:                  "));
            doc.add(new Phrase(jDistrict1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12,Font.BOLD, BaseColor.BLACK )));
            doc.add(new Phrase("\nMoblie No.:           "));
            doc.add(new Phrase(jMobile1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12,Font.BOLD, BaseColor.BLACK )));
            
            doc.add(new Paragraph("\n\n\n\n\n\n"));
            doc.add(new Paragraph("        (1)  " + jTextField2.getText()));
            doc.add(new Paragraph("        (2)  " + jcomplain1.getText()));
            doc.add(new Paragraph("        (3)  " + jcomplain3.getText()));
            doc.add(new Paragraph("        (4)  " + jcomplain4.getText()));
            doc.close();
            } 
        catch (DocumentException e ) {
            e.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DigiHoInitial1.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"File has been created", "deeps message", JOptionPane.
                WARNING_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jName1ActionPerformed

    private void jName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jName3ActionPerformed

    private void jName1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jName1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jName1KeyTyped

    private void jDistrict1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDistrict1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDistrict1ActionPerformed

    private void jCustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustomer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCustomer1ActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        First f = new First();
        f.setVisible(true);
        
    }//GEN-LAST:event_jBackActionPerformed

    private void jcomplain1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomplain1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomplain1ActionPerformed

    private void jcomplain3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomplain3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomplain3ActionPerformed

    private void jcomplain4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomplain4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomplain4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
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
            java.util.logging.Logger.getLogger(DigiHoInitial1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DigiHoInitial1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DigiHoInitial1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DigiHoInitial1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DigiHoInitial1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dfg;
    private javax.swing.JLabel jAddress;
    private javax.swing.JTextField jAddress1;
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jBlock;
    private javax.swing.JTextField jBlock1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jCity;
    private javax.swing.JTextField jCity1;
    private javax.swing.JLabel jCustomer;
    private javax.swing.JTextField jCustomer1;
    private javax.swing.JLabel jDate;
    private javax.swing.JTextField jDate1;
    private javax.swing.JLabel jDistrict;
    private javax.swing.JTextField jDistrict1;
    private javax.swing.JLabel jFatherName;
    private javax.swing.JTextField jFatherName1;
    private javax.swing.JLabel jLabel01;
    private javax.swing.JLabel jLabel02;
    private javax.swing.JLabel jLabel03;
    private javax.swing.JLabel jLabel04;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jMobile;
    private javax.swing.JTextField jMobile1;
    private javax.swing.JLabel jName;
    private javax.swing.JTextField jName1;
    private javax.swing.JTextField jName2;
    private javax.swing.JTextField jName3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jcomplain1;
    private javax.swing.JTextField jcomplain3;
    private javax.swing.JTextField jcomplain4;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
