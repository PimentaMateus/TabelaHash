public class TabelaHash {
    private int colisao;
    private final NodeTabela[] tabela;

    public TabelaHash(int tam) {
        this.tabela = new NodeTabela[tam];
        //this.colisao = colisao;
    }
}
