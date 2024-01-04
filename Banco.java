import java.util.Scanner;

// objetivo: pegar dados do cliente (nome, agencia, número da conta e saldo) e retornar esses dados organzados.
public class Banco{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            // Declaração das variáveis

            int numeroConta;
            String agencia, nomeCliente;
            double saldo;


        // Solicitação do nome do cliente
        System.out.println("Olá, Por favor, digite o seu nome! ");
        nomeCliente = sc.nextLine();

        // Solicitação do número da conta
        System.out.println("Por favor, digite o número da conta! ");
        numeroConta = sc.nextInt();

        sc.nextLine(); // Consumindo a quebra de linha pendente

        // Solicitação do número da agência
        System.out.println("Por favor, digite o número da Agência! ");
        agencia = sc.nextLine();  
        
        // Solicitação do saldo
        System.out.println("Por favor, digite o seu saldo! ");
        saldo = sc.nextDouble();

        // Mensagem de boas-vindas e informações da conta
        System.out.println("Seja bem-vindo " + nomeCliente + "! Obrigado por criar uma conta em nosso banco! sua agência é " + agencia + " conta " + numeroConta + " e o seu saldo R$ " + saldo + " já está disponível para saque!");
    }
}