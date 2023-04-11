import java.util.ArrayList;
import java.util.Scanner;

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
                    //Pessoa cliente1 = new Pessoa();

                    //CRIAR CLIENTE
                    System.out.println("Insira o nome do cliente:");
                    String nome = sc.next();

                    //CRIAR CPF
                    System.out.println("Insira o CPF:");
                    String cpf = sc.next();

                    Pessoa cliente2 = new Pessoa(nome, cpf);
                    cliente2.add(clientes);


                    //--------------------------------------------------------------------------------------------------------------------------

//                Banco conta1 = new Banco();
//
//                conta1.cliente = cliente1;
//
//                //CONTA
//                System.out.println("Insira o numero da conta:");
//                int numConta1 = sc.nextInt();
//                conta1.numeroConta = numConta1;


                    break;
                case 2:
                    Banco conta1 = new Banco();

                    //CADASTRANDO CONTA
                    System.out.println("Insira o numero da conta:");
                    int numConta1 = sc.nextInt();
                    conta1.numeroConta = numConta1;

                    System.out.println("Insira o saldo inicial da conta:");
                    double saldo1 = sc.nextDouble();
                    conta1.saldo = saldo1;

                    System.out.println("Informe o CPF do titular da conta:");
                    String cpfDeAlguem = sc.next();

                    conta1.add(contas);


                    //Pessoa titular = null;
                    Pessoa titular;

                    for (Pessoa c : clientes) {         //clientes é o ARRAY QUE AINDA CRIAREMOS
                        if (c.equals(cpfDeAlguem)) {
                            titular = c;
                            break;
                        }
                    }

                    break;
                case 3:
                    System.out.println("Informe o numero da conta: ");
                    int contaA1 = sc.nextInt();


                    //BUSCAMOS A CONTA
                    for (Banco d : contas) {
                        if (d.equals(contaA1)) {
                            //ACHAMOS A CONTA
                            System.out.println(d.saldo);
                            System.out.println("Conta confirmada");
                        } else {
                            System.out.println("A conta informada não existe");
                        }
                    }


                    break;
                case 4:
                    break;

                case 5:
                    System.out.println("Informe o numero da conta:");
                    int numDaConta = sc.nextInt();

                    break;


            }
        }
    }
}