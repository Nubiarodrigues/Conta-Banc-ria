package CONTA;

public class ContaCorrente extends Conta {

	public double limiteChequeEspecial = 200.0;

	//CONSTUTOR
	public ContaCorrente(String titular, double limiteChequeEspecial) {
		super(titular, limiteChequeEspecial);
	}
	
	
	//ASSINATURA DO MÉTODO
	@Override
	public void sacar(double valor) {
		if (valor <= saldoTitular + limiteChequeEspecial) {
			saldoTitular -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldoTitular);
        } else {
            System.out.println("Saldo insuficiente (considerando o cheque especial) para realizar o saque.");
        }
		
	}

}
