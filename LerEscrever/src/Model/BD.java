package Model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {

	// Atributo
	private ArrayList<Cliente> clientes;
	private String fileName = "clientes.txt";

	// Metodo construtor
	public BD() {
		// Instanciar o arrayList
		this.clientes = new ArrayList<Cliente>();

		// instanciar o DocumentReader
		DocumentReader dr = new DocumentReader();

		// Ler linhas do arquivoclientes.txt
		ArrayList<String> linhas = dr.read(fileName);

		// Percorrer o ArrayList criando os clientes
		for (int i = 0; i < linhas.size(); i++) {
			// Separa a linha em um array de string
			String[] linhaCliente = linhas.get(i).split(";");
			// cria o cliente com os dados da linha
			Cliente c = new Cliente(linhaCliente[0], linhaCliente[1], Integer.parseInt(linhaCliente[2]));
			// coloca o cliente no ArrayList
			this.clientes.add(c);
		}
	}

	// Metodo que grava cliente em arquivo .txt
	public void gravarCliente(Cliente c) {
		this.clientes.add(c);
		// Transformar cliente em string
		String cliente = c.getNome() + ";" + c.getCPF() + ";" + c.getIdade();
		// Instanciar o CDocumentWriter
		DocumentWriter dw = new DocumentWriter();
		// Gravar documento no arquivo
		dw.write(this.fileName, cliente);
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

}
