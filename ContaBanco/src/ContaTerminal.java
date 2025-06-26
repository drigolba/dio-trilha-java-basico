import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String nome ="", agencia="";
        int n1;
        float saldo;
        
        System.out.println("Por favor, qual o seu nome?");
        nome=scan.nextLine();

        System.out.println("Agora, informe o número da sua agência?");
        agencia=scan.nextLine();

        System.out.println("E o número de sua conta, qual é?");
        n1=scan.nextInt();

        System.out.println("Por fim, informe seu saldo.");
        saldo=scan.nextFloat();

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco! Sua agência é: %s, conta: %d e seu saldo de %.2f já está disponível para saque.", nome, agencia, n1, saldo);
    }
}
