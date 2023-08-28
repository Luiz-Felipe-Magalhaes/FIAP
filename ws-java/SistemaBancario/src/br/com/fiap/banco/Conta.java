package br.com.fiap.banco;

import java.io.Serializable;

public class Conta implements Serializable {

    //Atributos
    private int agencia;
    private int numero;
    private double saldo;

    //Getters and Setters
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Constructors
    public Conta() {
    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    //Methods
    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente!");
        }
        else {
            saldo -= valor;
        }
    }
    public String getSaldoConta() {
       return String.format("Agencia:%d | Conta:%d | Saldo: R$%.2f", agencia, numero, saldo);
    }
}
