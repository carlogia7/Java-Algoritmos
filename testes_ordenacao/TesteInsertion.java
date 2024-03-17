import java.util.Random; 
import java.util.Date;

public class TesteInsertion {
  // Codigo que gera um vetor aleatorio
  static void geraVetor (int[] v) {
    Random r = new Random();
    for (int i = 0; i < v.length; i++) {
      v[i] = r.nextInt(v.length * 10);
    }
  }
  // Codigo de ordenacao tipo Insercao
  static void insertionSort (int[] v) {
    int i;
    for (int j=0; j<v.length; j++) {
      int chave = v[j];
      for (i=j-1; (i >= 0) && (v[i] > chave); i--) {
        v[i + 1] = v[i];
      }
      v[i+1] = chave;
    }
  }
  // codigo de execucao de testes
  public static void main(String args[]) {
    // TAMANHO do vetor a ser testado
    int tamanho = 2560000;
    int[] v = new int[tamanho];
    // loop de testes (20) que o codigo vai fazer com o vetor gerado
    for (int i = 1;  i <= 5; i++) {
      geraVetor(v);
      long inicio = new Date().getTime();
      insertionSort(v);
      long fim = new Date().getTime();
      // Exibe quanto tempo o processo demorou
      System.out.println ((fim - inicio));
    }
  }
}