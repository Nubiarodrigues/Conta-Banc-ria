package CONTA;

public class ContaPoupanca extends Conta {

	public double taxaRendimentoMes = 0.006061;

	
	//CONSTRUTOR
	public ContaPoupanca(String titular, double taxaRendimentoMes) {
		super(titular, taxaRendimentoMes);		
	}
	
	//M�TODO
	public double calcularRendimento() {
	    double rendimentoTitular = saldoTitular * taxaRendimentoMes;
	    saldoTitular += rendimentoTitular;
	    System.out.println("Rendimento aplicado.");
	    System.out.printf("Novo saldo: R$ %.2f%n", saldoTitular);
	    System.out.printf("A taxa de rendimento ao m�s: R$ %.2f%n", rendimentoTitular);
	    return rendimentoTitular;
	}
	
	//ASSINATURA DO M�TODO
	@Override
	public void sacar(double valor) {
		if(valor <= saldoTitular) {
			saldoTitular -= valor;
			System.out.println("Saque de R$ " + valor + " realizado. Novo saldo R$ " + saldoTitular);
		}else {
			System.out.println("Saldo insuficiente para saque!");
		}
		
	}

}
