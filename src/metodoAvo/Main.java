package metodoAvo;

public class Main {
    public static void main(String[] args) {
        CRC profissional1 = new Contador("Maria", 5);
        CRC profissional2 = new AnalistaFiscal("João", 3);

        // Para acessar imprimirNome(), precisamos fazer cast ou definir na interface (aqui usaremos cast)
        ((Contador) profissional1).imprimirNome();
        profissional1.imprimirDescricao();
        profissional1.executarAtividade();

        System.out.println("---");

        ((AnalistaFiscal) profissional2).imprimirNome();
        profissional2.imprimirDescricao();
        profissional2.executarAtividade();
    }
}


