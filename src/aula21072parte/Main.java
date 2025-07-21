package aula21072parte;

public class Main {
    public static void main(String[] args) {
        //
        Pessoa p1 = new Pessoa();
        p1.setNome("123");
        p1.setIdade(20);
        //
        Pessoa p2= new Pessoa();
        p2.setNome("Beto");
        p2.setIdade(25);
        //

        //
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());


    }
}

