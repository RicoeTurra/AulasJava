package aula2107;

public class main {// Metodo Main para a saída do programa
    public static void main(String[] args) {
        ArquitetoInterior arquiteto01 = new ArquitetoInterior();

        arquiteto01.imprimirProfissao();
        arquiteto01.queEuFaco();
        arquiteto01.imprimirModalidade();

        EngenheiroCivil engenheiro01 = new EngenheiroCivil();

        engenheiro01.imprimirProfissao();
        engenheiro01.queEuFaco();
        engenheiro01.imprimirModalidade();

    }
}
