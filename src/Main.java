import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //inicializando scanner

        double saldo = 2500.00;


        //Captando nome do banco e do cliente
        System.out.println("Olá, qual seu nome?");
        String nomeCliente = scanner.nextLine();
        System.out.println("Qual o nome do seu banco?");
        String nomeBanco = scanner.nextLine();
        System.out.println("Bem vindo ao Banco "+nomeBanco + ", " + nomeCliente);

        //configurando mensagem de boas vindas
        String welcomeMessage = String.format("""
                ***********************
                
                Nome: %s
                Tipo conta: Corrente
                Saldo: R$ %f
                ***********************
                                
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """,nomeCliente,saldo);

//        String shortMessage = String.format("""
//
//
//                ***********************
//                Operações
//
//                1- Consultar saldos
//                2- Receber valor
//                3- Transferir valor
//                4- Sair
//
//                ***********************
//                """,saldo);


        int opcaoSelecionada = 0;

        while(opcaoSelecionada !=4){
            System.out.println(welcomeMessage);
            opcaoSelecionada= scanner.nextInt();

            if(opcaoSelecionada == 1){
                System.out.println("Você tem $" + saldo + " de saldo.");





            }else if(opcaoSelecionada == 2) {
                System.out.println("Quanto você irá receber?");
                double recebimento = scanner.nextDouble();
                saldo=saldo+recebimento;
                System.out.println("Você tem $" + saldo + " de saldo.");



            }else if(opcaoSelecionada == 3) {
                System.out.println("Quanto você irá transferir?");
                double transferencia = scanner.nextDouble();
                saldo=saldo-transferencia;
                System.out.println("Você tem $" + saldo + " de saldo.");



            }else if(opcaoSelecionada == 4) {
                System.out.println("Obrigado por usar nosso banco!");
                break;
            //condicional relativa a quaisquer outras entradas inválidas
            }else{
                System.out.println("Entrada Inválida, digite novamente uma opção.");
            }

        }


    }
}