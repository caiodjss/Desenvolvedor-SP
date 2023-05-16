import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        
        if (verificarFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
    
    public static boolean verificarFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }
        int anterior = 0;
        int atual = 1;
        
        while (atual <= numero) {
            int proximo = anterior + atual;
            if (proximo == numero) {
                return true;
            }
            anterior = atual;
            atual = proximo;
        }
        return false;
    }
}