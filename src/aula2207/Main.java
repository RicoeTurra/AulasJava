package aula2207;

public class Main {
    public static void main(String[] args) {
        // Criando um contato
        Pessoa contato01 = new Pessoa("Ricardo", "11952154673", "turra@gmail.com");

        // Exibindo os dados
        contato01.imprimirDados();

        System.out.println("--- Atualizando dados ---");

        // Atualizar dados
        contato01.setEmail("ricardo.turra@gmail.com");
        contato01.setTelefone("11987654321");

        // Exibindo dados atualizados
        contato01.imprimirDados();
    }

}
