package View;

import javax.swing.JOptionPane;

public class ViewCadastrarCliente {

	// Atributos
	private String nome;
	private String CPF;
	private String idade;

	// Metodos Get's e Set's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	// Metodo para obter dados do cliente a ser inserido
	public void obterDadosCliente() {

		// Obtendo dados do clientes
		this.setNome(JOptionPane.showInputDialog("informe o nome do cliente: "));
		this.setCPF(JOptionPane.showInputDialog("Infome o CPF do cliente: "));
		this.setIdade("infome a idade do cliente: ");
	}

}
