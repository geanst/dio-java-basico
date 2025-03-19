import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência !");
            int userAgencia = scanner.nextInt();
            System.out.println("Por favor, digite o número da Conta !");
            String userAccount = scanner.next();
            System.out.println("Por favor, digite o seu nome !");
            String userName = scanner.next();
            System.out.println("Por favor, digite o saldo da conta !");
            float userBalance = scanner.nextFloat();

            System.out.println("Olá " + userName + ", obrigado por criar uma conta em nosso banco, sua agência é " + userAgencia + ", conta " + userAccount + " e seu saldo " + userBalance + " já está disponível para saque");
        }
    }
}