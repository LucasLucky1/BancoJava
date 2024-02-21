import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //inicializando scanner

        double saldoInicial = 2500.00;

        //Captando nome do banco e do cliente
        System.out.println("Olá, qual seu nome?");
        String nomeCliente = scanner.nextLine();
        System.out.println("Qual o nome do seu banco?");
        String nomeBanco = scanner.nextLine();
        System.out.println("Bem vindo ao Banco "+nomeBanco + ", " + nomeCliente);

        //configurando mensagem de boas vindas
        java.lang.String welcomeMessage = String.format("""
                ***********************
                Dados iniciais do cliente:
                                
                Nome: %s
                Tipo conta: Corrente
                Saldo inicial: R$ %f
                ***********************
                                
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """,nomeCliente,saldoInicial);

        System.out.println(welcomeMessage);
//        int opcaoSelecionada = scanner.nextInt();


    }
}