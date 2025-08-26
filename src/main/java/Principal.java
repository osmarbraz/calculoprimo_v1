
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        //Objeto para leitura dos dados
         Scanner leitor = new Scanner(System.in);

        // Entrada do intervalo
        System.out.print("Digite o valor inicial: ");
        int inicio = leitor.nextInt();

        System.out.print("Digite o valor final: ");
        int fim = leitor.nextInt();
        
        CalculaPrimo cp = new CalculaPrimo();

        //int inicio = 10;  // Valor inicial do intervalo
        //int fim = 50;     // Valor final do intervalo

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        
        cp.exibirPrimos(inicio, fim);
    }
}
