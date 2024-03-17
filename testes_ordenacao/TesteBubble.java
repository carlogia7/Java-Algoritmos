import java.util.Random; 
import java.util.Date;

public class TesteBubble {
  //Código que gera um vetor aleatório
  static void geraVetor (int[] v) {
    Random r = new Random();
    for (int i = 0; i < v.length; i++) {
      v[i] = r.nextInt(v.length * 10);
    }
  }
  //Código de ordenação tipo Bubble
  static void bubbleSort (int[] v) {
    for (int i=1; i<v.length; i++) {
      for(int j=0; j<v.length-i; j++) {
        if(v[j] > v[j+1]) { 
          int temp= v[j];
          v[j] = v[j+1];
          v[j+1] = temp; }}}
  
  }
  //Código de execução de testes
  public static void main(String args[]) {
    //tamanho do vetor a ser testado
    int tamanho = 2560000;  
    int[] v = new int[tamanho];
    //loop de testes (20) que o codigo vai fazer com o vetor gerado
    for (int i = 1;  i <= 5; i++) {
      geraVetor(v);
      long inicio = new Date().getTime();
      bubbleSort(v);
      long fim = new Date().getTime();
      //Exibe quanto tempo o processo demorou
      System.out.println ((fim - inicio));
    }
  }
}