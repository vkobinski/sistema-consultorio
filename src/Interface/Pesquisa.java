package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.hospital.dao.PacienteDAO;
import br.com.hospital.modelo.Paciente;

public class Pesquisa extends javax.swing.JFrame {
    
    public Pesquisa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setText("Informe o Nome:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 15, 110, 40);

        
        jTextField1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 40, 347, 29);

        jToggleButton1.setText("Pesquisar");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(450, 40, 120, 29);
        jToggleButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String idString = jTextField1.getText();
				try {					
					Paciente p = procurar(idString);
					DadosUsuario ua = new DadosUsuario();
					ua.setDadosDoUsuario(p.getId(), p);
					ua.setVisible(true);
					dispose();
					
				}catch(Exception e1) {
					throw new RuntimeException(e1);
				}
			}
		});

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cad.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 696, 335);
        

        setBounds(0, 0, 696, 335);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    	jTextField1.setText(" ");
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {

		        new Pesquisa().setVisible(true);
				
			}
        });
    }

	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    
    public Paciente procurar(Integer id) {
		Paciente p = new PacienteDAO().procurar(id);
		return p;
    	
    }
    
    public Paciente procurar(String nome) {
		Paciente p = new PacienteDAO().procurarPorNome(nome);
		return p;
    	
    }
    
}
