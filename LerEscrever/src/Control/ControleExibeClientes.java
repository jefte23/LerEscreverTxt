package Control;

import java.util.ArrayList;

import Model.BD;
import Model.Cliente;
import View.ViewExibirClientes;

public class ControleExibeClientes {

	private BD bd;
	private ViewExibirClientes vec;

	public ControleExibeClientes(BD bd) {
		this.bd = bd;
		// Instanciar a view
		this.vec = new ViewExibirClientes();
	}

	public void exibeCliente() {
		// retornar o ArrayList de clientes
		ArrayList<Cliente> clientes = bd.getClientes();
		// Percorrer o ArrayList de clientes
		for (int i = 0; i < clientes.size(); i++) {
			// Executar o metodo para exivir todos os clientes
			this.vec.exibeCliente(clientes);

		}
	}
}
