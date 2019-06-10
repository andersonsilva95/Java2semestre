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
		
		btnCadPF.setBounds(100, 100, 100, 100);
		btnCadPF.addActionListener(new ActionListener(){
			@Overrider
			public void actionPerformed(ActionEvent e) {
				view.PFisica pf = new view.PFisica();
			}
		});
		pane.add(btnCadPF);
		
		btnCadPJ.setBounds(500, 250, 150, 30);
		btnCadPJ.addActionListener(new PJuridica(){
			@Override
			public void actionPerforme(ActionEvent actionEvent) {
				PJuridica pjuri = new PJuridica();
			}
		});
		pane.add(btnCadPJ);
			this.setSize(500, 500);
			this.setResizable(false);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		Exe janela = new Exe();
	}
	
}
