package br.com.lucs.conta;


public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	
	public Conta(int numero, float saldo, float limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	/**
	 * Método para sacar
	 * @param valor a ser sacado 
	 * 
	 */
	public void sacar(float valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso");
		} else if(valor <= (this.saldo + this.limite)) {
			//calculando o valor excedente do saque
			//100 - 200 -> 100
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			// val_ret = this.limite - val_ret
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}	
	
	
	private float getSaldo() {
		return this.saldo;
	}


}
