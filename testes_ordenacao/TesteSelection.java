import java.util.Random; 
import java.util.Date;

public class TesteSelection {
  // Codigo que gera um vetor aleatorio
  static void geraVetor (int[] v) {
    Random r = new Random();
    for (int i = 0; i < v.length; i++) {
      v[i] = r.nextInt(v.length * 10);
    }
  }
  // Código de ordenacao tipo Selecao
  static void selectionSort (int[] v) {
    for (int fixo=0; fixo<v.length - 1; fixo++) {
      int menor = fixo;
      for (int i = menor+1; i<v.length; i++) {
        if (v[i] < v[menor]) {
          menor = i;
        }
      }
      if (menor != fixo) {
        int t = v[fixo];
        v[fixo] = v[menor];
        v[menor] = t;
      }
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
      selectionSort(v);
      long fim = new Date().getTime();
      // Exibe quanto tempo o processo demorou
      System.out.println ((fim - inicio));
    }
  }
}