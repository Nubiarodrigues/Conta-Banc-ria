package CONTA;

abstract class Conta {

	public String titular;
	public double saldoTitular;
	
	//CONSTRUTOR
	public Conta (String titular, double saldoTitular) {
		this.titular = titular;
		this.saldoTitular = saldoTitular;
	}
	
	//MÉTODO
	public void depositar(double valor) {
		saldoTitular += valor;
		System.out.println("Depósito de R$ " + valor + " realizado. Novo Saldo R$ " + saldoTitular);
	}
	
	//ASSINATURA DO MÉTODO
	public abstract void sacar(double valor);
	
	//MÉTODO
	public void exibirSaldo() {
		System.out.println("Saldo atual R$ " + saldoTitular);
	}
}
