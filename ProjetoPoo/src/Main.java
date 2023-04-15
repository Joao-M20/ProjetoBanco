import java.util.ArrayList;
import java.util.Scanner;

/*
    Ivan João Quispe Mayta - RGM 29747511
    Rafael -
 */

public class Main {
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in);

        ArrayList<Banco> contas = new ArrayList<Banco>();
        ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();

        boolean flag = true;

        while (flag) {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Cadastrar Cliente \n2 - Cadastrar Conta \n3 - Consultar Saldo \n4 - Exibir todas as contas cadastradas \n5 - Sacar Dinheiro \n6 - Depositar Dinheiro\n7 - Sair");
            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:

                    //CRIAR CLIENTE
                    System.out.println("Insira o nome do cliente:");
                    String nome = sc.next();

                    //CRIAR CPF
                    System.out.println("Insira o CPF:");
                    String cpf = sc.next();

                    Pessoa cliente1 = new Pessoa(nome, cpf);
                    clientes.add(cliente1);

                    break;
                case 2:

                    //CADASTRANDO CONTA
                    System.out.println("Insira o numero da conta:");
                    int numConta1 = sc.nextInt();

                    //INSERINDO UM SALDO INICIAL
                    System.out.println("Insira o saldo inicial da conta:");
                    double saldo1 = sc.nextDouble();

                    //INFORMANDO O CPF DO CLIENTE, PARA VINCULAR AO BANCO
                    System.out.println("Informe o CPF do titular da conta:");
                    String cpfDeAlguem = sc.next();


                    Pessoa titular = null;

                    //Pessoa titular = null;

                    for (Pessoa c : clientes) {       
                        if (c.equals(cpfDeAlguem)) {
                            titular = c;
                            break;
                        }
                    }

                    Banco umaConta = new Banco(titular, numConta1,saldo1);
                    contas.add(umaConta);


                    break;
                case 3:
                    System.out.println("Informe o numero da conta: ");
                    int contaA1 = sc.nextInt();


                    //BUSCANDO A CONTA
                    for (Banco d : contas) {
                        if (d.numeroConta == contaA1) {
                            //ACHAMOS A CONTA
                            System.out.println("Conta confirmada");
                            System.out.println("Seu saldo é " + d.saldo);
                        } else {
                            System.out.println("A conta informada não existe");
                        }
                    }

                    break;
                case 4:

                    System.out.println("Contas Cadastradas: ");
                    for (Banco todasContas : contas){
                        System.out.println(todasContas.numeroConta);
                    }
                    break;

                case 5:
                    System.out.println("Informe o numero da conta:");
                    int numDaConta = sc.nextInt();

                    for (Banco b : contas) {
                        if (b.numeroConta == numDaConta) {
                            Banco conta = b;
                            System.out.println("Insira o valor a ser sacado:");
                            int valorRetirar = sc.nextInt();

                            if (valorRetirar > conta.saldo) {
                                System.out.println("Saldo insuficiente");
                                break;
                            } else {
                                conta.sacar(valorRetirar);
                                System.out.println("Saldo atual, apos o saque: " + conta.saldo);
                            }
                        }
                    }

                    break;

                case 6:
                    System.out.println("Digite o numero da conta");
                    int numContaDeposito = sc.nextInt();


                    for(Banco banco : contas) {
                        if (banco.numeroConta == numContaDeposito){
                            System.out.println("Informe o valor para depósito: ");
                            int valorDeposito = sc.nextInt();

                            banco.depositar(valorDeposito);
                            System.out.println("Saldo da conta apos o deposito: " + banco.saldo);
                        } else {
                            System.out.println("A conta informada não existe");
                        }
                    }

                    break;
                case 7:
                    System.out.println("Obrigado por utilizar nosso sistema");
                    flag = false;
                    break;


            }
        }
    }
}
