package contaeCliente;

public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta();
		//set está atribuindo
		conta.setNumero(1337);
		//get está imprimindo a informação
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		paulo.setCpf("222.222.222-22");
		
		paulo.setProfissão("programador");
		
		System.out.println(conta.getTitular().getNome());
	}

}
