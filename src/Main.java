import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho da tabela: ");
        int tam = scanner.nextInt();
        TabelaHash hash = new TabelaHash(tam);
        hash.mostrar();
        System.out.println("Chave: ");
        int chave = scanner.nextInt();
        while (chave != -1){
            if(hash.busca(chave)){
                //se retornar true
                System.out.println("Chave existe");
            }
            else System.out.println("Chave inexistente");
            System.out.println("Digite outra chave ou pare com -1");
            chave = scanner.nextInt();
        }
    }

}
