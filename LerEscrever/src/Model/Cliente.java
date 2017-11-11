package Model;

public class Cliente {
	// Atributos
	private String nome;
	private String CPF;
	private int idade;

	// Metodo ToSttring
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", CPF=" + CPF + ", idade=" + idade + "]";
	}

	// Metodo Construtor
	public Cliente(String nome, String cPF, int idade) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.idade = idade;
	}

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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
