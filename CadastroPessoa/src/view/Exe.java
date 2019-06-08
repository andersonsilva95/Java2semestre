package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exe extends JFrame {
	JButton btnCadPF = new JButton("Cadastrar pessoa Física");
	JButton btnCadPJ = new JButton("Cadastrar pessoa Jurídica");
	
	
	public Executar() {
		super("Tela de Cadastro");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		btnCadPF.setBounds(100, 100, 100, 100);
		btnCadPF.addActionListener(new ActionListener()){
			@Overrider
			public void actionPerformed(ActionEvent e) {
				view.PFisica pf = new view.PFisica();
			}
		});
		paine.add(btnCadPF);
	}
	
}
