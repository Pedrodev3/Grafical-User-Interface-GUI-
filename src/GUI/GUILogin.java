package GUI;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author Pedro Victor Saraiva de Sá
 *
 */

@SuppressWarnings("serial")
public class GUILogin extends JFrame {
	private JTextField tfLogin;
	private JLabel lbLogin;
	private JLabel lbSenha;
	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	
	public GUILogin() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		// Definindo o formulário 
		
		setTitle("Login do Sistema");
		// É um padrão começar com 0, 0 -> Instrução para definir tamanho (setBounds)
		setBounds(0, 0, 300, 200);
		// Limpar antes de começar a jogar os objetos
		setLayout(null); 
		
		// Criando objetos para o formulário
		
		lbLogin = new JLabel("Login");
		tfLogin = new JTextField();
		lbSenha = new JLabel("Senha");
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");
		pfSenha = new JPasswordField();
		
		// definindo tamanho e posição dos objetos
		
		lbLogin.setBounds(50, 30, 80, 25); // x, y, altura, largura
		tfLogin.setBounds(120, 30, 120, 25);
		lbSenha.setBounds(50, 75, 80, 25);
		btLogar.setBounds(40, 120, 100, 25);
		btCancelar.setBounds(145, 120, 100, 25);
		pfSenha.setBounds(120, 75, 120, 25);
		
		// adicionando os objetos ao formulário
		add(lbLogin);
		add(tfLogin);
		add(lbSenha);
		add(btLogar);
		add(btCancelar);
		add(pfSenha);
	}
	
	private void definirEventos() {
		
		btCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Adicionado apenas quando ocorre um evento
		btLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(pfSenha.getPassword());
				
				if(tfLogin.getText().equals("fiap") && senha.equals("123abc")) {
					setVisible(false);
					JOptionPane.showMessageDialog(null, "Login com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Login ou senha errados!");
				}
			}
		});
		
	}
}
