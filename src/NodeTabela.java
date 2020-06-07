public class NodeTabela {
    private int informacao;
    private ListaEncadeada lista;

    public NodeTabela(int informacao) {
        this.informacao = informacao;
        this.lista = new ListaEncadeada();
    }
    public void setLista(int informacao) {
        lista.insereOrdenado(informacao);
    }

    public int getInfo() {
        return informacao;
    }

    public ListaEncadeada getLista() {
        return lista;
    }
}
