import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Random r = new Random();
        Fila f = new Fila();
        // while (!f.estaCheia()) {
        //     f.enfileira(r.nextInt(10));
        //     System.out.println(f);
        // }
        do {
            if (r.nextInt(2) == 0) { //par - enfileira
                if (!f.estaCheia())
                    f.enfileira(r.nextInt(10));
            }
            else { //impar - desenfileira
                if(!f.estaVazia())
                    System.out.println(f.desenfileira() + " foi atendido");
            }
            System.out.println(f + " // ");
            System.out.println(f.oVetor());
        } while (!f.estaVazia());
    }
}
