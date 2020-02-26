/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import Controlador.TCine;
import Entidades.Easientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmAsientos extends javax.swing.JFrame {

    public String funcion;

    /**
     * Creates new form frmAsientos
     */
    public frmAsientos(String funcion) {
        initComponents();
        this.funcion = funcion;
        setSize(700, 400);
        setLocationRelativeTo(this);

        Easientos objAsiento = new Easientos(0, false);
        TCine.Ingresar3(objAsiento);
        Easientos objAsiento1 = new Easientos(1, false);
        TCine.Ingresar3(objAsiento1);
        Easientos objAsiento2 = new Easientos(2, false);
        TCine.Ingresar3(objAsiento2);
        Easientos objAsiento3 = new Easientos(3, false);
        TCine.Ingresar3(objAsiento3);
        Easientos objAsiento4 = new Easientos(4, false);
        TCine.Ingresar3(objAsiento4);
        Easientos objAsiento5 = new Easientos(5, false);
        TCine.Ingresar3(objAsiento5);
        Easientos objAsiento6 = new Easientos(6, false);
        TCine.Ingresar3(objAsiento6);
        Easientos objAsiento7 = new Easientos(7, false);
        TCine.Ingresar3(objAsiento7);
        Easientos objAsiento8 = new Easientos(8, false);
        TCine.Ingresar3(objAsiento8);
        Easientos objAsiento9 = new Easientos(9, false);
        TCine.Ingresar3(objAsiento9);
        Easientos objAsiento10 = new Easientos(10, false);
        TCine.Ingresar3(objAsiento10);
        Easientos objAsiento11 = new Easientos(11, false);
        TCine.Ingresar3(objAsiento11);
        Easientos objAsiento12 = new Easientos(12, false);
        TCine.Ingresar3(objAsiento12);
        Easientos objAsiento13 = new Easientos(13, false);
        TCine.Ingresar3(objAsiento13);
        Easientos objAsiento14 = new Easientos(14, false);
        TCine.Ingresar3(objAsiento14);
        Easientos objAsiento15 = new Easientos(15, false);
        TCine.Ingresar3(objAsiento15);
        Easientos objAsiento16 = new Easientos(16, false);
        TCine.Ingresar3(objAsiento16);
        Easientos objAsiento17 = new Easientos(17, false);
        TCine.Ingresar3(objAsiento17);
        Easientos objAsiento18 = new Easientos(18, false);
        TCine.Ingresar3(objAsiento18);
        Easientos objAsiento19 = new Easientos(19, false);
        TCine.Ingresar3(objAsiento19);
        Easientos objAsiento20 = new Easientos(20, false);
        TCine.Ingresar3(objAsiento20);
        Easientos objAsiento21 = new Easientos(21, false);
        TCine.Ingresar3(objAsiento21);
        Easientos objAsiento22 = new Easientos(22, false);
        TCine.Ingresar3(objAsiento22);
        Easientos objAsiento23 = new Easientos(23, false);
        TCine.Ingresar3(objAsiento23);
        Easientos objAsiento24 = new Easientos(24, false);
        TCine.Ingresar3(objAsiento24);
        Easientos objAsiento25 = new Easientos(25, false);
        TCine.Ingresar3(objAsiento25);
        Easientos objAsiento26 = new Easientos(26, false);
        TCine.Ingresar3(objAsiento26);
        Easientos objAsiento27 = new Easientos(27, false);
        TCine.Ingresar3(objAsiento27);
        Easientos objAsiento28 = new Easientos(28, false);
        TCine.Ingresar3(objAsiento28);
        Easientos objAsiento29 = new Easientos(29, false);
        TCine.Ingresar3(objAsiento29);
        Easientos objAsiento30 = new Easientos(30, false);
        TCine.Ingresar3(objAsiento30);
        Easientos objAsiento31 = new Easientos(31, false);
        TCine.Ingresar3(objAsiento31);
        Easientos objAsiento32 = new Easientos(32, false);
        TCine.Ingresar3(objAsiento32);

        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton1.getText());
                frmSalas.jTextField4.setText(jRadioButton1.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton1.getText()));
                if (asiento.isOcupad()) {

                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");

                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton1.getText()));
                    frmSalas.jTextField5.setText("Libre");

                }
            }
        });
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton2.getText());
                frmSalas.jTextField4.setText(jRadioButton2.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton2.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton2.getText()));
                    frmSalas.jTextField5.setText("Libre");

                }
            }
        });
        jRadioButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton3.getText());
                frmSalas.jTextField4.setText(jRadioButton3.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton3.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton13.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton4.getText());
                frmSalas.jTextField4.setText(jRadioButton4.getText());

                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton4.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton4.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton5.getText());
                frmSalas.jTextField4.setText(jRadioButton5.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton5.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton5.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton6.getText());
                frmSalas.jTextField4.setText(jRadioButton6.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton6.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton6.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton8.getText());
                frmSalas.jTextField4.setText(jRadioButton8.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton8.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton8.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton9.getText());
                frmSalas.jTextField4.setText(jRadioButton9.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton9.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton9.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton10.getText());
                frmSalas.jTextField4.setText(jRadioButton10.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton10.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton10.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton11.getText());
                frmSalas.jTextField4.setText(jRadioButton11.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton11.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton11.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton12.getText());
                frmSalas.jTextField4.setText(jRadioButton12.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton12.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton12.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton13.getText());
                frmSalas.jTextField4.setText(jRadioButton13.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton13.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton13.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton14.getText());
                frmSalas.jTextField4.setText(jRadioButton14.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton14.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton14.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton15.getText());
                frmSalas.jTextField4.setText(jRadioButton15.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton15.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton15.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton16.getText());
                frmSalas.jTextField4.setText(jRadioButton16.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton16.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton16.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton17.getText());
                frmSalas.jTextField4.setText(jRadioButton17.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton17.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton17.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton18.getText());
                frmSalas.jTextField4.setText(jRadioButton18.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton18.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton18.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton19.getText());
                frmSalas.jTextField4.setText(jRadioButton19.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton19.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton19.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton20.getText());
                frmSalas.jTextField4.setText(jRadioButton20.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton20.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton20.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton21.getText());
                 frmSalas.jTextField4.setText(jRadioButton21.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton21.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton21.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton22.getText());
                 frmSalas.jTextField4.setText(jRadioButton22.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton22.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton22.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton23.getText());
                 frmSalas.jTextField4.setText(jRadioButton23.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton23.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton23.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton24.getText());
                 frmSalas.jTextField4.setText(jRadioButton24.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton24.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton24.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton25.getText());
                 frmSalas.jTextField4.setText(jRadioButton25.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton25.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton25.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton26.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton26.getText());
                 frmSalas.jTextField4.setText(jRadioButton26.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton26.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton26.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton27.getText());
                 frmSalas.jTextField4.setText(jRadioButton27.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton27.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton27.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton28.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton28.getText());
                 frmSalas.jTextField4.setText(jRadioButton28.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton28.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton28.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton29.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton29.getText());
                 frmSalas.jTextField4.setText(jRadioButton29.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton29.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton29.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton30.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton30.getText());
                 frmSalas.jTextField4.setText(jRadioButton30.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton30.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton30.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton31.getText());
                 frmSalas.jTextField4.setText(jRadioButton31.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton31.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton31.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton32.getText());
                 frmSalas.jTextField4.setText(jRadioButton32.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton32.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton32.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton32.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton32.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton32.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });
        jRadioButton33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(jRadioButton33.getText());
                 frmSalas.jTextField4.setText(jRadioButton33.getText());
                Easientos asiento = TCine.BuscarAsientos(Integer.parseInt(jRadioButton33.getText()));
                if (asiento.isOcupad()) {
                    JOptionPane.showMessageDialog(null, "Asiento Ocupado!! Por favor Eliga otro!!");
                } else {
                    TCine.modificar(Integer.parseInt(jRadioButton33.getText()));
                    frmSalas.jTextField5.setText("Libre");
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("A S I E N T O S    S A L A     1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setText("1");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 40));

        jRadioButton2.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setText("2");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 40));

        jRadioButton3.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton3.setText("3");
        jRadioButton3.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 60, 40));

        jRadioButton4.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton4.setText("4");
        jRadioButton4.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 60, 40));

        jRadioButton5.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton5.setText("5");
        jRadioButton5.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 60, 40));

        jRadioButton6.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton6.setText("6");
        jRadioButton6.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 60, 40));

        jRadioButton7.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton7.setText("7");
        jRadioButton7.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 60, 40));

        jRadioButton8.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton8.setText("8");
        jRadioButton8.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 60, 40));

        jRadioButton9.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton9.setText("9");
        jRadioButton9.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 60, 40));

        jRadioButton10.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton10.setText("10");
        jRadioButton10.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 70, 40));

        jRadioButton11.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton11.setText("11");
        jRadioButton11.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 40));

        jRadioButton12.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton12.setText("12");
        jRadioButton12.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 70, 40));

        jRadioButton13.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton13.setText("13");
        jRadioButton13.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 70, 40));

        jRadioButton14.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton14.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton14.setText("14");
        jRadioButton14.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, 40));

        jRadioButton15.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton15.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton15.setText("15");
        jRadioButton15.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 70, 40));

        jRadioButton16.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton16.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton16.setText("16");
        jRadioButton16.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 70, 40));

        jRadioButton17.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton17.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton17.setText("17");
        jRadioButton17.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 70, 40));

        jRadioButton18.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton18.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton18.setText("18");
        jRadioButton18.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 70, 40));

        jRadioButton19.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton19.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton19.setText("19");
        jRadioButton19.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 70, 40));

        jRadioButton20.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton20.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton20.setText("20");
        jRadioButton20.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 70, 40));

        jRadioButton21.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton21.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton21.setText("21");
        jRadioButton21.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 40));

        jRadioButton22.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton22.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton22.setText("22");
        jRadioButton22.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 70, 40));

        jRadioButton23.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton23.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton23.setText("23");
        jRadioButton23.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 70, 40));

        jRadioButton24.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton24.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton24.setText("24");
        jRadioButton24.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 40));

        jRadioButton25.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton25.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton25.setText("25");
        jRadioButton25.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 70, 40));

        jRadioButton26.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton26.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton26.setText("26");
        jRadioButton26.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 70, 40));

        jRadioButton27.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton27.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton27.setText("27");
        jRadioButton27.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 70, 40));

        jRadioButton28.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton28.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton28.setText("28");
        jRadioButton28.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 70, 40));

        jRadioButton29.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton29.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton29.setText("29");
        jRadioButton29.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 70, 40));

        jRadioButton30.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton30.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton30.setText("30");
        jRadioButton30.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));
        getContentPane().add(jRadioButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 70, 40));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Realizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jRadioButton31.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(jRadioButton31);
        jRadioButton31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton31.setText("31");
        jRadioButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton31ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jRadioButton32.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(jRadioButton32);
        jRadioButton32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton32.setText("32");
        getContentPane().add(jRadioButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jRadioButton33.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(jRadioButton33);
        jRadioButton33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton33.setText("33");
        getContentPane().add(jRadioButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton31ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (funcion.equals("Asignar Asiento")) {

        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAsientos("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
