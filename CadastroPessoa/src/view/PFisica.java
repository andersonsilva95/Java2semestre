package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.PFisicaa;

public class PFisica extends JFrame{
	 JLabel lblNome = new JLabel("Nome: ");
	    JTextField txtNome = new JTextField();
	    JLabel lblCpf = new JLabel("CPF: ");
	    JTextField txtCpf = new JTextField();
	    JLabel lblIdade = new JLabel("Idade: ");
	    JTextField txtIdade = new JTextField();
	    JLabel lblEnd = new JLabel("Endereço: ");
	    JTextField txtEnd = new JTextField();
	    JLabel lblCidade = new JLabel("Cidade: ");
	    JTextField txtCidade = new JTextField();
	    JLabel lblTel = new JLabel("Telefone: ");
	    JTextField txtTel = new JTextField();
	    JButton btnLimpar = new JButton("Limpar");
	    JButton btnCad = new JButton("Cadastrar");

	    public PFisica() {
	        super("Pessoa Física");
	        Container pane = this.getContentPane();
	        pane.setLayout(null);

	        lblNome.setBounds(20, 20, 100, 30);
	        pane.add(lblNome);
	        txtNome.setBounds(130, 20, 250, 30);
	        pane.add(txtNome);
	        lblCpf.setBounds(20, 60, 100, 30);
	        pane.add(lblCpf);
	        txtCpf.setBounds(130, 60, 100, 30);
	        pane.add(txtCpf);
	        lblIdade.setBounds(20, 100, 100, 30);
	        pane.add(lblIdade);
	        txtIdade.setBounds(130, 100, 40, 30);
	        pane.add(txtIdade);
	        lblEnd.setBounds(20, 140, 100, 30);
	        pane.add(lblEnd);
	        txtEnd.setBounds(130, 140, 250, 30);
	        pane.add(txtEnd);
	        lblCidade.setBounds(20, 180, 100, 30);
	        pane.add(lblCidade);
	        txtCidade.setBounds(130, 180, 150, 30);
	        pane.add(txtCidade);
	        lblTel.setBounds(20, 220, 100, 30);
	        pane.add(lblTel);
	        txtTel.setBounds(130, 220, 100, 30);
	        pane.add(txtTel);
	        btnLimpar.setBounds(130, 315, 120, 30);
	        btnLimpar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent actionEvent) {
	                txtNome.setText("");
	                txtCpf.setText("");
	                txtIdade.setText("");
	                txtEnd.setText("");
	                txtCidade.setText("");
	                txtTel.setText("");
	            }
	        });
	        pane.add(btnLimpar);
	        btnCad.setBounds(260, 315, 120, 30);
	        btnCad.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent actionEvent) {
	                PFisicaa pessoaf = new PFisicaa();
	                pessoaf.setNome(txtNome.getText());
	                pessoaf.setCpf(Double.parseDouble(txtCpf.getText()));
	                pessoaf.setIdade(Integer.parseInt(txtIdade.getText()));
	                pessoaf.setEndereco(txtEnd.getText());
	                pessoaf.setCidade(txtCidade.getText());
	                pessoaf.setTelefone(Long.parseLong(txtTel.getText()));
	                JOptionPane.showMessageDialog(null, "Nome: " + pessoaf.getNome() +
	                        "\n CPF: " + pessoaf.getCpf() + "\n Idade: " + pessoaf.getIdade() + "\n Endereço: " +
	                        pessoaf.getEndereco() + "\n Cidade: " + pessoaf.getCidade() + "\n Telefone: " + pessoaf.getTelefone());
	            }
	        });
	        pane.add(btnCad);

	        this.setSize(400, 400);
	        this.setResizable(false);
	        this.setVisible(true);
	        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    }
}
