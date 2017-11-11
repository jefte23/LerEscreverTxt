package Main;

import java.util.ArrayList;

import Model.BD;
import Model.Cliente;

public class Principal {

	public static void main(String[] args) {

		// instanciar o banco de dados
		BD bd = new BD();
		// retornar o ArrayList de clientes
		ArrayList<Cliente> clientes = bd.getClientes();
		// Percorrer o ArrayList de clientes
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));

		}
	}

}
