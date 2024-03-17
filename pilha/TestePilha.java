import java.util.Scanner;
public class TestePilha {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("digite uma palavra: ");
        String palavra = scanner.next();

        Pilha p = new Pilha(palavra.length());
        for (int i=0; i<palavra.length(); i++) {
            p.push(palavra.charAt(i));
            System.out.println (p);
        }
        System.out.println("-------------------");
        while (!p.estaVazia()) {
            System.out.println ("pop: " + p.pop());
            System.out.println (p);
        }
    }
}