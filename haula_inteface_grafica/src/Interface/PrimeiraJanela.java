package Interface;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimeiraJanela {

	JFrame janela = new JFrame();
	JPanel painel = new JPanel();
	JLabel rotulo = new JLabel ("Seu nome é: ");
	JTextField texto = new JTextField(10);
	JButton botao = new JButton ("OK");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrimeiraJanela();
	}

	private PrimeiraJanela() {
		janela.setTitle("Exemplo de Flow Layout");
		janela.setSize(500,300);
		janela.setLocation(400,400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		painel.setLayout(new FlowLayout( FlowLayout.CENTER,30,20));
		painel.add(rotulo);
		painel.add(texto);
		painel.add(botao);
		
		janela.add(painel);
		janela.setVisible(true);
	}
	
}