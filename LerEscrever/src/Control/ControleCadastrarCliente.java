package Control;

import Model.BD;
import Model.Cliente;
import View.ViewCadastrarCliente;

public class ControleCadastrarCliente {

	private BD bd = new BD();

	public ControleCadastrarCliente(BD bd) {
		this.bd = bd;
	}

	// metodo para obter dados do cliente e gravar no BD
	public void CadastrarCliente() {
		// Instanciar a View
		ViewCadastrarCliente vcc = new ViewCadastrarCliente();

		// chamar metodo para obter dados
		vcc.obterDadosCliente();

		// Instanciar um objeto da classe cliente com os dados digitados
		Cliente c = new Cliente(vcc.getNome(), vcc.getCPF(), Integer.parseInt(vcc.getIdade()));

		// guardar cliente no banco de dados
		this.bd.gravarCliente(c);
	}

}
