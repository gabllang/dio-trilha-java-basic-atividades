import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Por favor, digite o seu número");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite seu nome:");
            String cliente = scanner.next();

            double saldo = 120;

            System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está dispobível para saque");
    }
}
