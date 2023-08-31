import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // só pra deixar um espaço em branco e ficar esteticamente mais agradavel
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Olá, bem vindo ao atendimento automatico da DGBank! ");
            System.out.println("Por favor, digite o seu número: ");
            int numero = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Por favor, digite o número da agência: ");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o seu nome: ");
            String nomeCliente = scanner.nextLine();

            // não sei se era para botar o saldo como questionario também eu não
            // mas imaginei que não fosse, pois ficaria menos "realista", mas caso for par botar, aqui está o codigo
            /*
             *          System.out.print("Por favor, digite o saldo da conta: ");
             *           double saldo = scanner.nextDouble();
             * 
            */
            double saldo = 350.00;
            // minha fatura da nubank kkkkkkkkk

            System.out.println(" ");
            System.out.println(" ");

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // ouvi de um amigo que é uma boa pratica fechar o scanner quando acabo de usá-lo, por varias razões
        scanner.close();
    }
}
