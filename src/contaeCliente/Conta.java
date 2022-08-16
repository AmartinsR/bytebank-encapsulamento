package contaeCliente;

public class Conta {
	private double saldo;
	private int agencia;
	private int conta;
	private int numero;
	// cliente é a classe que foi criada, a classe Conta, está apontado para a
	// classe Cliente
	// composição na orientação a objetos, uuma classe apontando para outra
	private Cliente titular;
	// static é um atributo da classe conta, será guardado e pertencerá a classe
	private static int total;

	// um construtor pode receber parametros
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);

	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// return palavra chave que cessa a execução do método
			return true;
		} else {
			return false;
		}
		// quando um método tem mais de um argumento, dentro dos (), separe-os com,

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;

	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor <=0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	//static pois é da classe, ao invoca-lo, pertecerá a classe a informação
	public static int getTotal() {
		return Conta.total;
	}
}