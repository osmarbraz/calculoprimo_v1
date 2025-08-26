
public class CalculaPrimo {

    public boolean ehPrimo(long n) {

        // Números menores que 2 não são primos.
        // 0 e 1 não são primos.
        if (n < 2) {
            return false;
        }
        // O número 2 é primo (e é o único primo par).
        // Todo número par maior que 2 não é primo.
        if (n == 2) {
            return true;
        }
        // Pares maiores que 2 não são primos
        if (n % 2 == 0) {
            return false;
        }
        // Verifica divisores de 3 até sqrt(n), apenas ímpares                                               
        // Se for divisível por qualquer um deles, não é primo.
        // Se não for divisível, então é primo.
        long limite = (long) Math.sqrt(n);
        for (int i = 3; i <= limite; i += 2) {
            if (n % i == 0) {
                return false; // encontrou divisor → não é primo
            }
        }
        return true; // não encontrou divisor → é primo
    }

    // Método que verifica e imprime os números primos entre inicio e fim
    public void exibirPrimos(long inicio, long fim) {
        for (long i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}
