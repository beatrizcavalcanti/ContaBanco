import java.util.Scanner;

public class Banco{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


            int numeroConta; //pega o número da agencia do cliente 
            String agencia, nomeCliente;
            double saldo;



        System.out.println("Olá, Por favor, digite o seu nome! ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da conta! ");
        numeroConta = sc.nextInt();

        sc.nextLine(); // Consumindo a quebra de linha pendente

        System.out.println("Por favor, digite o número da Agência! ");
        agencia = sc.nextLine();  
        
        System.out.println("Por favor, digite o seu saldo! ");
        saldo = sc.nextDouble();


        System.out.println("Seja bem-vindo " + nomeCliente + "! Obrigado por criar uma conta em nosso banco! sua agência é " + agencia + " conta " + numeroConta + " e o seu saldo R$ " + saldo + " já está disponível para saque!");
    }
}