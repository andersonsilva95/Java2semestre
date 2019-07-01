package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Exe extends JFrame {
	JButton btnCadPF = new JButton("Cadastrar pessoa Física");
	JButton btnCadPJ = new JButton("Cadastrar pessoa Jurídica");
	
	
	public Exe() {
		super("Tela de Cadastro");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		btnCadPF.setBounds(100, 100, 200, 50);
		btnCadPF.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				view.PFisica pf = new view.PFisica();
			}
		});
		pane.add(btnCadPF);
		/*Botão de pessoa júridica*/
		btnCadPJ.setBounds(100, 200, 200, 50);
		btnCadPJ.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				PJuridica pjuri = new PJuridica();
			}
		});
		
		/*tamanho da tela*/
		pane.add(btnCadPJ);
			this.setSize(400, 300);
			this.setResizable(false);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		Exe janela = new Exe();
	}
	
}
