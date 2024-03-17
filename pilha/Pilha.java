public class Pilha {
    private char[] dados;
    private int topo;
    public Pilha (int capacidade) {
        dados = new char[capacidade];
        //por clareza
        topo = 0;
    }
    public boolean estaVazia() {
        return topo == 0;
    }
    public boolean estaCheia() {
        return topo == dados.length;
    }
    public char espiaTopo () {
        return dados[topo-1];
    }
    public char pop() {
        return dados[--topo];
    }
    public void push (char c){
        dados[topo++] = c;
    }
    @Override
    public String toString () {
        String s = "";
        if (estaVazia())
            s += "pilha vazia";
        else {
            for (int i=topo-1; i>=0; i--)
                s += dados[i] + "\n";
        }
        return s;
    }
}