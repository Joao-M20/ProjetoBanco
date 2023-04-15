import java.util.ArrayList;

public class Banco {

    Pessoa cliente;
    int numeroConta;
    double saldo;

    public Banco() {
    }

    public Banco(Pessoa cliente, int numeroConta, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

}
