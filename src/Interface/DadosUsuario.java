// Done by: Victor Kobinski e Silva
// UEPG - State University of Ponta Grossa

package Interface;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.hospital.modelo.Paciente;

public class DadosUsuario extends javax.swing.JFrame {
	

	
    public DadosUsuario() {
        initComponents();
    }
    

    public void setDadosDoUsuario(Integer id, Paciente p) {
    	this.paciente = p;
    	preencherTabela();
    	
    }


	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        tabela = new JTable();
        modelo = (DefaultTableModel) tabela.getModel();        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);


        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(360, 140, 90, 0);
        
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        
		tabela.setBounds(10, 40, 760, 300);
		
		getContentPane().add(tabela);
        
        setBounds(0, 0, 800,400);      

    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(DadosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
	private JTable tabela;
	private DefaultTableModel modelo;
	private Paciente paciente;
    // End of variables declaration//GEN-END:variables
	
	public void preencherTabela() {
		modelo.addRow(new Object[] {"ID", "Nome", "Telefone", "Email"});
		modelo.addRow(new Object[] {this.paciente.getId(), this.paciente.getNomeCompleto(), this.paciente.getTelefone(), this.paciente.getEmail()});
		modelo.addRow(new Object[] {"Senha", "Data de Nascimento", "Cidade", "Bairro"});
		modelo.addRow(new Object[] {this.paciente.getSenha(), this.paciente.getDataDeNascimento(), this.paciente.getCidade(), this.paciente.getBairro()});
		modelo.addRow(new Object[] {"Cep", "UF", "Estado Civil", "RG"});
		modelo.addRow(new Object[] {this.paciente.getCep(), this.paciente.getUf(), this.paciente.getEstadoCivil(), this.paciente.getRg()});
		modelo.addRow(new Object[] {"Escolaridade", "Profissão", "Rua", "Complemento"});
		modelo.addRow(new Object[] {this.paciente.getEscolaridade(), this.paciente.getProfissao(), this.paciente.getRua(), this.paciente.getComplemento()});
		modelo.addRow(new Object[] {"Nacionalidade", "Sexo", "Tipo Sanguíneo", "N° da Carteira do SUS"});
		modelo.addRow(new Object[] {this.paciente.getNacionalidade(), this.paciente.getSexo(), this.paciente.getTipoSanguineo(), this.paciente.getNumeroCarteiraSus()});
	}
}
