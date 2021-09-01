package Aula05_parte2;

public class contaBanco {

	private boolean status;
	private int numeroConta;
	private String dono;
	private String tipoConta;
	private double saldo;

	public void estadoAtual() {
		System.out.println(" ");
		System.out.println("----------- Status da conta -----------");
		System.out.println("Status da conta: " + this.isStatus());
		System.out.println("Número: " + this.getNumeroConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println(" ");
	}

	public void abrirConta(String p) {
		if (this.isStatus() == true) {
			System.out.println("A conta já está aberta!");
		} else {
			System.out.println("------ Conta aberta com sucesso! ------");
			this.setStatus(true);
		}
	}

	public void fecharConta() {
		if (this.isStatus()) {
			if (this.getSaldo() > 0) {
				System.out.println("A conta possui dinheiro, retire para fechar a conta!");
			} else {
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso!");
			}
		} else {
			System.out.println("Esta conta já esta fechada!");
		}
	}
	
	public void escolherConta() {
		if (this.getTipoConta().equalsIgnoreCase("cc")) {
			this.setSaldo(this.getSaldo() + 50);
		} else if (this.getTipoConta().equalsIgnoreCase("cp")) {
			this.setSaldo(this.getSaldo() + 150);
		}
	}

	public void depositar(double d) {
		if(this.isStatus() == true) {
			this.setSaldo(this.getSaldo() + d);
			System.out.println("O deposito foi efetuado com sucesso!");
		}else {
			System.out.println("Não é possível depositar! a conta está fechada!");
		}
	}

	public void sacar(double s) {
		if(this.isStatus() == true) {
			this.setSaldo(this.getSaldo() - s);
			System.out.println("O saque foi efetuado com sucesso!");
		}else {
			System.out.println("Não é possível sacar! a conta está fechada!");
		}
	}

	// CONSTRUTOR
	public contaBanco() {
		this.setStatus(false);
		this.setSaldo(0);
	}

	// GETTERS E SETTERS

	public boolean isStatus() {
		return status;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
