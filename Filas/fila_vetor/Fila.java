public class Fila {
    private int primeiro;
    private int ultimo;
    private int tamanho;
    private int[] dados; //[] = vetor


    public Fila (int capacidade) {
        primeiro = 0;
        ultimo = 0;
        tamanho = 0;
        dados = new int[capacidade];

    }
    public Fila () {
        this(10);
    }
    int prox (int pos) {
        return (pos + 1) % dados.length;
    }

    //Método para inserir
    public void enfileira (int i) {
        dados[ultimo] = i;
        ultimo = prox(ultimo);
        tamanho++;
    }
    public boolean estaCheia () {
        return tamanho == dados.length;
    }
    public boolean estaVazia() {
        return tamanho == 0;
    }

    //Método para retirar    
    public int desenfileira () {
        int temp = dados[primeiro];
        primeiro = prox(primeiro);
        tamanho--;
        return temp;
    }
    @Override
    public String toString () {
        String s = "fila: ";
        if (estaVazia()) {
            s+= "vazia";
        } 
        else {
            int i = primeiro;
             do {
                s+= dados[i] + " ";
                i = prox(i);
             } while (i != ultimo);
        }   
        return s;
    }
    public String oVetor () {
        String s = "o vetor ";
        if (estaVazia()) {
            for (int i=0; i<dados.length; i++) 
                s+= "_ ";
        }
        else if (estaCheia()) {
            for (int i=0; i<dados.length; i++)
                s+= dados[i] + " ";
        }
        else if (primeiro < ultimo) {
            for (int i=0; i<primeiro; i++)
                s+= "_ ";
                for (int i=primeiro; i<ultimo; i++) 
                    s+= dados[i] + " ";
                for (int i=ultimo; i<dados.length; i++)
                    s+= "_ ";
        }
        else {
            for (int i=0; i<ultimo; i++)
                s+= dados[i] + " ";
            for (int i=ultimo; i<primeiro; i++)
                s+= " ";
            for (int i=primeiro; i<dados.length; i++)
                s+= dados[i] + " ";
        }
        return s;
    }

}