import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random r = new Random();
        ArvoreBinariaDeBusca abb = new ArvoreBinariaDeBusca();
        for (int i=1; i<=12; i++) {
            int n = r.nextInt(100);
            System.out.print(n + " ");
            abb.insere(n);
        }
        System.out.println("\n\n" + abb);
    }
}