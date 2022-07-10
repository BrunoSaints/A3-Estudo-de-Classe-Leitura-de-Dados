import java.util.Scanner;
public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int entradaInt = scan.nextInt();
        System.out.print("Digite um valor real: ");
        double entradaDouble = scan.nextDouble();
        System.out.print("Digite um valor lógico: ");
        boolean entradaBoolean = scan.nextBoolean();
        System.out.print("Digite uma palavra: ");
        String entradaPalavra = scan.next();
    }
}