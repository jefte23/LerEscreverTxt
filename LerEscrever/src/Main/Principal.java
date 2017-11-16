package Main;

import Control.ControleCadastrarCliente;
import Control.ControleExibeClientes;
import Model.BD;

public class Principal {

	public static void main(String[] args) {

		// instanciar o banco de dados
		BD bd = new BD();

		// Instanciar controleExibirClientes
		ControleExibeClientes cec = new ControleExibeClientes(bd);
		// instancia a classe de controle
		ControleCadastrarCliente ccc = new ControleCadastrarCliente(bd);

		// Executar o metodo cadastra cliente
		ccc.CadastrarCliente();

		// inserir um novo cliente
		ccc.CadastrarCliente();

		// Exibir todos os clientes
		cec.exibeCliente();
	}

}
