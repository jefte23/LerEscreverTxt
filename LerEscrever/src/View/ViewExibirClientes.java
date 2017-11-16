package View;

import java.util.ArrayList;

import Model.Cliente;

public class ViewExibirClientes {

	public void exibeCliente(ArrayList<Cliente> clientes) {

		String todosClientes = "";

		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i) + "\n");
		}
	}
}
