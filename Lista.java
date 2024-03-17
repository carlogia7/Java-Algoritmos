
public class Lista {
    private No primeiro;
    
    public Lista() {
        this.primeiro = null;
    }
    
    public void adicionar(int valor) {
        No novoNo = new No(valor);
        
        if (this.primeiro == null) {
            this.primeiro = novoNo;
        } else {
            No ultimoNo = this.primeiro;
            while (ultimoNo.proximo != null) {
                ultimoNo = ultimoNo.proximo;
            }
            ultimoNo.proximo = novoNo;
        }
    }
    
    public void exibir() {
        No noAtual = this.primeiro;
        while (noAtual != null) {
            System.out.print(noAtual.valor + " ");
            noAtual = noAtual.proximo;
        }
        System.out.println();
    }
}