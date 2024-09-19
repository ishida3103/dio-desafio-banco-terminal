import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
    
}