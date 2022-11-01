package Interface;

import br.com.hospital.dao.PacienteDAO;
import br.com.hospital.modelo.Paciente;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolaridade = new javax.swing.JComboBox<>();
        uf = new javax.swing.JComboBox<>();
        profissao = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        nomeCompleto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dataNascimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        Rua = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        cep = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        estadoCivil = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        jTextField28 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        nacionalidade = new javax.swing.JTextField();
        complemento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        tipoSanguineo = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        carteiraSus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        escolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t\t", "Ensino Fundamental", "Ensino Médio", "Ensino Superior", "Pós-Graduação", "Mestrado", "Doutorado", "Não fiz" }));
        getContentPane().add(escolaridade);
        escolaridade.setBounds(440, 90, 121, 30);

        profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(profissao);
        profissao.setBounds(570, 90, 120, 30);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(440, 90, 120, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel12.setText("Profissão");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(570, 70, 60, 14);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 70, 100, 14);

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(cpf);
        cpf.setBounds(320, 30, 110, 30);

        nomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(nomeCompleto);
        nomeCompleto.setBounds(120, 30, 190, 30);

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 100, 70, 20);

        dataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(dataNascimento);
        dataNascimento.setBounds(550, 30, 140, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Nome Completo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 10, 100, 14);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setText("RG");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(440, 10, 30, 14);

        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(telefone);
        telefone.setBounds(320, 90, 110, 30);

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 102));
        jButton3.setText("Confirmar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(560, 320, 120, 40);
        getContentPane().add(email);
        email.setBounds(120, 90, 190, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setText("Data de Nascimento");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(550, 10, 120, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Hq8za.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 0, 90, 100);

        rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        getContentPane().add(rg);
        rg.setBounds(440, 30, 100, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel15.setText("CPF");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(320, 10, 120, 14);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setText("Telefone");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(320, 70, 60, 14);


        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(bairro);
        bairro.setBounds(390, 150, 130, 30);


        Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(Rua);
        Rua.setBounds(260, 150, 120, 30);
        getContentPane().add(cidade);
        cidade.setBounds(120, 150, 130, 30);
        
        senha.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		jTextField10ActionPerformed(evt);
        	}
        });
        
        getContentPane().add(senha);
        senha.setBounds(520, 150, 70, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel18.setText("Rua");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(260, 130, 60, 14);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel19.setText("Bairro");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(390, 130, 60, 14);
        
        jLabel60.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel60.setText("Senha");
        getContentPane().add(jLabel60);
        jLabel60.setBounds(520, 130, 60, 14);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel20.setText("Cidade");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(120, 130, 100, 14);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel21.setText("Escolaridade");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(440, 70, 80, 14);

        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        getContentPane().add(cep);
        cep.setBounds(10, 150, 100, 30);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel22.setText("CEP");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 130, 100, 14);
        

        jLabel23.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel23.setText("Complemento");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(590, 130, 100, 14);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel25.setText("UF");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(120, 190, 40, 14);

        estadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t\t", "Solteiro(a)", "Separado(a)", "Casado(a)", "Divorciado(a)", "Viuvo(a)", "Namorando" }));
        getContentPane().add(estadoCivil);
        estadoCivil.setBounds(170, 210, 100, 30);

        jLabel30.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel30.setText("Estado Civil");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(170, 190, 100, 14);

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField27);
        jTextField27.setBounds(170, 210, 100, 30);

        jLabel31.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel31.setText("Sexo");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(280, 190, 100, 14);

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     \t", "Masculino", "Feminino", "Outro" }));
        getContentPane().add(sexo);
        sexo.setBounds(280, 210, 100, 30);

        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField28);
        jTextField28.setBounds(280, 210, 100, 30);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel26.setText("Nacionalidade");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(10, 190, 100, 14);

        nacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });
        getContentPane().add(nacionalidade);
        nacionalidade.setBounds(10, 210, 100, 30);

        complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        getContentPane().add(complemento);
        complemento.setBounds(590, 150, 100, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Observações...");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 270, 530, 140);

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(560, 370, 120, 40);

        jLabel32.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel32.setText("Tipo Sanguineo");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(390, 190, 100, 14);

        tipoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t\t", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        getContentPane().add(tipoSanguineo);
        tipoSanguineo.setBounds(390, 210, 100, 30);
        
        uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t\t", "MT", "BA", "RJ", "MG", "GO", "RS", "CE", "SP", "PR", "SC", "PE", "PA", "ES", "AM", "PI", "SE", "PB", "MA", "MS", "RN", "AL", "AC", "TO", "RR", "RR", "AP"  }));
        getContentPane().add(uf);
        uf.setBounds(115, 210, 50, 30);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel27.setText("N° Carteira do SUS");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(500, 190, 110, 14);

        carteiraSus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });
        getContentPane().add(carteiraSus);
        carteiraSus.setBounds(500, 210, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tema.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 420);

        setBounds(0, 0, 713, 456);       
        
        
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
     
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
      
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
      
    }//GEN-LAST:event_jTextField9ActionPerformed

    

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
      
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    CancelarCadastro cancelarcadastro = new CancelarCadastro();
    cancelarcadastro.setVisible(true);
    dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CadastroConcluido concluido = new CadastroConcluido();
        confirmar();
        Paciente p = new PacienteDAO().procurarPorNome(nomeCompleto.getText());
        concluido.setNome(Integer.toString(p.getId()), nomeCompleto.getText()); 
            
        concluido.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        
    }//GEN-LAST:event_jTextField32ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JComboBox<String> estadoCivil;
    private javax.swing.JComboBox<String> tipoSanguineo;
    private javax.swing.JComboBox<String> escolaridade;
    private javax.swing.JComboBox<String> uf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField Rua;
    private javax.swing.JTextField senha;
    private javax.swing.JTextField profissao;
    private javax.swing.JTextField dataNascimento;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField nomeCompleto;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField nacionalidade;
    private javax.swing.JTextField complemento;
    private javax.swing.JTextField carteiraSus;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField email;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField bairro;
    // End of variables declaration//GEN-END:variables
    
    public void confirmar() {
    	String nomeMae = "";
        
    	Paciente p = new Paciente(nomeCompleto.getText(), cpf.getText(), telefone.getText(), email.getText(), senha.getText(), dataNascimento.getText(), cidade.getText(), bairro.getText(), cep.getText(), uf.getSelectedItem().toString(), estadoCivil.getSelectedItem().toString(), rg.getText(), nomeMae, escolaridade.getSelectedItem().toString(), profissao.getText(), Rua.getText(), complemento.getText(), nacionalidade.getText(), sexo.getSelectedItem().toString(), tipoSanguineo.getSelectedItem().toString(), carteiraSus.getText());
    	new PacienteDAO().adicionar(p);
    	System.out.println("Cadastro Concluído");
    }
    
    // Done by: Victor Kobinski e Silva
    // UEPG - State University of Ponta Grossa
    
}
