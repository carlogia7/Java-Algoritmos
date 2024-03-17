public class ArvoreBinariaDeBusca {
    private class NoBinario {
        private int info;
        private NoBinario esq;
        private NoBinario dir;

        public NoBinario(int info) {
            this.info = info;
        }

        public int getInfo() {
            return info;
        }
        public void setInfo(int info) {
            this.info = info;
        }
        public NoBinario getEsq() {
            return esq;
        }
        public void setEsq(NoBinario esq) {
            this.esq = esq;
        }
        public NoBinario getDir() {
            return dir;
        }
        public void setDir(NoBinario dir) {
            this.dir = dir;
        }
        @Override
        public String toString() {
            return "[" + info + "]";
        }
        
        
    }
    private NoBinario raiz;
    //construtor padrão -> "zera" a raiz
    //get e set não são necessários pois não é de interesse informara raiz
    public void insere (int n) {
        NoBinario novo = new NoBinario(n);
        //recebe a referencia do novo nó criado
        if (raiz == null)
            raiz = novo;
        //se não busca a raiz
        else 
            insereRec (novo, raiz);

    }
    //interessa pra classe só por ser procedimento interno
    //não tem return nenhum = void (? pesquisar)
    private void insereRec (NoBinario novo, NoBinario atual) {
        //checagem do ponto de inserção
        if (novo.getInfo() <= atual.getInfo()) { //vai para esquerda
            if (atual.getEsq() == null) //se for nulo encaixa ai mesmo
                atual.setEsq(novo);
            else //fazer busca recursiva a partir do ponto da esquerda
                insereRec(novo, atual.getEsq());

        }
        else { //vai para direita
            if (atual.getDir() == null) //se for nulo encaixa ai mesmo
                atual.setDir(novo);
            else
            insereRec(novo, atual.getDir()); //fazer busca recursiva a partir do ponto da direita
        }
    }
    //quando sobrescreve método vc ta fazendo um polimorfismo pois a classe vai se comportar do jeito dela
    @Override 
    public String toString () {
        //se raiz for nula devolve árvore vazia
        if (raiz == null)
            return "arvore vazia";
            //se não devolve árvore recursiva
        else 
            return toStringRec (raiz);
    }
    private String toStringRec (NoBinario atual) {
        if (atual != null) {
            return toStringRec(atual.getEsq()) + atual + toStringRec (atual.getDir());
        }
        return "";
    }

}