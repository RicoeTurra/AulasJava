package aula21072parte;

public class Pessoa {
    private String nome;
    private int idade;

    // Getter do nome
//    public String getNome() {
//        // return nome;
//    }

    public String getNome() {
        if (nome.toLowerCase().contains("a")) {
            System.out.println("Nome inválido (contém a letra 'a').");
            return null;

        }
            if (nome.toLowerCase().contains("a")) {
                System.out.println("Nome inválido (contém a letra 'b').");
                return null;
        }
        return nome;
    }

    // Setter do nome
    public void setNome(String nome) {
        // nome = nome
        this.nome = nome;
    }

    // Getter da idade
    public int getIdade() {
        return idade;
    }

    // Setter da idade
    public void setIdade(int idade) {
        if (idade >= 25) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }

        if (nome.matches(".*\\d.*")) { // contém números?
            System.out.println("Nome inválido: não deve conter números.");
            return;
        }

        this.nome = nome;

    }
}
