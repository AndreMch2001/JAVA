import java.util.Scanner;
public class Exercicio_01 {
    public static void exercicio05(String[] args) {
        
        // Cria um scanner para ler a entrada do usuário
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Declaração dos vetores e variáveis auxiliares
            int[] vetor = new int[5];
            int[] vetorSemRepetidos = new int[5];
            int contador = 0;
            boolean repetido;
            // Entrada de dados: Lê 5 números inteiros do usuário
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite o " + (i + 1) + "° número: ");
                vetor[i] = scanner.nextInt();
            }   // Exibe os números digitados pelo usuário
            System.err.println("Os números digitados foram:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }   System.out.println("");
            // Processamento: Remove números repetidos
            for (int i = 0; i < vetor.length; i++) {
                repetido = false;
                for (int j = 0; j < contador; j++) {
                    if (vetor[i] == vetorSemRepetidos[j]) {
                        repetido = true;
                        break;
                    }
                }
                
                // Adiciona o número ao vetorSemRepetidos se ele não for repetido
                if (!repetido) {
                    vetorSemRepetidos[contador] = vetor[i];
                    contador++;
                }
            }   // Exibe os números únicos
            System.out.println("Os números que não se repetem são: ");
            for (int k = 0; k < contador; k++) {
                System.out.print(vetorSemRepetidos[k] + " ");
            }   System.err.println("");
            // Exibe a quantidade total de números únicos
            System.err.println("Total de números que não se repetem: " + contador);
            // Fecha o scanner
        }
    }
}