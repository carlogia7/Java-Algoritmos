// import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numCasos = scanner.nextInt();
        
        for (int i = 0; i < numCasos; i++) {
            
            int numTrocas = 0;
            int numVagoes = scanner.nextInt();
            int[] vagoes = new int[numVagoes];
            
            for (int j = 0; j < numVagoes; j++) {
                vagoes[j] = scanner.nextInt();
            }
            
            // Método Insert
            for (int j = 1; j < numVagoes; j++) {
                int temp = vagoes[j];
                int k = j - 1;
                while (k >= 0 && vagoes[k] > temp) {
                    vagoes[k + 1] = vagoes[k];
                    k--;
                    numTrocas++;
                }
                vagoes[k + 1] = temp;
            }
            
            System.out.println("Optimal train swapping takes " + numTrocas + " swaps.");
        }
        
        scanner.close();
    }
}