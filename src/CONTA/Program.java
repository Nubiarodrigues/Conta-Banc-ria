package CONTA;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//CLIENTE POUPAN�A
		System.out.println("Titular: ");
		String titular1 = sc.nextLine();
		
		System.out.println("Valor inicial para Conta Poupan�a: R$ ");
		double valor1 = sc.nextDouble();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(titular1, valor1);
		
		//VALOR CORRENTE
		System.out.println("Valor inicial para Conta Corrente: R$ ");
		double valor2 = sc.nextDouble();
		ContaCorrente contaCorrente = new ContaCorrente(titular1, valor2);
		
		int opcao;

        do {
            System.out.println("\nEscolha uma op��o: \n");
            System.out.println("1. Consultar saldo da conta poupan�a");
            System.out.println("2. Consultar saldo da conta corrente");
            System.out.println("3. Depositar em conta poupan�a");
            System.out.println("4. Depositar em conta corrente");
            System.out.println("5. Sacar de conta poupan�a");
            System.out.println("6. Sacar de conta corrente");
            System.out.println("7. Calcular rendimento da conta poupan�a");
            System.out.println("8. Sair \n");

            System.out.print("Op��o: \n");
            opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    contaPoupanca.exibirSaldo();
                    break;
                case 2:
                    contaCorrente.exibirSaldo();
                    break;
                case 3:
                    System.out.println(titular1 + ": Digite o valor a depositar na conta poupan�a:");
                    double valorDepositoPoupanca = sc.nextDouble();
                    contaPoupanca.depositar(valorDepositoPoupanca);
                    break;
                case 4:
                    System.out.println(titular1 + ": Digite o valor a depositar na conta corrente:");
                    double valorDepositoCorrente = sc.nextDouble();
                    contaCorrente.depositar(valorDepositoCorrente);
                    break;
                case 5:
                    System.out.println(titular1 + ": Digite o valor a sacar da conta poupan�a:");
                    double valorSaquePoupanca = sc.nextDouble();
                    contaPoupanca.sacar(valorSaquePoupanca);
                    break;
                case 6:
                    System.out.println(titular1 + ": Digite o valor a sacar da conta corrente:");
                    double valorSaqueCorrente = sc.nextDouble();
                    contaCorrente.sacar(valorSaqueCorrente);
                    break;
                case 7:
                    contaPoupanca.calcularRendimento();
                    break;
                case 8:
                    System.out.println("Saindo do programa. At� mais!");
                    break;
                default:
                    System.out.println("Op��o inv�lida. Tente novamente.");
            }

        } while (opcao != 8);

        sc.close();
    }
}

