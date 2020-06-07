import java.util.Random;
public class TabelaHash {
    private int colisao;
    private final NodeTabela[] tabela;

    public TabelaHash(int tam) {
        this.tabela = new NodeTabela[tam];
        this.colisao = 0;
        vazia();
        preencher();

    }
    public void insere(int chave){//insere a chave na tabela
        int key = chave % tabela.length;
        if (tabela[key].getInfo() == -1){
            tabela[key] = new NodeTabela(chave);
        }
        else{
            tabela[key].setLista(chave);
            this.colisao++;
        }
    }
    public void preencher(){
    Random aleat = new Random();
    float ind = 0;
    while (ind < tabela.length * 0.9){
        for(int i = 0; i < 100; i++){//indice valido de 100 posições
            insere(aleat.nextInt(1000000));
        }
        for (NodeTabela node: tabela){
            if(node.getInfo() != -1){
                ind++;
            }
        }
    }
    }
    public void vazia(){
        for (int i = 0; i<tabela.length; i++){
            tabela[i] = new NodeTabela(-1);
        }
    }
    public void mostrar(){
        for (int i = 0; i < tabela.length; i++){
            System.out.println(i + " " + tabela[i].getInfo() + "|");
            tabela[i].getLista().imprimir();
        }
    }
    public boolean busca(int chave){//true caso exista na tabela e false caso o elemento não exista na tabela
        int key = chave %tabela.length;
        if(tabela[key].getInfo() != -1){
            if(tabela[key].getInfo() == chave){
                return true;
            }
            else{
                return tabela[key].getLista().getNode(chave) != null;
            }
        }
        return false;
    }
}
