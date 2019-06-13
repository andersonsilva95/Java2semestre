package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.PJuridicaa;


public class PJuridica extends JFrame{

	 JLabel lblRzs = new JLabel("Razão Social: ");
	    JTextField txtRzs = new JTextField();
	    JLabel lblCnpj = new JLabel("CNPJ: ");
	    JTextField txtCnpj = new JTextField();
	    JLabel lblIe = new JLabel("Insc. Est.: ");
	    JTextField txtIe = new JTextField();
	    JLabel lblEnd = new JLabel("Endereço: ");
	    JTextField txtEnd = new JTextField();
	    JLabel lblCidade = new JLabel("Cidade: ");
	    JTextField txtCidade = new JTextField();
	    JLabel lblTel = new JLabel("Telefone: ");
	    JTextField txtTel = new JTextField();
	    JButton btnLimpar = new JButton("Limpar");
	    JButton btnCad = new JButton("Cadastrar");

	    public PJuridica() {
	        super("Pessoa Jurídica");
	        Container pane = this.getContentPane();
	        pane.setLayout(null);

	        lblRzs.setBounds(20, 20, 100, 30);
	        pane.add(lblRzs);
	        txtRzs.setBounds(130, 20, 250, 30);
	        pane.add(txtRzs);
	        lblCnpj.setBounds(20, 60, 100, 30);
	        pane.add(lblCnpj);
	        txtCnpj.setBounds(130, 60, 120, 30);
	        pane.add(txtCnpj);
	        lblIe.setBounds(20, 100, 100, 30);
	        pane.add(lblIe);
	        txtIe.setBounds(130, 100, 100, 30);
	        pane.add(txtIe);
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
	                txtRzs.setText("");
	                txtCnpj.setText("");
	                txtIe.setText("");
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
	                PJuridicaa pj = new PJuridicaa();
	                pj.setRazaoSocial(txtRzs.getText());
	                pj.setCnpj(Double.parseDouble(txtCnpj.getText()));
	                pj.setInscricaoEstadual(Double.parseDouble(txtIe.getText()));
	                pj.setEndereco(txtEnd.getText());
	                pj.setCidade(txtCidade.getText());
	                pj.setTelefone(Long.parseLong(txtTel.getText()));
	                JOptionPane.showMessageDialog(null, "Razão Social: " + pj.getRazaoSocial() +
	                        "\n CNPJ: " + pj.getCnpj() + "\n Inscr. Est.: " + pj.getInscricaoEstadual() + "\n Endereço: " +
	                        pj.getEndereco() + "\n Cidade: " + pj.getCidade() + "\n Telefone: " + pj.getTelefone());
	            }
	        });
	        pane.add(btnCad);

	        this.setSize(400, 400);
	        this.setResizable(false);
	        this.setVisible(true);
	        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    }

}
