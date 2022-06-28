package View;

import modelPacienteDate.PacienteData;
import java.awt.Font;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelBeans.BeansPaciente;
import modelBeans.ModeloTabela;
import modelConection.ConexaoBD;
import modelDao.DaoPaciente;

/**
 *
 * @author daniel
 */
public class PesquisarPaciente extends javax.swing.JInternalFrame {

    BeansPaciente mod = new BeansPaciente();
    DaoPaciente control = new DaoPaciente();
    ConexaoBD conex = new ConexaoBD();
    
    int flag = 0;
    public PesquisarPaciente() {
        initComponents();
        preencherTabela("select * from paciente order by paci_nome");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSlider1 = new javax.swing.JSlider();
        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxCormobidade = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxResidencia = new javax.swing.JComboBox();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jtCOD = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        setPreferredSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Consultar Paciente");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createSequentialGroup()
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTablePaciente.setBorder(new javax.swing.border.MatteBorder(null));
        jTablePaciente.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePaciente);

        jButtonPesquisa.setBackground(new java.awt.Color(17, 128, 216));
        jButtonPesquisa.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisa.setText("Pesquisar");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        jLabel9.setText("Cormobidade");

        jComboBoxCormobidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Cormobidade", "Autista", "Cadeirante", "Câncer", "Deficiente Auditivo", "Deficiente Visual", "Deficiente Físico", "Idoso" }));
        jComboBoxCormobidade.setEnabled(false);
        jComboBoxCormobidade.setMinimumSize(new java.awt.Dimension(51, 22));
        jComboBoxCormobidade.setPreferredSize(new java.awt.Dimension(51, 22));

        jLabel18.setText("Telefone Celular");

        jLabel2.setText("Nome");

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setEnabled(false);
        jFormattedTextFieldTelefone.setPreferredSize(new java.awt.Dimension(4, 22));

        jTextFieldNome.setEnabled(false);

        jLabel7.setText("CPF");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setEnabled(false);
        jFormattedTextFieldCpf.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        jFormattedTextFieldCpf.setMinimumSize(new java.awt.Dimension(4, 22));
        jFormattedTextFieldCpf.setPreferredSize(new java.awt.Dimension(47, 22));

        jLabel16.setText("Data de nascimento");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setEnabled(false);
        jFormattedTextFieldData.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        jFormattedTextFieldData.setMinimumSize(new java.awt.Dimension(4, 22));
        jFormattedTextFieldData.setPreferredSize(new java.awt.Dimension(34, 22));
        jFormattedTextFieldData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDataFocusLost(evt);
            }
        });

        jLabel15.setText("Residencia");

        jComboBoxResidencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Centro", "Zona Rural", "Agrovila - Tainha", "Agrovila - Mulunguzinho", "Bairro -  Castelo Branco", "Bairro - Emília Borges", "Bairro - José Pessoa de Brito", "Bairro - Rua Nova", "Bairro - Rua da Palha", "Bairro -  Santo Amaro", "Bairro -  São Sebastião", "Sítio - Canafistula", "Sítio - Canafistinha", "Sítio - Cachoeira", "Sítio - Cipoal", "Sítio - Cuité", "Sítio - Queimadas", "Sítio - Lagoa das Velhas", "Sítio - Lagoa dos Felix", "Sítio - Maliça", "Sítio - Olho D`àgua", "Sítio - Pacheco", "Sítio - Piabas", "Sítio - Pitombas", "Sítio - Santa Lúcia", "Sítio - Violeta", "Sítio - Taumatá de Violeta", "Sítio - Genipapo de Violeta" }));
        jComboBoxResidencia.setEnabled(false);
        jComboBoxResidencia.setMinimumSize(new java.awt.Dimension(103, 22));
        jComboBoxResidencia.setPreferredSize(new java.awt.Dimension(103, 22));

        jButtonEditar.setBackground(new java.awt.Color(17, 128, 216));
        jButtonEditar.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(0, 255, 0));
        jButtonSalvar.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(255, 0, 51));
        jButtonExcluir.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jtCOD.setFont(new java.awt.Font("Fira Sans", 0, 1)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(38, 38, 38)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(26, 26, 26)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16)
                                                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel18)
                                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jComboBoxCormobidade, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(39, 39, 39)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jComboBoxResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(29, 29, 29)
                                                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 13, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCormobidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //TEXTO DO CABECARIO
    private String cabecario = "Consulta de Paciente";
    

    public String getCabecario() {
        return cabecario;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }
     
    //INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Colocar a variavel cabecario no jlabel
        lbCabecalho.setText(cabecario);
    }//GEN-LAST:event_formInternalFrameOpened
      
    //FORM EXIBIDO
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //Colocar a variavel cabecario no jlabel
        lbCabecalho.setText(cabecario);
    }//GEN-LAST:event_formComponentShown
    
    private void jTablePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacienteMouseClicked
        String nome_paciente = ""+jTablePaciente.getValueAt(jTablePaciente.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from paciente where paci_nome='"+nome_paciente+"' order by paci_nome");
        try {
            conex.rs.first();
            
            jtCOD.setText(String.valueOf(conex.rs.getInt("paci_codigo")));
            jTextFieldNome.setText(conex.rs.getString("paci_nome"));
            jFormattedTextFieldCpf.setText(conex.rs.getString("paci_cpf"));
            jFormattedTextFieldTelefone.setText(conex.rs.getString("paci_telefone"));
            jFormattedTextFieldData.setText(conex.rs.getString("paci_nasc"));
            jComboBoxCormobidade.setSelectedItem(conex.rs.getString("cormobidade"));
            jComboBoxResidencia.setSelectedItem(conex.rs.getString("residencia"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados" + ex);
        }
        conex.desconecta();
        jButtonPesquisa.setEnabled(true);  
        jTextFieldPesquisa.setEditable(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTablePacienteMouseClicked

    private void jFormattedTextFieldDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataFocusLost
        try{
            PacienteData cliente = new PacienteData();
            cliente.setDataNascimento(jFormattedTextFieldData.getText());
            String dia = cliente.getDataNascimento().substring(0, 2);
            String mes = cliente.getDataNascimento().substring(3, 5);
            String ano = cliente.getDataNascimento().substring(6, 10);

            if(Integer.parseInt(dia) > 31 || Integer.parseInt(mes) > 12 || Integer.parseInt(ano) < 1900){
                JOptionPane.showMessageDialog(rootPane,
                    "A data inserida no campo não é uma data válida. \n"
                    + "Preencha-o novamente com uma data válida!",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,
                "Você tentou inserir uma data inválida ou não preencheu o campo. \n"
                + "Preencha-o novamente com uma data válida!",
                "Erro",
                JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jFormattedTextFieldDataFocusLost

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
       mod.setPesquisa(jTextFieldPesquisa.getText());
        BeansPaciente model = control.buscaPaciente(mod);
        jTextFieldNome.setText(model.getNomePac());
        jFormattedTextFieldCpf.setText(String.valueOf(model.getCpfPac()));
        jFormattedTextFieldTelefone.setText(String.valueOf(model.getTelefonePac()));
        jFormattedTextFieldData.setText(String.valueOf(model.getNas()));
        jComboBoxCormobidade.setSelectedItem(model.getCormobidade());
        jComboBoxResidencia.setSelectedItem(model.getResidencia()); 
        
        
        preencherTabela("select * from paciente where paci_nome like'%" + jTextFieldPesquisa.getText()+"%' order by paci_nome");
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;  
              
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
        jComboBoxCormobidade.setEnabled(true);
        jComboBoxResidencia.setEnabled(true);
        jButtonCancelar.setEnabled(true);

        jButtonSalvar.setEnabled(true);
        
        jTextFieldPesquisa.setEnabled(true);
        jButtonPesquisa.setEnabled(true);   
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Preencha o NOME do PACIENTE!");
            jTextFieldNome.requestFocus();
        }else if(jFormattedTextFieldCpf.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Preencha o CPF do PACIENTE!");
            jFormattedTextFieldCpf.requestFocus();
        }else if(jFormattedTextFieldTelefone.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Preencha o TELEFONE do PACIENTE!");
            jFormattedTextFieldTelefone.requestFocus();
        }else if(jFormattedTextFieldData.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Preencha a DATA DE NASCIMENTO do PACIENTE!");
            jFormattedTextFieldData.requestFocus();
        }else{
            if(flag==1){
                mod.setNomePac(jTextFieldNome.getText());
                mod.setTelefonePac(jFormattedTextFieldTelefone.getText());
                mod.setCpfPac(jFormattedTextFieldCpf.getText());
                mod.setNas(jFormattedTextFieldData.getText());
                mod.setCormobidade((String) jComboBoxCormobidade.getSelectedItem());
                mod.setResidencia((String) jComboBoxResidencia.getSelectedItem());

                control.Salvar(mod);
                preencherTabela("select * from paciente where paci_nome like'%" + mod.getPesquisa()+"%' order by paci_nome");

                jTextFieldNome.setText("");
                jFormattedTextFieldTelefone.setText("");
                jTextFieldNome.setEnabled(false);
                jFormattedTextFieldTelefone.setEnabled(false);
                jFormattedTextFieldCpf.setText("");
                jFormattedTextFieldCpf.setEnabled(false);
                jFormattedTextFieldData.setText("");
                jFormattedTextFieldData.setEnabled(false);
                jComboBoxCormobidade.setEnabled(false);
                jComboBoxResidencia.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jTextFieldPesquisa.setEnabled(true);
                jButtonPesquisa.setEnabled(true);   
                

               
            }else{
                mod.setCodPac(Integer.parseInt(jtCOD.getText()));
                mod.setNomePac(jTextFieldNome.getText());
                mod.setTelefonePac(jFormattedTextFieldTelefone.getText());
                mod.setCpfPac(jFormattedTextFieldCpf.getText());
                mod.setNas(jFormattedTextFieldData.getText());
                mod.setCormobidade((String) jComboBoxCormobidade.getSelectedItem());
                mod.setResidencia((String) jComboBoxResidencia.getSelectedItem());
                
                try {
                    control.Editar(mod);
                    preencherTabela("select * from paciente order by paci_nome");
                    jTextFieldNome.setEnabled(false);
                    jFormattedTextFieldTelefone.setEnabled(false);
                    jFormattedTextFieldCpf.setText("");
                    jFormattedTextFieldCpf.setEnabled(false);
                    jFormattedTextFieldData.setText("");
                    jFormattedTextFieldData.setEnabled(false);
                    jComboBoxCormobidade.setEnabled(false);
                    jComboBoxResidencia.setEnabled(false);
                    jButtonSalvar.setEnabled(false);
                    jtCOD.setText("");
                    jTextFieldNome.setText("Digite o nome do paciente...");
                    jTextFieldNome.setEnabled(false);
                    jFormattedTextFieldTelefone.setText("(83) 00000-0000");
                    jFormattedTextFieldCpf.setText("000.000.000-00");
                    jFormattedTextFieldData.setText("10/10/2000");
                    jButtonCancelar.setEnabled(false);
                    jTextFieldPesquisa.setEnabled(true);
                    jButtonPesquisa.setEnabled(true);   
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }               
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldTelefone.setEnabled(!true);
        jFormattedTextFieldCpf.setEnabled(!true);
        jFormattedTextFieldData.setEnabled(!true);
        jComboBoxCormobidade.setEnabled(!true);
        jComboBoxResidencia.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
        jtCOD.setText("");
        jTextFieldNome.setText("");
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldTelefone.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldData.setText("");
        
        jTextFieldPesquisa.setEditable(true);
        jButtonPesquisa.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodPac(Integer.parseInt(jtCOD.getText()));
            control.Excluir(mod);
            preencherTabela("select * from paciente order by nome_paciente");
            
            jtCOD.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldTelefone.setText("");
            jFormattedTextFieldCpf.setText("");
            jFormattedTextFieldData.setText("");
            jTextFieldNome.setEnabled(false);

            jTextFieldPesquisa.setEnabled(true);
            jButtonPesquisa.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonSairMouseClicked


    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Nome", "CPF", "Telefone", "Data", "Cormobidade", "Residencia"};
        
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("paci_codigo"), conex.rs.getString("paci_nome"), conex.rs.getString("paci_cpf"), conex.rs.getString("paci_telefone"), conex.rs.getString("paci_nasc"), conex.rs.getString("cormobidade"), conex.rs.getString("residencia")});
                
            }while(conex.rs.next());
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque outro PACIENTE para preencher a tabela!");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTablePaciente.setModel(modelo);
        jTablePaciente.getColumnModel().getColumn(0).setPreferredWidth(43);
        jTablePaciente.getColumnModel().getColumn(0).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTablePaciente.getColumnModel().getColumn(1).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(2).setPreferredWidth(115);
        jTablePaciente.getColumnModel().getColumn(2).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(3).setPreferredWidth(118);
        jTablePaciente.getColumnModel().getColumn(3).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTablePaciente.getColumnModel().getColumn(4).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(5).setPreferredWidth(130);
        jTablePaciente.getColumnModel().getColumn(5).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(6).setPreferredWidth(140);
        jTablePaciente.getColumnModel().getColumn(6).setResizable(false);
        
        
        jTablePaciente.getTableHeader().setReorderingAllowed(false);
        jTablePaciente.setAutoResizeMode(jTablePaciente.AUTO_RESIZE_OFF);
        jTablePaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconecta();
    } 

    
    
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
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PesquisarPaciente().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JLabel jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCormobidade;
    private javax.swing.JComboBox jComboBoxResidencia;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JTextField jtCOD;
    private javax.swing.JLabel lbCabecalho;
    // End of variables declaration//GEN-END:variables
}
