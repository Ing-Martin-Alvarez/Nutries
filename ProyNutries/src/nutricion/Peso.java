//Martin Alvarez Salazar 19460870
package nutricion;

import java.io.File;
import java.io.FileInputStream;
import java.util.Formatter;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Peso extends javax.swing.JFrame {
    String bar = File.separator;
    String ubicacion = System.getProperty("user.dir")+bar+"Registros"+bar;

    public Peso() {
        initComponents();
        inilabelimagen();
    }
    private void crear(){
        String archivo = txtnombre.getText()+".txt";
        File crea_ubicacion = new File(ubicacion);
        File crea_archivo = new File(ubicacion+archivo);
        
        if(txtnombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No hay nombre del paciente para el expediente");
        }
        else{
            try{
                if(crea_archivo.exists()){
                JOptionPane.showMessageDialog(null, "Existe un expediente con el mismo nombre");
                }
            else{
                crea_ubicacion.mkdirs();
                Formatter crea = new Formatter(ubicacion+archivo);
                crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n","nombre = "+txtnombre.getText(),"estatura = "+txtestatura.getText(),"peso = "+txtpeso.getText(),"Es Mujer = "+rbmujer.isSelected()+" \nEs Hombre = "+rbhombre.isSelected(),"Peso Ideal = "+etPI.getText(),"Sobre Peso = "+etSP.getText(),"Bajo de peso = "+etBP.getText());
                crea.close();
                JOptionPane.showMessageDialog(null, "El registro de este paciente se creo exitosamente");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Lamentamos pero no se pudo ingresar el archivo al sistema");                
            }
        }
    }
    
    private void mostrar(){
        File url = new File(ubicacion+txtnombre.getText()+".txt");
        if(txtnombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Porfavor ingrese el nombre del paciente a consultar");
        }
        else{
            if(url.exists()){
                try{
                    FileInputStream fis = new  FileInputStream(url);
                    Properties mostrar = new Properties();
                    mostrar.load(fis);
                    txtestatura.setText(mostrar.getProperty("estatura"));
                    txtpeso.setText(mostrar.getProperty("peso"));
                    etPI.setText(mostrar.getProperty("Peso Ideal"));
                    etSP.setText(mostrar.getProperty("Sobre Peso"));
                    etBP.setText(mostrar.getProperty("Bajo de peso"));                    
                } catch(Exception e){
                    
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "El registro no existe");
            }
        }
    }
    
    private void inilabelimagen(){
        ImageIcon mujer = new ImageIcon(getClass().getResource("/imagenes/mujer.png"));
        etmujer.setIcon(mujer);
        ImageIcon hombre = new ImageIcon(getClass().getResource("/imagenes/hombre.png"));
        ethombre.setIcon(hombre);
        rbmujer.setSelected(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtnombre = new javax.swing.JTextField();
        txtestatura = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        etnombre = new javax.swing.JLabel();
        etestatura = new javax.swing.JLabel();
        etpaso = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbhombre = new javax.swing.JRadioButton();
        rbmujer = new javax.swing.JRadioButton();
        etmujer = new javax.swing.JLabel();
        ethombre = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        etpesoideal = new javax.swing.JLabel();
        etPI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etSP = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etBP = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etrango = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paciente Nutricion");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(650, 500));
        setSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(null);
        getContentPane().add(txtnombre);
        txtnombre.setBounds(150, 30, 160, 30);
        getContentPane().add(txtestatura);
        txtestatura.setBounds(150, 70, 50, 30);
        getContentPane().add(txtpeso);
        txtpeso.setBounds(150, 110, 50, 30);

        etnombre.setText("Nombre del Paciente:");
        getContentPane().add(etnombre);
        etnombre.setBounds(30, 40, 140, 16);

        etestatura.setText("  Estatura en cm:");
        getContentPane().add(etestatura);
        etestatura.setBounds(50, 80, 130, 16);

        etpaso.setText("Peso actual:");
        getContentPane().add(etpaso);
        etpaso.setBounds(60, 120, 110, 16);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Genero"));
        jPanel1.setLayout(null);

        buttonGroup1.add(rbhombre);
        rbhombre.setText("Hombre");
        rbhombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbhombreActionPerformed(evt);
            }
        });
        jPanel1.add(rbhombre);
        rbhombre.setBounds(110, 90, 90, 25);

        buttonGroup1.add(rbmujer);
        rbmujer.setText("Mujer");
        rbmujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmujerActionPerformed(evt);
            }
        });
        jPanel1.add(rbmujer);
        rbmujer.setBounds(10, 90, 93, 25);

        etmujer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(etmujer);
        etmujer.setBounds(10, 20, 80, 70);

        ethombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(ethombre);
        ethombre.setBounds(110, 20, 80, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 30, 200, 120);

        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btncalcular);
        btncalcular.setBounds(130, 343, 80, 30);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar);
        btnlimpiar.setBounds(270, 343, 70, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jPanel2.setLayout(null);

        etpesoideal.setText("Peso Ideal:");
        jPanel2.add(etpesoideal);
        etpesoideal.setBounds(10, 20, 70, 20);

        etPI.setBackground(new java.awt.Color(0, 255, 255));
        etPI.setEnabled(false);
        etPI.setOpaque(true);
        jPanel2.add(etPI);
        etPI.setBounds(90, 20, 100, 20);

        jLabel1.setText("kg.");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(200, 20, 34, 30);

        jLabel2.setText("Sobre Peso:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 50, 80, 20);

        jLabel3.setText("Bajo Peso:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 80, 80, 20);

        etSP.setBackground(new java.awt.Color(0, 255, 255));
        etSP.setOpaque(true);
        jPanel2.add(etSP);
        etSP.setBounds(90, 50, 100, 20);

        jLabel5.setText("kg.");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 50, 30, 20);

        etBP.setBackground(new java.awt.Color(0, 255, 255));
        etBP.setOpaque(true);
        jPanel2.add(etBP);
        etBP.setBounds(90, 80, 100, 20);

        jLabel7.setText("kg.");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(200, 80, 40, 20);

        jLabel4.setText("Rango");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(280, 20, 230, 20);

        etrango.setBackground(new java.awt.Color(255, 255, 0));
        etrango.setOpaque(true);
        jPanel2.add(etrango);
        etrango.setBounds(280, 50, 220, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 200, 550, 130);

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(410, 343, 70, 30);

        Guardar.setText("Guardar Expediente de Paciente");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar);
        Guardar.setBounds(90, 390, 220, 25);

        Mostrar.setText("Mostrar Registro de Paciente");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar);
        Mostrar.setBounds(330, 390, 210, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbhombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbhombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbhombreActionPerformed

    private void rbmujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbmujerActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        double peso = 0, r = 0, ri= 0, rs = 0, sobrepeso = 0, bajopeso = 0, estatura = 0, ib = 0;
        if((rbhombre.isSelected() == true)&&(evt.getSource()== btncalcular)){
            peso = Double.valueOf(txtpeso.getText());
            estatura = Double.valueOf(txtestatura.getText());
            ib = estatura - 100;
            r = (10*ib)/100;
            ri = ib - r;
            rs = ib + r;
            sobrepeso = peso - rs;
            bajopeso = ri - peso;
            etPI.setText(ib+"");            
                if(peso > rs){
                    etSP.setText(sobrepeso+"");
                    etBP.setText("0");
                    etrango.setText(ri+" - "+rs);
                }
                if(peso < ri){
                    etSP.setText("0");
                    etBP.setText(bajopeso+"");
                    etrango.setText(ri+" - "+rs);
                }
                if(peso == ib){
                    etSP.setText("0");
                    etBP.setText("0");
                    etrango.setText("Felicidades estas en tu peso ideal");
                }
                if ((peso >= ri)&&(peso <= rs)){
                    etSP.setText("0");
                    etBP.setText("0");
                    etrango.setText("Felicidades estas en tu rango ideal");                    
                }                
        }
        if((rbmujer.isSelected() == true)&&(evt.getSource()== btncalcular)){
            peso = Double.valueOf(txtpeso.getText());
            estatura = Double.valueOf(txtestatura.getText());
            ib = estatura - 100;
            r = (15*ib)/100;
            ri = ib - r;
            rs = ib + r;
            sobrepeso = peso - rs;
            bajopeso = ri - peso;
            etPI.setText(ib+"");
            etrango.setText(ri+" - "+rs);
                if(peso > rs){
                    etSP.setText(sobrepeso+"");
                    etBP.setText("0");
                }
                if(peso < ri){
                    etSP.setText("0");
                    etBP.setText(bajopeso+"");
                }
                if(peso == ib){
                    etSP.setText("0");
                    etBP.setText("0");
                    etrango.setText("Felicidades estas en tu peso ideal");
                }
                if ((peso >= ri)&&(peso <= rs)){
                    etSP.setText("0");
                    etBP.setText("0");
                    etrango.setText("Felicidades estas en tu rango ideal");                    
                }
        }
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        etPI.setText("");
        txtnombre.setText("");
        txtestatura.setText("");
        txtpeso.setText("");
        etrango.setText("");
        rbmujer.setSelected(true);
        etSP.setText("");
        etBP.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        crear();
    }//GEN-LAST:event_GuardarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Peso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etBP;
    private javax.swing.JLabel etPI;
    private javax.swing.JLabel etSP;
    private javax.swing.JLabel etestatura;
    private javax.swing.JLabel ethombre;
    private javax.swing.JLabel etmujer;
    private javax.swing.JLabel etnombre;
    private javax.swing.JLabel etpaso;
    private javax.swing.JLabel etpesoideal;
    private javax.swing.JLabel etrango;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbhombre;
    private javax.swing.JRadioButton rbmujer;
    private javax.swing.JTextField txtestatura;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
