import java.util.Scanner;
import java.util.Random;
import java.util.Date;
public class TesteVetores {
    static void geraVetor (int[] v) {
        Random random = new Random();
        for (int i=0; i < v.length; i++) 
            v[i] = random.nextInt(10*v.length);
    }
    static void exibeVetor (String msg, int[] v) {
        System.out.println("\n" + msg);
        for (int i=0; i<v.length; i++) 
            System.out.print (v[i] + " ");
        System.out.println();
    }
    static void bubbleSort(int[] v) {
        for (int i=1; i < v.length; i++) {
            for (int j=0; j < v.length - i; j++) {
                if (v[j] > v[j+1]) {
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
    //adaptar as buscas para devolver o contador de iterações também
    //teremos um vetor de resultados:
    // -> posição 0 contém o resultado da busca
    // -> posição 1 contém o contador de iterações
    static int[] buscaSimples (int x, int[] v) {
        int[] result = new int[2];
        result[1]=0;
        for (int i=0; i<v.length; i++) {
            result[1]++;
            if (x == v[i]) {
                result[0] = i;
                return result;
            }
        }
        result[0] = -1;
        return result;
    }

    static int[] buscaBinaria (int x, int[] v) {
        int inicio = 0;
        int fim = v.length - 1;
        int[] result = new int[2];
        result[1] = 0;
        while (inicio <= fim) {
            result[1]++;
            int meio = (inicio + fim) / 2;
            if (x == v[meio]) {
                result[0] = meio;
                return result;
            }
            if (x > v[meio])
                inicio = meio + 1;
            else 
                fim = meio -1;
        }
        result[0] = -1;
        return result;
    }
    public static void main (String[] args) {
        int v[], n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print ("\ndigite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n > 0) {
                System.out.print ("\ndigite o elemento para busca: ");
                int x = scanner.nextInt();
                v = new int[n];
                geraVetor(v);
                //exibeVetor("vetor gerado:", v);
                int[] result = buscaSimples(x, v);
                if (result[0] == -1)
                    System.out.println ("\n" + x + " nao encontrado pela busca simples");
                else 
                    System.out.println ("\n" + x + " encontrado pela busca simples na posicao " + result[0]);
                System.out.println ("\nA busca simples realizou " + result[1] + " iteracoes");
                long inicio = new Date().getTime();
                bubbleSort(v);
                long fim = new Date().getTime();
                System.out.println ("demorou " + (fim - inicio) + " ms");
                //exibeVetor("vetor ordenado pelo bubble:", v);
                result = buscaBinaria (x, v);
                if (result[0] == -1) 
                    System.out.println ("\n" + x + " nao encontrado pela busca binaria");
                else
                    System.out.println ("\n" + x + " encontrado pela busca binaria na posição " + result[0]);
                System.out.println ("\nA busca binaria realizou  " + result[1] + " iteracoes");
            }
        } while (n>0);
    }
}