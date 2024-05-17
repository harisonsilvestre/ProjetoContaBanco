import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)   {
       
        Scanner input =new Scanner (System.in);
        System.out.println("Bem vindo a Central bancária, por favor, preencha os dados solicitados.");

        System.out.println("nome usuário: ");
        String nomeUsuario=Scanner.next();

        System.out.println("insira o número da conta: ");
        int numeroConta=Scanner.nextint();

        System.out.println("insira a agência: ");
        String numeroAgencia=Scanner.next();

        System.out.println("saldo: ");
        Double saldo=Scanner.nextDouble();

        System.out.println("\"Olá "+nomeUsuario+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");

        System.out.println("conta criada com sucesso!");

    }
}
