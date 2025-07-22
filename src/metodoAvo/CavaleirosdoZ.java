package metodoAvo;

interface CRC {
    void imprimirDescricao();
    void executarAtividade();
}

// Classe Contador implementa a interface CRC diretamente
class Contador implements CRC {
    private String nome;
    private int nivelExperiencia;

    public Contador(String nome, int nivelExperiencia) {
        this.nome = nome;
        this.nivelExperiencia = nivelExperiencia;
    }

    public void imprimirNome() {
        System.out.println("Profissional: " + nome);
    }

    @Override
    public void imprimirDescricao() {
        System.out.println("Experiência nível: " + nivelExperiencia);
    }

    @Override
    public void executarAtividade() {
        System.out.println(nome + " está atendendo o imposto de renda.");
    }
}

// Classe AnalistaFiscal implementa CRC diretamente
class AnalistaFiscal implements CRC {
    private String nome;
    private int nivelExperiencia;

    public AnalistaFiscal(String nome, int nivelExperiencia) {
        this.nome = nome;
        this.nivelExperiencia = nivelExperiencia;
    }

    public void imprimirNome() {
        System.out.println("Profissional: " + nome);
    }

    @Override
    public void imprimirDescricao() {
        System.out.println("Experiência nível: " + nivelExperiencia);
    }

    @Override
    public void executarAtividade() {
        System.out.println(nome + " está analisando documentos fiscais.");
    }
}
