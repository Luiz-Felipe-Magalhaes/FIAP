package br.com.fiap.banco;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaCorrente = new Conta();
        contaCorrente.deposito(50.0);
        contaCorrente.setAgencia(123);
        contaCorrente.setNumero(4567);

        contaCorrente.deposito(1000);

        System.out.println(contaCorrente.getSaldoConta());

        contaCorrente.getSaldoConta();

        Conta contaPoupanca = new Conta(999, 1234, 1000);
        contaPoupanca.saque(500);

        System.out.println(contaPoupanca.getSaldoConta());

    }

}
