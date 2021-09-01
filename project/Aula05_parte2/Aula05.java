package Aula05_parte2;

import java.util.Scanner;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String pergunta, dono, tipoConta;
		int numConta;

		int saida = 0;
		
		double deposito =0, saque=0;

		contaBanco cb = new contaBanco();

		System.out.print("Deseja abrir uma conta? (S/N): ");
		pergunta = entrada.next();
		System.out.println(" ");
		if (pergunta.equalsIgnoreCase("n")) {
			System.out.println("Não é possível realizar nenhuma operação!");
		} else {
			cb.abrirConta(pergunta);

			System.out.println(" ");
			System.out.print("Digite o nome do dono da conta: ");
			dono = entrada.next();
			cb.setDono(dono);

			System.out.println(" ");
			System.out.println("Tipos de conta: ");
			System.out.println("CC - Conta Corrente");
			System.out.println("CP - Conta Poupança");
			System.out.println(" ");
			System.out.print("Digite o tipo da conta: ");
			tipoConta = entrada.next();
			cb.setTipoConta(tipoConta);
			cb.escolherConta();

			System.out.print("Digite o número da sua conta: ");
			numConta = entrada.nextInt();
			cb.setNumeroConta(numConta);
			
			cb.estadoAtual();

			System.out.println(" ");
			while (saida != 5) {
				System.out.println("-------- OPÇÕES --------");
				System.out.println(" ");
				System.out.println("1 - Sacar");
				System.out.println("2 - Depositar");
				System.out.println("3 - Ver status da conta");
				System.out.println("4 - Fechar a conta");
				System.out.println("5 - Sair");
				System.out.print("Digite sua opção: ");
				saida = entrada.nextInt();

				switch (saida) {
				case 1:
					System.out.println("Valor do saque: ");
					saque = entrada.nextDouble();
					cb.sacar(saque);
					break;

				case 2:
					System.out.println("Valor do deposito: ");
				    deposito = entrada.nextDouble();
					cb.depositar(deposito);
					break;

				case 3:
					cb.estadoAtual();
					break;

				case 4:
					cb.fecharConta();
					break;
				}
			}

		}
		
		System.out.println(" ");
		System.out.println("Obrigado por optar a trabalhar com o banco WE");

	}

}
