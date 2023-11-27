package CONTA;

abstract class Conta {

	public String titular;
	public double saldoTitular;
	
	//CONSTRUTOR
	public Conta (String titular, double saldoTitular) {
		this.titular = titular;
		this.saldoTitular = saldoTitular;
	}
	
	//M�TODO
	public void depositar(double valor) {
		saldoTitular += valor;
		System.out.println("Dep�sito de R$ " + valor + " realizado. Novo Saldo R$ " + saldoTitular);
	}
	
	//ASSINATURA DO M�TODO
	public abstract void sacar(double valor);
	
	//M�TODO
	public void exibirSaldo() {
		System.out.println("Saldo atual R$ " + saldoTitular);
	}
}
