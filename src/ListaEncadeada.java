public class ListaEncadeada{
    private  Node Lista;
    public String result = "";
    public  ListaEncadeada(){
        Lista = null;
    }
    public Node getLista(){
        return Lista;
    }
    public boolean vazia(){
        return Lista == null;
    }
    public void inserePrimeiro(int info){
        Node novoE = new Node(info);
        if (!vazia()) {
            novoE.setProximo(Lista);
        }
        Lista = novoE;
    }

    public  void insereDepois(Node node, int info){
        if(!vazia()){
            Node novoE = new Node(info);
            novoE.setProximo(node.getProximo());
            node.setProximo(novoE);}
        else inserePrimeiro(info);
    }
    public void insereUltimo(int info){
        Node aux;
        aux = Lista;
        if (!vazia()){
            Node novoE = new Node(info);

            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novoE);
        }
        else inserePrimeiro(info);
    }
    public void insereOrdenado(int info){
        Node aux = Lista;
        Integer temp = null;
        if(!vazia()){
            while (aux != null) {
                if (aux.getInfo() < info) {
                    temp = aux.getInfo();
                    aux = aux.getProximo();
                }
                else {
                    if (info < aux.getInfo()) {
                        inserePrimeiro(info);
                    }
                    else {
                        insereDepois(getNode(temp), info);
                    }
                    return;
                }
            }
        }
        inserePrimeiro(info);
    }

    public void imprimir(){

        if(Lista == null){
            System.out.println("Lista Vazia \n");
        }
        else{
            Node aux = Lista;
            while(aux != null){
                Integer newInfo = aux.getInfo();
                aux = aux.getProximo();
                result = result + " " + newInfo;//mudança na formatação
            }
            System.out.println("Infos " + result + "\n");
        }
    }
    public Node removePrimeiro() {
        Node aux = Lista;
        Lista = aux.getProximo();
        return aux;
    }

    public Node removeUltimo() {
        Node aux = Lista;
        Node ref = aux;
        if(!vazia()){
            while (aux.getProximo() != null) {
                ref = aux;
                aux = aux.getProximo();
            }
            ref.setProximo(null);}
        return aux;

    }

    public Node remove(Node node) {
        Node aux = Lista;
        while (aux.getProximo() != node) {
            aux = aux.getProximo();
        }
        aux.setProximo(node.getProximo());
        return aux;
    }
    public Node getNode(int info) {
        Node aux = Lista;
        while (aux.getProximo() != null) {
            if (aux.getInfo() == info) return aux;
            aux = aux.getProximo();
        }
        return null;
    }

}