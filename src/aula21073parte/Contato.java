package aula21073parte;
//Proteger os dados usando private e acessar com métodos get e set.
//Evita que informações inválidas entrem no sistema.
public class Contato {
    private String nome;
    private String telefone;
    private String email;

    // SETTER DO NOME
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido: vazio.");
            return;
        }
        // Verifica se o nome contém apenas letras e espaços
        if (!nome.matches("[a-zA-ZÀ-ÿ\\s]+")) {
            System.out.println("Nome inválido: deve conter apenas letras.");
            return;
        }
        this.nome = nome;
    }

    // GETTER DO NOME
    public String getNome() {
        return nome;
    }

    // SETTER DO TELEFONE Verifica se o telefone é null ou não tem 10 ou 11 dígitos numéricos (como "11999998888").
    public void setTelefone(String telefone) {
        if (telefone == null || !telefone.matches("\\d{10,11}")) {
            System.out.println("Telefone inválido: deve conter 10 ou 11 dígitos.");
            return;
        }
        this.telefone = telefone;
    }

    // GETTER DO TELEFONE
    public String getTelefone() {
        return telefone;
    }

    // SETTER DO EMAIL Verifica se o email contém @ e .
    public void setEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println("Email inválido.");
            return;
        }
        this.email = email;
    }

    // GETTER DO EMAIL
    public String getEmail() {
        return email;
    }

}
